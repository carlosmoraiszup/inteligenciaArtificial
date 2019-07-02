using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AdalineV1.Network.data
{
    class Letra
    {
        private String c1;
        private String c2;
        private String c3;
        private String c4;
        private String c5;
        private String c6;
        private String c7;

        public Letra(double[] letra)
        {
            C1 = pesoCaractere(letra[0]);
            C2 = pesoCaractere(letra[1]);
            C3 = pesoCaractere(letra[2]);
            C4 = pesoCaractere(letra[3]);
            C5 = pesoCaractere(letra[4]);
            C6 = pesoCaractere(letra[5]);
            C7 = pesoCaractere(letra[6]);
        }

        private String pesoCaractere(double peso)
        {
            if (peso == 1) { return "#"; }
            else if (peso == -1) { return "-"; }
            return "0";
        }

        public String C1 { get => c1; set => c1 = value; }
        public String C2 { get => c2; set => c2 = value; }
        public String C3 { get => c3; set => c3 = value; }
        public String C4 { get => c4; set => c4 = value; }
        public String C5 { get => c5; set => c5 = value; }
        public String C6 { get => c6; set => c6 = value; }
        public String C7 { get => c7; set => c7 = value; }
    }
}
