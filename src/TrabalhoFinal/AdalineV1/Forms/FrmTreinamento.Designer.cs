namespace AdalineV1.Forms
{
    partial class FrmTreinamento
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.lblErroMinimo = new System.Windows.Forms.Label();
            this.lblAprendizagem = new System.Windows.Forms.Label();
            this.label6 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.btnTreinar = new System.Windows.Forms.Button();
            this.groupBox1.SuspendLayout();
            this.SuspendLayout();
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.lblErroMinimo);
            this.groupBox1.Controls.Add(this.lblAprendizagem);
            this.groupBox1.Controls.Add(this.label6);
            this.groupBox1.Controls.Add(this.label5);
            this.groupBox1.Controls.Add(this.label4);
            this.groupBox1.Controls.Add(this.label3);
            this.groupBox1.Controls.Add(this.label2);
            this.groupBox1.Controls.Add(this.label1);
            this.groupBox1.Location = new System.Drawing.Point(12, 12);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(411, 139);
            this.groupBox1.TabIndex = 0;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "Características da Rede";
            // 
            // lblErroMinimo
            // 
            this.lblErroMinimo.AutoSize = true;
            this.lblErroMinimo.Location = new System.Drawing.Point(90, 76);
            this.lblErroMinimo.Name = "lblErroMinimo";
            this.lblErroMinimo.Size = new System.Drawing.Size(22, 13);
            this.lblErroMinimo.TabIndex = 7;
            this.lblErroMinimo.Text = "0,1";
            // 
            // lblAprendizagem
            // 
            this.lblAprendizagem.AutoSize = true;
            this.lblAprendizagem.Location = new System.Drawing.Point(364, 91);
            this.lblAprendizagem.Name = "lblAprendizagem";
            this.lblAprendizagem.Size = new System.Drawing.Size(28, 13);
            this.lblAprendizagem.TabIndex = 6;
            this.lblAprendizagem.Text = "0,01";
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(231, 91);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(127, 13);
            this.label6.TabIndex = 5;
            this.label6.Text = "- Taxa de aprendizagem: ";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(231, 34);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(173, 26);
            this.label5.TabIndex = 4;
            this.label5.Text = "- Algoritmo utilizado no treinamento:\r\n             Adaline (Regra Delta)";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(6, 103);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(210, 13);
            this.label4.TabIndex = 3;
            this.label4.Text = "- 21 entradas para o treinamento (3 Fontes)";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(6, 76);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(78, 13);
            this.label3.TabIndex = 2;
            this.label3.Text = "- Erro mínimo : ";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(6, 49);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(91, 13);
            this.label2.TabIndex = 1;
            this.label2.Text = "- Utiliza-se o BIAS";
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(6, 22);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(186, 13);
            this.label1.TabIndex = 0;
            this.label1.Text = "- Número de neurônios de entrada: 63";
            // 
            // btnTreinar
            // 
            this.btnTreinar.Location = new System.Drawing.Point(174, 157);
            this.btnTreinar.Name = "btnTreinar";
            this.btnTreinar.Size = new System.Drawing.Size(75, 23);
            this.btnTreinar.TabIndex = 1;
            this.btnTreinar.Text = "Treinar";
            this.btnTreinar.UseVisualStyleBackColor = true;
            this.btnTreinar.Click += new System.EventHandler(this.btnTreinar_Click);
            // 
            // FrmTreinamento
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(435, 194);
            this.Controls.Add(this.btnTreinar);
            this.Controls.Add(this.groupBox1);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedDialog;
            this.MaximizeBox = false;
            this.MinimizeBox = false;
            this.Name = "FrmTreinamento";
            this.Text = "Treinamento";
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Button btnTreinar;
        private System.Windows.Forms.Label lblErroMinimo;
        private System.Windows.Forms.Label lblAprendizagem;
    }
}