package buscas;

public class Aresta {

    public Vertice destino;
    public int peso;

    public Aresta(Vertice destino, int peso) {
        this.peso = peso;
        this.destino = destino;
    }

}
