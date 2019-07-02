namespace AdalineV1.Forms
{
    partial class FrmTeste
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
            this.components = new System.ComponentModel.Container();
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.rbFonte3 = new System.Windows.Forms.RadioButton();
            this.rbFonte2 = new System.Windows.Forms.RadioButton();
            this.rbFonte1 = new System.Windows.Forms.RadioButton();
            this.dtgLetra = new System.Windows.Forms.DataGridView();
            this.dataGridViewTextBoxColumn1 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn2 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn3 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn4 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn5 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn6 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn7 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.letraBindingSource1 = new System.Windows.Forms.BindingSource(this.components);
            this.letraBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.lbLetra = new System.Windows.Forms.ListBox();
            this.btnTestar = new System.Windows.Forms.Button();
            this.textBox1 = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.lblRuido = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.fontesBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.groupBox1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dtgLetra)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.letraBindingSource1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.letraBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.fontesBindingSource)).BeginInit();
            this.SuspendLayout();
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.rbFonte3);
            this.groupBox1.Controls.Add(this.rbFonte2);
            this.groupBox1.Controls.Add(this.rbFonte1);
            this.groupBox1.Location = new System.Drawing.Point(317, 12);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(105, 100);
            this.groupBox1.TabIndex = 0;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "Fonte";
            // 
            // rbFonte3
            // 
            this.rbFonte3.AutoSize = true;
            this.rbFonte3.Location = new System.Drawing.Point(10, 65);
            this.rbFonte3.Name = "rbFonte3";
            this.rbFonte3.Size = new System.Drawing.Size(55, 17);
            this.rbFonte3.TabIndex = 2;
            this.rbFonte3.TabStop = true;
            this.rbFonte3.Text = "Tipo 3";
            this.rbFonte3.UseVisualStyleBackColor = true;
            // 
            // rbFonte2
            // 
            this.rbFonte2.AutoSize = true;
            this.rbFonte2.Location = new System.Drawing.Point(10, 42);
            this.rbFonte2.Name = "rbFonte2";
            this.rbFonte2.Size = new System.Drawing.Size(55, 17);
            this.rbFonte2.TabIndex = 1;
            this.rbFonte2.TabStop = true;
            this.rbFonte2.Text = "Tipo 2";
            this.rbFonte2.UseVisualStyleBackColor = true;
            // 
            // rbFonte1
            // 
            this.rbFonte1.AutoSize = true;
            this.rbFonte1.Location = new System.Drawing.Point(10, 19);
            this.rbFonte1.Name = "rbFonte1";
            this.rbFonte1.Size = new System.Drawing.Size(55, 17);
            this.rbFonte1.TabIndex = 0;
            this.rbFonte1.TabStop = true;
            this.rbFonte1.Text = "Tipo 1";
            this.rbFonte1.UseVisualStyleBackColor = true;
            // 
            // dtgLetra
            // 
            this.dtgLetra.AllowUserToAddRows = false;
            this.dtgLetra.AllowUserToDeleteRows = false;
            this.dtgLetra.AutoGenerateColumns = false;
            this.dtgLetra.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dtgLetra.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.dataGridViewTextBoxColumn1,
            this.dataGridViewTextBoxColumn2,
            this.dataGridViewTextBoxColumn3,
            this.dataGridViewTextBoxColumn4,
            this.dataGridViewTextBoxColumn5,
            this.dataGridViewTextBoxColumn6,
            this.dataGridViewTextBoxColumn7});
            this.dtgLetra.DataSource = this.letraBindingSource1;
            this.dtgLetra.Location = new System.Drawing.Point(12, 12);
            this.dtgLetra.Name = "dtgLetra";
            this.dtgLetra.Size = new System.Drawing.Size(289, 222);
            this.dtgLetra.TabIndex = 1;
            // 
            // dataGridViewTextBoxColumn1
            // 
            this.dataGridViewTextBoxColumn1.DataPropertyName = "C1";
            this.dataGridViewTextBoxColumn1.HeaderText = "C1";
            this.dataGridViewTextBoxColumn1.Name = "dataGridViewTextBoxColumn1";
            this.dataGridViewTextBoxColumn1.Width = 35;
            // 
            // dataGridViewTextBoxColumn2
            // 
            this.dataGridViewTextBoxColumn2.DataPropertyName = "C2";
            this.dataGridViewTextBoxColumn2.HeaderText = "C2";
            this.dataGridViewTextBoxColumn2.Name = "dataGridViewTextBoxColumn2";
            this.dataGridViewTextBoxColumn2.Width = 35;
            // 
            // dataGridViewTextBoxColumn3
            // 
            this.dataGridViewTextBoxColumn3.DataPropertyName = "C3";
            this.dataGridViewTextBoxColumn3.HeaderText = "C3";
            this.dataGridViewTextBoxColumn3.Name = "dataGridViewTextBoxColumn3";
            this.dataGridViewTextBoxColumn3.Width = 35;
            // 
            // dataGridViewTextBoxColumn4
            // 
            this.dataGridViewTextBoxColumn4.DataPropertyName = "C4";
            this.dataGridViewTextBoxColumn4.HeaderText = "C4";
            this.dataGridViewTextBoxColumn4.Name = "dataGridViewTextBoxColumn4";
            this.dataGridViewTextBoxColumn4.Width = 35;
            // 
            // dataGridViewTextBoxColumn5
            // 
            this.dataGridViewTextBoxColumn5.DataPropertyName = "C5";
            this.dataGridViewTextBoxColumn5.HeaderText = "C5";
            this.dataGridViewTextBoxColumn5.Name = "dataGridViewTextBoxColumn5";
            this.dataGridViewTextBoxColumn5.Width = 35;
            // 
            // dataGridViewTextBoxColumn6
            // 
            this.dataGridViewTextBoxColumn6.DataPropertyName = "C6";
            this.dataGridViewTextBoxColumn6.HeaderText = "C6";
            this.dataGridViewTextBoxColumn6.Name = "dataGridViewTextBoxColumn6";
            this.dataGridViewTextBoxColumn6.Width = 35;
            // 
            // dataGridViewTextBoxColumn7
            // 
            this.dataGridViewTextBoxColumn7.DataPropertyName = "C7";
            this.dataGridViewTextBoxColumn7.HeaderText = "C7";
            this.dataGridViewTextBoxColumn7.Name = "dataGridViewTextBoxColumn7";
            this.dataGridViewTextBoxColumn7.Width = 35;
            // 
            // letraBindingSource1
            // 
            this.letraBindingSource1.DataSource = typeof(AdalineV1.Network.data.Letra);
            // 
            // lbLetra
            // 
            this.lbLetra.FormattingEnabled = true;
            this.lbLetra.Items.AddRange(new object[] {
            "A",
            "B",
            "C",
            "D",
            "E",
            "J",
            "K"});
            this.lbLetra.Location = new System.Drawing.Point(319, 119);
            this.lbLetra.Name = "lbLetra";
            this.lbLetra.Size = new System.Drawing.Size(102, 95);
            this.lbLetra.TabIndex = 2;
            this.lbLetra.SelectedIndexChanged += new System.EventHandler(this.lbLetra_SelectedIndexChanged);
            // 
            // btnTestar
            // 
            this.btnTestar.Location = new System.Drawing.Point(333, 253);
            this.btnTestar.Name = "btnTestar";
            this.btnTestar.Size = new System.Drawing.Size(75, 23);
            this.btnTestar.TabIndex = 4;
            this.btnTestar.Text = "Testar";
            this.btnTestar.UseVisualStyleBackColor = true;
            this.btnTestar.Click += new System.EventHandler(this.btnTestar_Click);
            // 
            // textBox1
            // 
            this.textBox1.Location = new System.Drawing.Point(12, 253);
            this.textBox1.Name = "textBox1";
            this.textBox1.Size = new System.Drawing.Size(299, 20);
            this.textBox1.TabIndex = 5;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(12, 237);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(165, 13);
            this.label1.TabIndex = 6;
            this.label1.Text = "Caractere Reconhecido:  (Ruído ";
            // 
            // lblRuido
            // 
            this.lblRuido.AutoSize = true;
            this.lblRuido.Location = new System.Drawing.Point(178, 237);
            this.lblRuido.Name = "lblRuido";
            this.lblRuido.Size = new System.Drawing.Size(28, 13);
            this.lblRuido.TabIndex = 7;
            this.lblRuido.Text = "0,00";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(212, 237);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(18, 13);
            this.label2.TabIndex = 8;
            this.label2.Text = "%)";
            // 
            // fontesBindingSource
            // 
            this.fontesBindingSource.DataSource = typeof(AdalineV1.Network.Fontes);
            // 
            // FrmTeste
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(436, 280);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.lblRuido);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.textBox1);
            this.Controls.Add(this.btnTestar);
            this.Controls.Add(this.lbLetra);
            this.Controls.Add(this.dtgLetra);
            this.Controls.Add(this.groupBox1);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedDialog;
            this.MaximizeBox = false;
            this.MinimizeBox = false;
            this.Name = "FrmTeste";
            this.Text = "Teste da Rede";
            this.Load += new System.EventHandler(this.FrmTeste_Load);
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dtgLetra)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.letraBindingSource1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.letraBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.fontesBindingSource)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.RadioButton rbFonte3;
        private System.Windows.Forms.RadioButton rbFonte2;
        private System.Windows.Forms.RadioButton rbFonte1;
        private System.Windows.Forms.DataGridView dtgLetra;
        private System.Windows.Forms.ListBox lbLetra;
        private System.Windows.Forms.Button btnTestar;
        private System.Windows.Forms.TextBox textBox1;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label lblRuido;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.BindingSource fontesBindingSource;
        private System.Windows.Forms.BindingSource letraBindingSource;
        private System.Windows.Forms.DataGridViewTextBoxColumn c1DataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn c2DataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn c3DataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn c4DataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn c5DataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn c6DataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn c7DataGridViewTextBoxColumn;
        private System.Windows.Forms.BindingSource letraBindingSource1;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn1;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn2;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn3;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn4;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn5;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn6;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn7;
    }
}