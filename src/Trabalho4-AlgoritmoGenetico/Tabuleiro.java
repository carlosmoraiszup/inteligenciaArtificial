package algoritmoGenetico;

public class Tabuleiro implements Comparable<Tabuleiro> {
    private Integer[] rainhas;
    private Double nota;
    private boolean modificado = true;


    public Tabuleiro(int qtd){
        rainhas = new Integer[qtd];
    }

    public Tabuleiro(){}

    public Integer[] getRainhas() {
        return rainhas;
    }
    public void setRainhas(Integer[] rainhas) {
        this.rainhas = rainhas;
    }
    public Double getNota() {
        return nota;
    }
    public void setNota(Double nota) {
        this.nota = nota;
    }
    public boolean isModificado() {
        return modificado;
    }
    public void setModificado(boolean modificado) {
        this.modificado = modificado;
    }

    @Override
    public int compareTo(Tabuleiro o) {
        return nota.compareTo(o.getNota())*-1;
    }
}