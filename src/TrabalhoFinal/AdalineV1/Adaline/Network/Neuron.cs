using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AdalineV1.Adaline.Network
{
    class Neuron
    {
        private double bias = 1;
        private double biasPeso;
        private double deltaBias;
        public List<double[]> entradas;
        public Double[] saidas;
        public double[] pesos;
        private double taxaAprendizagem = 0.01;
        private double precisao = 0.1;
        private double[] deltas;

        public double TaxaAprendizagem { get => taxaAprendizagem; set => taxaAprendizagem = value; }
        public double Precisao { get => precisao; set => precisao = value; }
        public string Nome { get; set; }

        public Neuron(String nome, List<double[]> dadosTreinamento, Double[] saidasTreinamento)
        {
            Nome = nome;
            entradas = dadosTreinamento;
            saidas = saidasTreinamento;
            pesos = new double[dadosTreinamento[0].Length];
            deltas = new double[dadosTreinamento[0].Length];
            this.inicializarPesos();
        }

        private void inicializarPesos()
        {
            Random random = new Random();
            for (int i = 0; i < pesos.Length; i++)
            {
                pesos[i] = 0;
            }

            biasPeso = 0;
        }

        public double calcular(double[] entrada)
        {
            double resultado = sinapse(entrada);

            if (resultado >= 0)
            {
                return 1;
            }
            return -1;
        }

        public double sinapse(double[] entrada)
        {
            double resultado = 0;

            resultado += bias * biasPeso;

            for (int i = 0; i < entrada.Length; i++)
            {
                resultado += pesos[i] * entrada[i];
            }

            return resultado;
        }

        public void treino()
        {
            // Erro = SaídaEsperada - Sinapse | A Sinapse é o somatório da multiplicação dos inputs e pesos, ANTES passar pela função de ativação.
            // DeltaW = Erro * Xi * TaxaAprendizagem
            // W = W + DeltaW
            // ErroQuadratico = (erro)^2 / 2

            //  ENQUANTO(MaiorErroQuadratico > ErroMínimo){
            // 		ciclo ++;
            //		PARA CADA vetorDeTreinamento {
            //			PARA CADA neuronioDeSaida { ??????
            //				// Calcular erro
            //				// Atualizar Pesos
            //				// Calcular erro quadratico
            //				// Armazenar o maior erro quadratico
            //			}
            //		}
            //  }

            Int32 ciclo = 0;
            double maiorErroQuadratico;
            do
            {
                maiorErroQuadratico = 0.0;
                ciclo++;

                for(int i = 0; i < entradas.Count; i ++)
                {
                    
                    double erro = saidas[i] - sinapse(entradas[i]);

                    for (int j = 0; j < entradas[i].Length; j++)
                    {
                        deltas[j] = erro * entradas[i][j] * TaxaAprendizagem;
                    }
                    deltaBias = erro * biasPeso * TaxaAprendizagem;

                    for (int j = 0; j < entradas[i].Length; j++)
                    {
                        pesos[j] += deltas[j];
                    }

                    double erroQuadratico = (erro * erro) / 2;

                    if (erroQuadratico > maiorErroQuadratico)
                    {
                        maiorErroQuadratico = erroQuadratico;
                    }

                    Console.WriteLine("Erro Quadrático: " + erroQuadratico);
                    Console.WriteLine("Pesos: " + string.Join(",", pesos));
                }
            } while (maiorErroQuadratico > Precisao);
        }
    }
}
    