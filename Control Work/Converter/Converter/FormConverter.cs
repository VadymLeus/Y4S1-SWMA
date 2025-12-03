using System;
using System.Windows.Forms;

namespace Converter
{
    public partial class FormConverter : Form
    {
        public FormConverter()
        {
            InitializeComponent();
        }

        private void btnConvert_Click(object sender, EventArgs e)
        {
            try
            {
                if (string.IsNullOrWhiteSpace(txtInput.Text)) return;

                double inputValue = double.Parse(txtInput.Text);
                double valueInBytes = 0;
                string fromUnit = cmbFrom.Text;

                switch (fromUnit)
                {
                    case "Біт": valueInBytes = inputValue / 8.0; break;
                    case "Байт": valueInBytes = inputValue; break;
                    case "КБ": valueInBytes = inputValue * 1024.0; break;
                    case "МБ": valueInBytes = inputValue * 1024.0 * 1024.0; break;
                    case "ГБ": valueInBytes = inputValue * 1024.0 * 1024.0 * 1024.0; break;
                    default: valueInBytes = inputValue; break;
                }

                ByteConverter converter = new ByteConverter(valueInBytes);

                double result = 0;
                string toUnit = cmbTo.Text;

                switch (toUnit)
                {
                    case "Біт": result = converter.ToBits(); break;
                    case "Байт": result = converter.ToBytes(); break;
                    case "КБ": result = converter.ToKiloBytes(); break;
                    case "МБ": result = converter.ToMegaBytes(); break;
                    case "ГБ": result = converter.ToGigaBytes(); break;
                }

                lblResult.Text = string.Format("Результат: {0:0.##########} {1}", result, toUnit);
            }
            catch
            {
                MessageBox.Show("Будь ласка, введіть коректне число!");
            }
        }
    }
}