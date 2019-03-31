package buscas;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Build build = new Build();

        Scanner scanf = new Scanner(System.in);  // Create a Scanner object
        System.out.println("-------------------- MENU ----------------------");
        System.out.println("1- Busca Largura          2 - Busca Profundidade");
        System.out.println("3- Busca Aprofundamento Iterativo               ");
        System.out.println("4- Menor Caminho");
        System.out.println("5- Busca A*");
        System.out.println("6- Exit");
        System.out.println("------------------------------------------------\n");


        while (true) {
            try {
                System.out.print("Insira uma opcao: ");
                int opcao = scanf.nextInt();
                switch (opcao) {
                    case 1:
                        build.BFS("Arad", "Bucareste");
                        break;
                    case 2:
                        build.DFS("Arad", "Bucareste");
                        break;
                    case 3:
                        System.out.println(" - Digite -1 para todas camadas.");
                        System.out.println(" - Ou um inteiro positivo para camadas especificas\n");
                        System.out.print("Insira uma opcao: ");
                        int camadas = scanf.nextInt();
                        build.DFS_interativo("Arad", "Bucareste", camadas);
                        break;
                    case 4:
                        menorCaminho();
                        break;
                    case 5:
                        build.busca_Aestrela("Arad", "Bucareste");
                        break;
                    case 6:
                        return;
                }

            } catch (Exception e) {
            }

        }

    }

    public static void menorCaminho() {
        Build build = new Build();

        VerticeMenorCaminho arad = new VerticeMenorCaminho("Arad");
        VerticeMenorCaminho sibiu = new VerticeMenorCaminho("Sibiu");
        VerticeMenorCaminho zerind = new VerticeMenorCaminho("Zerind");
        VerticeMenorCaminho timisoara = new VerticeMenorCaminho("Timisoara");
        VerticeMenorCaminho fagaras = new VerticeMenorCaminho("Fagaras");
        VerticeMenorCaminho rimnieu_vilcea = new VerticeMenorCaminho("Rimnieu_Vilcea");
        VerticeMenorCaminho pitesti = new VerticeMenorCaminho("Pitesti");
        VerticeMenorCaminho oradea = new VerticeMenorCaminho("Oradea");
        VerticeMenorCaminho ludoj = new VerticeMenorCaminho("Ludoj");
        VerticeMenorCaminho bucareste = new VerticeMenorCaminho("Bucareste");
        VerticeMenorCaminho craiova = new VerticeMenorCaminho("Craiova");
        VerticeMenorCaminho mehadia = new VerticeMenorCaminho("Mehadia");
        VerticeMenorCaminho giurgiu = new VerticeMenorCaminho("Giurgiu");
        VerticeMenorCaminho urziceni = new VerticeMenorCaminho("Urziceni");
        VerticeMenorCaminho hirsova = new VerticeMenorCaminho("Hirsova");
        VerticeMenorCaminho vaslui = new VerticeMenorCaminho("Vaslui");
        VerticeMenorCaminho drobeta = new VerticeMenorCaminho("Drobeta");
        VerticeMenorCaminho eforie = new VerticeMenorCaminho("Eforie");
        VerticeMenorCaminho iasi = new VerticeMenorCaminho("Iasi");
        VerticeMenorCaminho neamt = new VerticeMenorCaminho("Neamt");


        arad.addDestino(sibiu, 140);
        arad.addDestino(zerind, 75);
        arad.addDestino(timisoara, 118);
        sibiu.addDestino(arad, 140);
        sibiu.addDestino(fagaras, 99);
        sibiu.addDestino(oradea, 151);
        sibiu.addDestino(rimnieu_vilcea, 80);
        zerind.addDestino(arad, 75);
        zerind.addDestino(oradea, 71);
        timisoara.addDestino(arad, 118);
        timisoara.addDestino(ludoj, 111);
        fagaras.addDestino(sibiu, 99);
        fagaras.addDestino(bucareste, 211);
        oradea.addDestino(sibiu, 151);
        oradea.addDestino(zerind, 71);
        rimnieu_vilcea.addDestino(sibiu, 80);
        rimnieu_vilcea.addDestino(pitesti, 97);
        rimnieu_vilcea.addDestino(drobeta, 146);
        pitesti.addDestino(rimnieu_vilcea, 97);
        pitesti.addDestino(bucareste, 101);
        pitesti.addDestino(craiova, 138);
        bucareste.addDestino(pitesti, 101);
        bucareste.addDestino(giurgiu, 90);
        bucareste.addDestino(fagaras, 211);
        bucareste.addDestino(urziceni, 85);
        ludoj.addDestino(timisoara, 111);
        ludoj.addDestino(mehadia, 70);
        mehadia.addDestino(ludoj, 70);
        mehadia.addDestino(drobeta, 75);
        drobeta.addDestino(mehadia, 75);
        drobeta.addDestino(craiova, 120);
        craiova.addDestino(drobeta, 120);
        craiova.addDestino(rimnieu_vilcea, 146);
        craiova.addDestino(pitesti, 138);
        giurgiu.addDestino(bucareste, 90);
        urziceni.addDestino(bucareste, 85);
        urziceni.addDestino(hirsova, 98);
        urziceni.addDestino(vaslui, 142);
        hirsova.addDestino(urziceni, 98);
        hirsova.addDestino(eforie, 86);
        eforie.addDestino(hirsova, 86);
        vaslui.addDestino(urziceni, 14);
        vaslui.addDestino(iasi, 92);
        iasi.addDestino(vaslui, 92);
        iasi.addDestino(neamt, 87);
        neamt.addDestino(iasi, 87);

        GrafoMenorCaminho graph = new GrafoMenorCaminho();

        graph.addVertice(arad);
        graph.addVertice(sibiu);
        graph.addVertice(zerind);
        graph.addVertice(timisoara);
        graph.addVertice(fagaras);
        graph.addVertice(rimnieu_vilcea);
        graph.addVertice(pitesti);
        graph.addVertice(oradea);
        graph.addVertice(ludoj);
        graph.addVertice(bucareste);
        graph.addVertice(pitesti);
        graph.addVertice(mehadia);
        graph.addVertice(craiova);
        graph.addVertice(giurgiu);
        graph.addVertice(urziceni);
        graph.addVertice(hirsova);
        graph.addVertice(vaslui);
        graph.addVertice(drobeta);
        graph.addVertice(eforie);
        graph.addVertice(iasi);
        graph.addVertice(neamt);

        GrafoMenorCaminho grafoMenorCaminho = build.menorCaminho(graph, arad);

        String destino = "Bucareste";

        grafoMenorCaminho.getVerticeMenorCaminhos().forEach(caminho -> {
            if (caminho.getNome().equals(destino)) {
                System.out.print("Busca menor caminho: ");
                caminho.getMenorCaminho().forEach(cidades -> System.out.print(cidades.getNome() + " -> "));
                System.out.println(destino + "\n");
            }
        });


    }

}
