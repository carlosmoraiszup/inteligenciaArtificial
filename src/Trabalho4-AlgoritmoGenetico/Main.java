package algoritmoGenetico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    static List<Tabuleiro> tabuleiros;

    public static void main(String[] args) {
        int tamanhoTabuleiro = 8;
        int tamanhoPopulacaoInicial = 5;
        int populacaoMaxima = 50;
        int maximoInteracoes = 600;
        double taxaCrossover = 0.4;
        double taxaMutacao = 0.2;
        double notaMinimaEsperada = 1; // 1 -> 0 conflitos, 0.5 -> 1 conflito, 0.33 -> 2 conflitos, 0.25 -> 3 conflitos, 0.2 -> 4 conflitos [...]

        int geracao = 0;
        double melhorNota;
        gerarPopulacaoInicial(tamanhoTabuleiro, tamanhoPopulacaoInicial);
        calcularNotas();
        Collections.sort(tabuleiros);
        do {
            crossOver(taxaCrossover);
            mutar(taxaMutacao);
            calcularNotas();
            Collections.sort(tabuleiros);
            filtrar(populacaoMaxima);
            geracao++;
            melhorNota = tabuleiros.get(0).getNota();
            System.out.println("Melhor nota geração " + geracao + ": " + melhorNota + " -> " + getTabuleiro(0));
        } while (geracao < maximoInteracoes && melhorNota < notaMinimaEsperada);
    }

    public static String getTabuleiro(int i) {
        String retorno = "";
        for (int j = 0; j < tabuleiros.get(i).getRainhas().length; j++) {
            retorno = retorno + " " + tabuleiros.get(i).getRainhas()[j];
        }
        return retorno;
    }

    public static void mutar(double taxaMutacao) {
        int qtdMutar = (int) (tabuleiros.size() * taxaMutacao);
        Random random = new Random();
        do {
            int tabuleiro = random.nextInt(tabuleiros.size() - 1) + 1;
            int coluna = random.nextInt(tabuleiros.get(tabuleiro).getRainhas().length);
            int velhaPosicaoRainha = tabuleiros.get(tabuleiro).getRainhas()[coluna];
            int novaPosicao;
            do {
                novaPosicao = random.nextInt(tabuleiros.get(tabuleiro).getRainhas().length);
                tabuleiros.get(tabuleiro).getRainhas()[coluna] = novaPosicao;
            } while (novaPosicao == velhaPosicaoRainha);
            tabuleiros.get(tabuleiro).setModificado(true);
            qtdMutar--;
        } while (qtdMutar > 0);
    }

    public static void filtrar(int populacaoMaxima) {
        if (tabuleiros.size() <= populacaoMaxima)
            return;
        do {
            tabuleiros.remove(tabuleiros.size() - 1);
        } while (tabuleiros.size() > populacaoMaxima);
    }

    public static void crossOver(double taxaCrossover) {
        List<Tabuleiro> tabuleirosTemp = new ArrayList<Tabuleiro>();
        int crossOvers = (int) (taxaCrossover * tabuleiros.size());
        int velhoTamanho = tabuleiros.size();
        double tamanhoRoleta = calcularTamanhoRoleta();
        do {
            Tabuleiro pai1 = null;
            do {
                int posPai1 = sortearCrossover(tamanhoRoleta);
                if (!tabuleirosTemp.contains(tabuleiros.get(posPai1))) {
                    pai1 = tabuleiros.get(posPai1);
                }
            } while (pai1 == null);
            tabuleirosTemp.add(pai1);
            Tabuleiro pai2 = null;
            do {
                int posPai2 = sortearCrossover(tamanhoRoleta);
                if (!tabuleirosTemp.contains(tabuleiros.get(posPai2))) {
                    pai2 = tabuleiros.get(posPai2);
                }
            } while (pai2 == null);
            tabuleirosTemp.add(pai2);
            Tabuleiro filho1 = new Tabuleiro(pai1.getRainhas().length);
            Tabuleiro filho2 = new Tabuleiro(pai1.getRainhas().length);
            for (int i = 0; i < pai1.getRainhas().length; i++) {
                if (i > pai1.getRainhas().length / 2) {
                    filho1.getRainhas()[i] = pai1.getRainhas()[i];
                    filho2.getRainhas()[i] = pai2.getRainhas()[i];
                } else {
                    filho1.getRainhas()[i] = pai2.getRainhas()[i];
                    filho2.getRainhas()[i] = pai1.getRainhas()[i];
                }
            }
            tabuleiros.add(filho1);
            tabuleiros.add(filho2);
            crossOvers--;
        } while (crossOvers > 0 && velhoTamanho - tabuleirosTemp.size() > 1);
    }

    public static int sortearCrossover(double tamanhoRoleta) {
        Random random = new Random();
        double valor = random.nextDouble() * tamanhoRoleta;
        double acumulador = 0;
        int pos = 0;
        do {
            acumulador += tabuleiros.get(pos).getNota() * 100.0;
            pos++;
        } while (acumulador < valor);
        return pos - 1;
    }

    public static int calcularTamanhoRoleta() {
        int tamanho = 0;
        for (int i = 0; i < tabuleiros.size(); i++) {
            tamanho += tabuleiros.get(i).getNota() * 100.0;
        }
        return tamanho;
    }

    public static void calcularNotas() {
        for (int i = 0; i < tabuleiros.size(); i++) {
            if (tabuleiros.get(i).isModificado()) {
                int nota = conflitosTabuleiro(tabuleiros.get(i)) + 1;
                tabuleiros.get(i).setNota(1.0 / nota);
                tabuleiros.get(i).setModificado(false);
            }
        }
    }

    public static int conflitosTabuleiro(Tabuleiro tabuleiro) {
        int qtd = 0;
        for (int i = 0; i < tabuleiro.getRainhas().length - 1; i++) {
            for (int j = i + 1; j < tabuleiro.getRainhas().length; j++) {
                if (tabuleiro.getRainhas()[i] == tabuleiro.getRainhas()[j]) {
                    qtd++;
                    continue;
                }
                int dif = tabuleiro.getRainhas()[i] - Math.abs(j - i);
                if (dif >= 0 && dif < tabuleiro.getRainhas().length && tabuleiro.getRainhas()[j] == dif) {
                    qtd++;
                    continue;
                }
                dif = tabuleiro.getRainhas()[i] + Math.abs(j - i);
                if (dif >= 0 && dif < tabuleiro.getRainhas().length && tabuleiro.getRainhas()[j] == dif) {
                    qtd++;
                    continue;
                }
            }
        }
        return qtd;
    }

    public static void gerarPopulacaoInicial(int tamanhoTabuleiro, int tamanhoPopulacao) {
        tabuleiros = new ArrayList<Tabuleiro>();
        for (int i = 0; i < tamanhoPopulacao; i++) {
            tabuleiros.add(gerarTabuleiro(tamanhoTabuleiro));
        }
    }

    public static Tabuleiro gerarTabuleiro(int tamanhoTabuleiro) {
        Integer[] rainhas = new Integer[tamanhoTabuleiro];
        Random random = new Random();
        for (int i = 0; i < rainhas.length; i++) {
            rainhas[i] = random.nextInt(tamanhoTabuleiro);
        }
        Tabuleiro tabuleiro = new Tabuleiro();
        tabuleiro.setRainhas(rainhas);
        return tabuleiro;
    }
}