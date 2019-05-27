package buscas;

import java.util.HashSet;
import java.util.Set;

public class GrafoMenorCaminho {

    private Set<VerticeMenorCaminho> verticeMenorCaminhos = new HashSet<>();

    public void addVertice(VerticeMenorCaminho verticeMenorCaminhoA) {
        verticeMenorCaminhos.add(verticeMenorCaminhoA);
    }

    public Set<VerticeMenorCaminho> getVerticeMenorCaminhos() {
        return verticeMenorCaminhos;
    }

    public void setVerticeMenorCaminhos(Set<VerticeMenorCaminho> verticeMenorCaminhos) {
        this.verticeMenorCaminhos = verticeMenorCaminhos;
    }

}
