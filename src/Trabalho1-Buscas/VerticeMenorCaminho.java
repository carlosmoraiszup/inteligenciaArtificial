package buscas;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class VerticeMenorCaminho {

    private String nome;

    private List<VerticeMenorCaminho> menorCaminho = new LinkedList<>();

    private Integer distancia = Integer.MAX_VALUE;

    Map<VerticeMenorCaminho, Integer> verticeAdj = new HashMap<>();

    public void addDestino(VerticeMenorCaminho destino, int distancia) {
        verticeAdj.put(destino, distancia);
    }

    public VerticeMenorCaminho(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<VerticeMenorCaminho> getMenorCaminho() {
        return menorCaminho;
    }

    public void setMenorCaminho(List<VerticeMenorCaminho> menorCaminho) {
        this.menorCaminho = menorCaminho;
    }

    public Integer getDistancia() {
        return distancia;
    }

    public void setDistancia(Integer distancia) {
        this.distancia = distancia;
    }

    public Map<VerticeMenorCaminho, Integer> getVerticeAdj() {
        return verticeAdj;
    }

    public void setVerticeAdj(Map<VerticeMenorCaminho, Integer> verticeAdj) {
        this.verticeAdj = verticeAdj;
    }
}
