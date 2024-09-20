using Oracle.ManagedDataAccess.Client;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace db
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            string connectionString = "" +
        "Data Source=" +
        "(" +
        " DESCRIPTION=" +
        " (" +
        " ADDRESS=" +
        " (PROTOCOL=TCP)" +
        " (HOST=125.181.132.133)" +
        " (PORT=51521)" +
        " )" +
        " (" +
        " CONNECT_DATA=" +
        " (" +
        " SERVICE_NAME=xe" +
        " SERVICE_NAME=xe" +
        " )" +
        " )" +
        ");" +
        "User Id=scott2_8;" +
        "Password=tiger;";

            using (OracleConnection connection = new OracleConnection(connectionString))
            {
                try
                {
                    // db 접속
                    connection.Open(); 

                    // sql 준비
                    string query = "SELECT * FROM EMP";
                    OracleCommand command = new OracleCommand(query, connection);

                    // sql 실행
                    OracleDataAdapter adapter = new OracleDataAdapter(command);

                    // 결과 활용
                    DataTable dataTable = new DataTable();
                    adapter.Fill(dataTable);

                    dataGridView1.DataSource = dataTable;
                }
                catch (Exception ex)
                {
                    MessageBox.Show("오류 발생: " + ex.Message);
                }
            }
        }
    }
}
