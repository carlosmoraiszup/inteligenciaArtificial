package subidaEncosta;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SubidaEncosta {


    static void nRainhasTabu(int maximoInteracoes, int objetivoConflitos, Integer[] tabuleiro) {
        List<Integer> listaTabu = new ArrayList<Integer>();
        mostrarTabuleiro(tabuleiro);
        boolean solucionado = false;
        for (int i = 0; i < maximoInteracoes; i++) {
            Posicao posicao = encontrarMelhorPosicaoTabu(tabuleiro, listaTabu);
            if(i==0 || i==1) {
                listaTabu.add(posicao.coluna);
            }else {
                listaTabu.set(0, listaTabu.get(1));
                listaTabu.set(1, posicao.coluna);
            }
            tabuleiro[posicao.coluna]=posicao.linha;
            if(posicao.conflitos<=objetivoConflitos) {
                solucionado = true;
                System.out.println(i + " -> " + posicao.conflitos);
                mostrarTabuleiro(tabuleiro);
                break;
            }
        }
        if(!solucionado) {
            System.out.println("Não encontrado");
        }
    }

    static Posicao encontrarMelhorPosicaoTabu(Integer[] tabuleiro, List<Integer> listaTabu) {
        Posicao posicao = new Posicao();
        posicao.conflitos = Integer.MAX_VALUE;
        for (int i = 0; i < tabuleiro.length; i++) {
            int posOriginal = tabuleiro[i];
            for (int j = 0; j < tabuleiro.length; j++) {
                if(tabuleiro[i]==j) {
                    continue;
                }
                tabuleiro[i] = j;
                int qtd = 0;
                for (int k = 0; k < tabuleiro.length-1; k++) {
                    for (int l = k+1; l < tabuleiro.length; l++) {
                        if(k==l) {
                            continue;
                        }
                        if (tabuleiro[k] == tabuleiro[l]) {
                            qtd++;
                            continue;
                        }
                        int dif = tabuleiro[k] - Math.abs(l - k);
                        if (dif >= 0 && dif < tabuleiro.length && tabuleiro[l] == dif) {
                            qtd++;
                            continue;
                        }
                        dif = tabuleiro[k] + Math.abs(l - k);
                        if (dif >= 0 && dif < tabuleiro.length && tabuleiro[l] == dif) {
                            qtd++;
                            continue;
                        }
                    }
                }
                Posicao temp = new Posicao();
                temp.coluna = i;
                temp.linha = j;
                temp.conflitos = qtd;
                if(temp.conflitos<posicao.conflitos) {
                    boolean falhouTabu = false;
                    if(listaTabu.size()>0) {
                        if(listaTabu.get(0).equals(temp.coluna)) {
                            falhouTabu = true;
                        }
                    }
                    if(listaTabu.size()==2) {
                        if(listaTabu.get(1).equals(temp.coluna)) {
                            falhouTabu = true;
                        }
                    }
                    if(!falhouTabu) {
                        posicao = temp;
                    }
                }
                tabuleiro[i] = posOriginal;
            }
        }
        return posicao;
    }

    static void nRainhas(int maximoInteracoes, int objetivoConflitos, Integer[] tabuleiro) {
        mostrarTabuleiro(tabuleiro);
        boolean solucionado = false;
        for (int i = 0; i < maximoInteracoes; i++) {
            Posicao posicao = encontrarMelhorPosicao(tabuleiro);
            tabuleiro[posicao.coluna]=posicao.linha;
            if(posicao.conflitos<=objetivoConflitos) {
                solucionado = true;
                System.out.println(i + " -> " + posicao.conflitos);
                mostrarTabuleiro(tabuleiro);
                break;
            }
        }
        if(!solucionado) {
            System.out.println("Não encontrado");
        }
    }



    static Posicao encontrarMelhorPosicao(Integer[] tabuleiro) {
        Posicao posicao = new Posicao();
        posicao.conflitos = Integer.MAX_VALUE;
        for (int i = 0; i < tabuleiro.length; i++) {
            int posOriginal = tabuleiro[i];
            for (int j = 0; j < tabuleiro.length; j++) {
                if(tabuleiro[i]==j) {
                    continue;
                }
                tabuleiro[i] = j;
                int qtd = 0;
                for (int k = 0; k < tabuleiro.length-1; k++) {
                    for (int l = k+1; l < tabuleiro.length; l++) {
                        if(k==l) {
                            continue;
                        }
                        if (tabuleiro[k] == tabuleiro[l]) {
                            qtd++;
                            continue;
                        }
                        int dif = tabuleiro[k] - Math.abs(l - k);
                        if (dif >= 0 && dif < tabuleiro.length && tabuleiro[l] == dif) {
                            qtd++;
                            continue;
                        }
                        dif = tabuleiro[k] + Math.abs(l - k);
                        if (dif >= 0 && dif < tabuleiro.length && tabuleiro[l] == dif) {
                            qtd++;
                            continue;
                        }
                    }
                }
                if(qtd<posicao.conflitos) {
                    posicao.coluna=i;
                    posicao.linha=j;
                    posicao.conflitos = qtd;
                }
                tabuleiro[i] = posOriginal;
            }
        }
        return posicao;
    }

    static void mostrarTabuleiro(Integer[] tabuleiro) {
        for (int i = 0; i < tabuleiro.length; i++) {
            System.out.print(tabuleiro[i] + " ");
        }
        System.out.println();
    }


    static Integer[] gerarTabuleiro(int n) {
        Integer[] tabuleiro = new Integer[n];
        Random random = new Random();
        for (int i = 0; i < tabuleiro.length; i++) {
            tabuleiro[i] = random.nextInt(n);
        }
        return tabuleiro;
    }

}

class Posicao{
    public int coluna;
    public int linha;
    public int conflitos;
}