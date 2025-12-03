namespace Converter
{
    partial class FormConverter
    {
        private System.ComponentModel.IContainer components = null;

        private System.Windows.Forms.Label lblTitle;
        private System.Windows.Forms.Label lblArrow;
        private System.Windows.Forms.TextBox txtInput;
        private System.Windows.Forms.ComboBox cmbFrom;
        private System.Windows.Forms.ComboBox cmbTo;
        private System.Windows.Forms.Button btnConvert;
        private System.Windows.Forms.Label lblResult;

        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null)) components.Dispose();
            base.Dispose(disposing);
        }

        private void InitializeComponent()
        {
            this.lblTitle = new System.Windows.Forms.Label();
            this.txtInput = new System.Windows.Forms.TextBox();
            this.cmbFrom = new System.Windows.Forms.ComboBox();
            this.lblArrow = new System.Windows.Forms.Label();
            this.cmbTo = new System.Windows.Forms.ComboBox();
            this.btnConvert = new System.Windows.Forms.Button();
            this.lblResult = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // lblTitle
            // 
            this.lblTitle.AutoSize = true;
            this.lblTitle.Location = new System.Drawing.Point(20, 20);
            this.lblTitle.Name = "lblTitle";
            this.lblTitle.Size = new System.Drawing.Size(105, 13);
            this.lblTitle.TabIndex = 0;
            this.lblTitle.Text = "Конвертер величин";
            // 
            // txtInput
            // 
            this.txtInput.Location = new System.Drawing.Point(23, 50);
            this.txtInput.Name = "txtInput";
            this.txtInput.Size = new System.Drawing.Size(120, 20);
            this.txtInput.TabIndex = 1;
            this.txtInput.Text = "1";
            // 
            // cmbFrom
            // 
            this.cmbFrom.FormattingEnabled = true;
            this.cmbFrom.Items.AddRange(new object[] {
            "Біт",
            "Байт",
            "КБ",
            "МБ",
            "ГБ"});
            this.cmbFrom.Location = new System.Drawing.Point(150, 49);
            this.cmbFrom.Name = "cmbFrom";
            this.cmbFrom.Size = new System.Drawing.Size(60, 21);
            this.cmbFrom.TabIndex = 2;
            this.cmbFrom.Text = "Байт";
            // 
            // lblArrow
            // 
            this.lblArrow.AutoSize = true;
            this.lblArrow.Location = new System.Drawing.Point(220, 53);
            this.lblArrow.Name = "lblArrow";
            this.lblArrow.Size = new System.Drawing.Size(16, 13);
            this.lblArrow.TabIndex = 3;
            this.lblArrow.Text = "->";
            // 
            // cmbTo
            // 
            this.cmbTo.FormattingEnabled = true;
            this.cmbTo.Items.AddRange(new object[] {
            "Біт",
            "Байт",
            "КБ",
            "МБ",
            "ГБ"});
            this.cmbTo.Location = new System.Drawing.Point(245, 49);
            this.cmbTo.Name = "cmbTo";
            this.cmbTo.Size = new System.Drawing.Size(60, 21);
            this.cmbTo.TabIndex = 4;
            this.cmbTo.Text = "КБ";
            // 
            // btnConvert
            // 
            this.btnConvert.Location = new System.Drawing.Point(23, 90);
            this.btnConvert.Name = "btnConvert";
            this.btnConvert.Size = new System.Drawing.Size(282, 30);
            this.btnConvert.TabIndex = 5;
            this.btnConvert.Text = "Розрахувати";
            this.btnConvert.UseVisualStyleBackColor = true;
            this.btnConvert.Click += new System.EventHandler(this.btnConvert_Click);
            // 
            // lblResult
            // 
            this.lblResult.AutoSize = true;
            this.lblResult.Location = new System.Drawing.Point(23, 140);
            this.lblResult.Name = "lblResult";
            this.lblResult.Size = new System.Drawing.Size(62, 13);
            this.lblResult.TabIndex = 6;
            this.lblResult.Text = "Результат:";
            // 
            // FormConverter
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(340, 200);
            this.Controls.Add(this.lblResult);
            this.Controls.Add(this.btnConvert);
            this.Controls.Add(this.cmbTo);
            this.Controls.Add(this.lblArrow);
            this.Controls.Add(this.cmbFrom);
            this.Controls.Add(this.txtInput);
            this.Controls.Add(this.lblTitle);
            this.Name = "FormConverter";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "FormConverter";
            this.ResumeLayout(false);
            this.PerformLayout();

        }
    }
}