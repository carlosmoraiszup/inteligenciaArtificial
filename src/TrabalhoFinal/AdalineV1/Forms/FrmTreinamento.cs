using AdalineV1.Adaline.Network;
using AdalineV1.Network;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Diagnostics;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace AdalineV1.Forms
{
    public partial class FrmTreinamento : Form
    {
        public FrmTreinamento()
        {
            InitializeComponent();
            this.CenterToScreen();
        }

        internal List<Neuron> redeNeural;

        private void btnTreinar_Click(object sender, EventArgs e)
        {
            redeNeural = new List<Neuron>();
            String[] letras = {"A","B","C","D","E","J","K"};

            for (int i = 0; i < letras.Length; i++)
            {
                redeNeural.Add(new Neuron(letras[i], Fontes.obterVetoresTreinamento(), Fontes.obterSaidas()[i]));
            }

            redeNeural.ForEach(neuron =>
            {
                neuron.treino();
            });

            lblErroMinimo.Text = Convert.ToString(redeNeural[0].Precisao);
            lblAprendizagem.Text = Convert.ToString(redeNeural[0].TaxaAprendizagem);

            MessageBox.Show("O treinamento foi finalizado.", "Finalizado", MessageBoxButtons.OK, MessageBoxIcon.Information);
            Close();
        }
    }
}
