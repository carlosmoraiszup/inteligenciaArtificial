package buscas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Build {

    private BufferedReader lerArq;
    private FileReader arq;
    private int matrizadj[][];
    private String[] getParametro;
    private List<Integer> visitados = new ArrayList<>();
    private List<Integer> avistar = new ArrayList<>();
    private List<Integer> caminho = new ArrayList<>();
    private HashMap<String, Integer> mapa = new HashMap<>();
    private HashMap<String, Integer> mapaHeuristica = new HashMap<>();

    public Build() {
        try {
            this.montarMap();
        } catch (Exception e) {
        }
    }


    /* ----------- BFS -------------------*/

    public void criarMatrizAdj(int numeroVertices) {
        matrizadj = new int[numeroVertices + 1][numeroVertices + 1];
    }

    private void inicializarMatrizAdj() {
        for (int i = 1; i < matrizadj.length; i++) {
            for (int j = 1; j < matrizadj.length; j++) {
                matrizadj[i][j] = 0;
            }
        }
    }

    public void montarAdjacentes() throws Exception {

        arq = new FileReader("properties/arestas.txt");
        lerArq = new BufferedReader(arq);


        String linha = lerArq.readLine();
        while (linha != null) {
            getParametro = linha.split(",");
            int origem = Integer.parseInt(getParametro[0]);
            int destino = Integer.parseInt(getParametro[1]);
            int peso = Integer.parseInt(getParametro[2]);

            matrizadj[origem][destino] = peso;

            linha = lerArq.readLine();
        }
        arq.close();
    }

    private void imprimirMatrizAdj(int[][] matrizadj) {
        for (int i = 1; i < matrizadj.length; i++) {
            for (int j = 1; j < matrizadj.length; j++) {
                System.out.print(matrizadj[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void BFS(String verticeOrigem, String verticeDestino) {

        try {
            this.criarMatrizAdj(20);
            inicializarMatrizAdj();
            this.montarAdjacentes();
        } catch (Exception e) {
        }

        boolean play = true;
        visitados.add(mapa.get(verticeOrigem));
        avistar.add(mapa.get(verticeOrigem));
        caminho.add(mapa.get(verticeOrigem));
        while (play) {
            while (avistar.size() > 0) {
                int i = avistar.get(0);
                avistar.remove(0);
                for (int j = 1; j < matrizadj.length; j++) {
                    if (matrizadj[i][j] != 0) {
                        if (!visitados.contains(j)) {
                            visitados.add(j);
                            caminho.add(j);
                        }
                        if (j == mapa.get(verticeDestino)) {
                            play = false;
                            break;
                        }
                        avistar.add(j);
                    }
                }
                if (!play) break;
            }
        }
        System.out.print("\nBusca em largura:  ");
        caminho.forEach(cidade ->
                System.out.print(findMapKeyByValue(cidade) + " -> "));

        System.out.println("\n");
        caminho.clear();
        avistar.clear();
        visitados.clear();
    }

    /*---------  MAP ---------------*/

    private String findMapKeyByValue(int aux) {
        return mapa.entrySet()
                .stream()
                .filter(e -> e.getValue().equals(aux))
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
    }

    public HashMap<String, Integer> montarMap() throws Exception {

        arq = new FileReader("properties/mapa.txt");
        lerArq = new BufferedReader(arq);

        String linha = lerArq.readLine();
        while (linha != null) {
            getParametro = linha.split(",");

            int numberCidade = Integer.parseInt(getParametro[1]);

            mapa.put(getParametro[0], numberCidade);

            linha = lerArq.readLine();
        }
        arq.close();
        return mapa;
    }

    /* -------- DFS ---------------------*/

    private List<Vertice> montarArray() throws Exception {
        List<Integer> existentes = new ArrayList<Integer>();
        List<Vertice> vertices = new ArrayList<Vertice>();
        arq = new FileReader("properties/arestas.txt");
        lerArq = new BufferedReader(arq);
        String linha = lerArq.readLine();
        while (linha != null) {
            getParametro = linha.split(",");
            int origem = Integer.parseInt(getParametro[0]);
            if (!existentes.contains(origem)) {
                existentes.add(origem);
                vertices.add(new Vertice(origem + ""));
            }
            int destino = Integer.parseInt(getParametro[1]);
            if (!existentes.contains(destino)) {
                existentes.add(destino);
                vertices.add(new Vertice(destino + ""));
            }
            int peso = Integer.parseInt(getParametro[2]);
            Vertice destinoV = null, origemV = null;
            boolean destinoFlag = false, origemFlag = false;
            for (int i = 0; i < vertices.size(); i++) {
                if (vertices.get(i).nome.equals(origem + "")) {
                    origemV = vertices.get(i);
                    origemFlag = true;
                }
                if (vertices.get(i).nome.equals(destino + "")) {
                    destinoV = vertices.get(i);
                    destinoFlag = true;
                }
                if (destinoFlag && origemFlag) {
                    break;
                }
            }
            destinoV.arestas.add(new Aresta(origemV, peso));
            origemV.arestas.add(new Aresta(destinoV, peso));
            linha = lerArq.readLine();
        }
        arq.close();
        return vertices;
    }

    private void DFS_funcao(int origem, int destino, int camadas) throws Exception {
        boolean flagO = false, flagD = false;
        List<Vertice> vertices = montarArray();
        Vertice origemV = pegarVertice(vertices, Integer.toString(origem));
        Vertice destinoV = pegarVertice(vertices, Integer.toString(destino));
        List<Vertice> caminho = DFS_rec(origemV, destinoV, vertices, camadas);
        if (caminho != null) {
            for (int i = 0; i < caminho.size(); i++) {
                System.out.print(findMapKeyByValue(Integer.parseInt(caminho.get(i).nome)) + " -> ");
            }
        } else {
            System.out.println("Não encontrado");
        }
        System.out.println("\n");
    }

    private Vertice pegarVertice(List<Vertice> vertices, String name) {
        for (int i = 0; i < vertices.size(); i++) {
            if (vertices.get(i).nome.equals(name)) {
                return vertices.get(i);
            }
        }
        return null;
    }

    public void DFS(String origem, String destino) throws Exception {
        System.out.print("\n Busca profundidade: ");
        DFS_funcao(mapa.get(origem), mapa.get(destino), -1);
    }

    private List<Vertice> DFS_rec(Vertice origem, Vertice destino, List<Vertice> vertices, int camada) {
        List<Vertice> novaLista = new ArrayList<Vertice>();
        if (origem.equals(destino)) {
            novaLista.add(destino);
            return novaLista;
        }
        if (camada == 0) {
            return null;
        }
        if (origem.arestas.size() > 0) {
            for (int i = 0; i < vertices.size(); i++) {
                if (!vertices.get(i).equals(origem)) {
                    novaLista.add(vertices.get(i));
                }
            }
            for (int i = 0; i < origem.arestas.size(); i++) {
                if (novaLista.contains(origem.arestas.get(i).destino)) {
                    List<Vertice> retorno = DFS_rec(origem.arestas.get(i).destino, destino, novaLista, camada - 1);
                    if (retorno != null) {
                        retorno.add(0, origem);
                        return retorno;
                    }
                }
            }
        }
        return null;
    }


    public void DFS_interativo(String origem, String destino, int camadas) throws Exception {
        if (camadas < 0) {
            System.out.print("\n Busca profundidade iterativo: ");
        } else {
            System.out.print("\n Busca profundidade iterativo, com " + camadas + " camadas: ");
        }
        DFS_funcao(mapa.get(origem), mapa.get(destino), camadas);
    }

    /* ---------- BUSCA A* -------------*/

    public void busca_Aestrela(String verticeOrigem, String verticeDestino) {

        try {
            this.criarMatrizAdj(20);
            this.inicializarMatrizAdj();
            this.montarAdjacentes();
            this.montarMap();
            this.montarMapHeuristica();
        } catch (Exception e) {
        }

        boolean play = true;
        int menor = 999;
        visitados.add(mapa.get(verticeOrigem));
        avistar.add(mapa.get(verticeOrigem));
        caminho.add(mapa.get(verticeOrigem));
        List<Integer> caminhoTemporario = new ArrayList<>();
        while (play) {
            while (avistar.size() > 0) {
                int i = avistar.get(0);
                avistar.remove(0);
                for (int j = 1; j < matrizadj.length; j++) {
                    if (matrizadj[i][j] != 0) {
                        if (!visitados.contains(j)) {
                            visitados.add(j);
                            caminhoTemporario.add(j);
                        }
                        if (j == mapa.get(verticeDestino)) {
                            play = false;
                            break;
                        }
                    }
                }
                Integer cidade = 0;
                for(int k = 0; k < caminhoTemporario.size(); k++){
                    Integer distancia = mapaHeuristica.get(findMapKeyByValue(caminhoTemporario.get(k)));
                    if(menor > distancia) {
                        menor = distancia;
                        cidade = caminhoTemporario.get(k);
                    }
                }

                caminho.add(cidade);
                avistar.add(cidade);


                menor = 999;
                if (!play) break;
            }
        }
        System.out.print("\nBusca A*:  ");
        caminho.forEach(cidade ->
                System.out.print(findMapKeyByValue(cidade) + " -> "));

        caminho.clear();
        avistar.clear();
        visitados.clear();
        caminhoTemporario.clear();

        System.out.println("\n");
    }

    private void montarMapHeuristica() throws Exception {

        arq = new FileReader("properties/heuristica.txt");
        lerArq = new BufferedReader(arq);

        String linha = lerArq.readLine();
        while (linha != null) {
            getParametro = linha.split(",");

            int distancia = Integer.parseInt(getParametro[1]);

            mapaHeuristica.put(getParametro[0], distancia);

            linha = lerArq.readLine();
        }
        arq.close();
    }

    /* -------- MENOR CAMINHO ---------*/

    public static GrafoMenorCaminho menorCaminho(GrafoMenorCaminho grafo, VerticeMenorCaminho origem) {
        origem.setDistancia(0);

        Set<VerticeMenorCaminho> verticeVisitado = new HashSet<>();
        Set<VerticeMenorCaminho> verticeNaoVisitado = new HashSet<>();

        verticeNaoVisitado.add(origem);

        while (verticeNaoVisitado.size() != 0) {
            VerticeMenorCaminho verticeAtual = getVerticeComMenorDistancia(verticeNaoVisitado);
            verticeNaoVisitado.remove(verticeAtual);
            for (Map.Entry<VerticeMenorCaminho, Integer> verticeAdj :
                    verticeAtual.getVerticeAdj().entrySet()) {
                VerticeMenorCaminho adj = verticeAdj.getKey();
                Integer peso = verticeAdj.getValue();
                if (!verticeVisitado.contains(adj)) {
                    calcularMenorDistancia(adj, peso, verticeAtual);
                    verticeNaoVisitado.add(adj);
                }
            }
            verticeVisitado.add(verticeAtual);
        }
        return grafo;
    }

    private static VerticeMenorCaminho getVerticeComMenorDistancia(Set<VerticeMenorCaminho> verticeNaoVisitado) {
        VerticeMenorCaminho verticeMenorDistancia = null;
        int menorDistancia = Integer.MAX_VALUE;
        for (VerticeMenorCaminho verticeMenorCaminho : verticeNaoVisitado) {
            int nodeDistance = verticeMenorCaminho.getDistancia();
            if (nodeDistance < menorDistancia) {
                menorDistancia = nodeDistance;
                verticeMenorDistancia = verticeMenorCaminho;
            }
        }
        return verticeMenorDistancia;
    }

    private static void calcularMenorDistancia(VerticeMenorCaminho verticeVisitado,
            Integer peso, VerticeMenorCaminho origem) {
        Integer distanciaOrigem = origem.getDistancia();
        if (distanciaOrigem + peso < verticeVisitado.getDistancia()) {
            verticeVisitado.setDistancia(distanciaOrigem + peso);
            LinkedList<VerticeMenorCaminho> menorCaminho = new LinkedList<>(origem.getMenorCaminho());
            menorCaminho.add(origem);
            verticeVisitado.setMenorCaminho(menorCaminho);
        }
    }




}
