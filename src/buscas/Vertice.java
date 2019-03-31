package buscas;

import java.util.ArrayList;
import java.util.List;

public class Vertice{

    String nome;
    List<Aresta> arestas;

    public Vertice(String nome) {
        this.arestas = new ArrayList<Aresta>();
        this.nome = nome;
    }

}
