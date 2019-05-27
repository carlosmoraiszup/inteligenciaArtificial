package nrainhas;

public class ProblemaNrainhas {

    public static void nRainhas(int n) {
        Integer[] itens = new Integer[n];
        for (int i = 0; i < itens.length; i++) {
            itens[i] = -1;
        }
        Integer[] retorno = nRainhasRec(0, itens);
        for (int i = 0; i < itens.length; i++) {
            System.out.println(retorno[i]);
        }
        desenharGrid(retorno);                    //UTF-8
    }


    public static Integer[] nRainhasRec(int atual, Integer[] vector) {
        for (int i = 0; i < vector.length; i++) {
            boolean salvo = true;
            int dif;
            for (int j = 0; j < vector.length; j++) {
                if (vector[j] == i) {
                    salvo = false;
                    break;
                }
                if (atual == j) {
                    continue;
                }
                dif = i - Math.abs(j - atual);
                if (dif >= 0 && dif < vector.length && vector[j] == dif) {
                    salvo = false;
                    break;
                }
                dif = i + Math.abs(j - atual);
                if (dif >= 0 && dif < vector.length && vector[j] == dif) {
                    salvo = false;
                    break;
                }
            }
            if (!salvo) {
                continue;
            }
            vector[atual] = i;
            if (atual == vector.length - 1) {
                return vector;
            } else {
                Integer[] retorno = nRainhasRec(atual + 1, vector);
                if (retorno != null) {
                    return retorno;
                } else {
                    vector[atual] = -1;
                }
            }
        }
        return null;
    }


    public static String pegarIdent(int n, int max) {
        String retorno = "";
        if (n < 0) {
            for (int i = 0; i < ((max - 1) + "").length() + 2; i++) {
                retorno = retorno + " ";
            }
        }
        for (int i = 0; i < ((max - 1) + "").length() - (n + "").length(); i++) {
            retorno = retorno + " ";
        }
        return retorno;
    }

    public static void desenharGrid(Integer[] vector) {
        String linha = "";
        String tetos = "═";
        for (int i = 0; i < ((vector.length - 1) + "").length(); i++) {
            tetos = tetos + "═";
        }
        tetos = tetos + "═";
        for (int i = 0; i < vector.length * 2 + 1; i++) {
            if (i == 0) {
                linha = linha + "╔";
            } else if (i == vector.length * 2) {
                linha = linha + "╗";
            } else if (i % 2 == 1) {
                linha = linha + tetos;
            } else {
                linha = linha + "╦";
            }
        }
        System.out.println(linha);
        for (int i = 0; i < vector.length * 2 - 1; i++) {
            linha = "";
            if (i % 2 == 0) {
                for (int j = 0; j < vector.length * 2 + 1; j++) {
                    if (j == 0 || j == vector.length * 2) {
                        linha = linha + "║";
                    } else if (j % 2 == 1) {
                        if ((j - 1) / 2 == vector[i / 2]) {
                            String ident = pegarIdent(vector[i / 2], vector.length);
                            linha = linha + " " + ident + vector[i / 2] + " ";
                        } else {
                            linha = linha + pegarIdent(-1, vector.length);
                        }
                    } else {
                        linha = linha + "║";
                    }
                }
            } else {
                for (int j = 0; j < vector.length * 2 + 1; j++) {
                    if (j == 0) {
                        linha = linha + "╠";
                    } else if (j == vector.length * 2) {
                        linha = linha + "╣";
                    } else if (j % 2 == 1) {
                        linha = linha + tetos;
                    } else {
                        linha = linha + "╬";
                    }
                }

            }
            System.out.println(linha);
        }
        linha = "";
        for (int i = 0; i < vector.length * 2 + 1; i++) {
            if (i == 0) {
                linha = linha + "╚";
            } else if (i == vector.length * 2) {
                linha = linha + "╝";
            } else if (i % 2 == 1) {
                linha = linha + tetos;
            } else {
                linha = linha + "╩";
            }
        }
        System.out.println(linha);
    }
}