using AdalineV1.Adaline.Network;
using AdalineV1.Forms;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace AdalineV1
{
    public partial class Main : Form
    {
        public Main()
        {
            InitializeComponent();
            this.CenterToScreen();
        }

        List<Neuron> neuronios;

        private void sairToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

        private void treinamentoDaRedeToolStripMenuItem_Click(object sender, EventArgs e)
        {
            FrmTreinamento frmTreinamento = new FrmTreinamento();
            frmTreinamento.ShowDialog();

            neuronios = frmTreinamento.redeNeural;
        }

        private void testeDaRedeToolStripMenuItem_Click(object sender, EventArgs e)
        {
            FrmTeste frmTeste = new FrmTeste();
            frmTeste.neuronios = neuronios;
            frmTeste.ShowDialog();
        }

    }
}
