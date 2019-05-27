package subidaEncosta;

public class Main {

    public static void main(String[] args) {
        SubidaEncosta subidaEncosta = new SubidaEncosta();

        int tamanhoTabuleiro = 4;
        int qtdTentativasMax = 100;
        int conflitosMinimos = 0;

        Integer[] tabuleiro1 = subidaEncosta.gerarTabuleiro(tamanhoTabuleiro);
        Integer[] tabuleiro2 = new Integer[tamanhoTabuleiro];
        for (int i = 0; i < tabuleiro1.length; i++) {
            tabuleiro2[i]=tabuleiro1[i].intValue();
        }
        System.out.println("nRainhas subida/descida de encosta");
        subidaEncosta.nRainhas(qtdTentativasMax, conflitosMinimos, tabuleiro1);
        System.out.println("\n\nnRainhas tabu");
        subidaEncosta.nRainhasTabu(qtdTentativasMax, conflitosMinimos, tabuleiro2);
    }
}
