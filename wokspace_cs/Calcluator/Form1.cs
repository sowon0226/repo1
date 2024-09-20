using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Calcluator
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
          
            if (display.Text =="0")
            {
                display.Text = "1";
            }
            else
            {
                display.Text += "1";
            }            
        }

        private void button4_Click(object sender, EventArgs e)
        {
            
            if (display.Text == "0")
            {
                display.Text = "4";
            }
            else
            {
                display.Text += "4";
            }
        }


        private void btn7_Click(object sender, EventArgs e)
        {
            if (display.Text == "0")
            {
                display.Text = "7";
            }
            else
            {
                display.Text += "7";
            }
        }

        private void btn8_Click(object sender, EventArgs e)
        {
            if (display.Text == "0")
            {
                display.Text = "8";
            }
            else
            {
                display.Text += "8";
            }
        }

        private void btn9_Click(object sender, EventArgs e)
        {
            if (display.Text == "0")
            {
                display.Text = "9";
            }
            else
            {
                display.Text += "9";
            }
        }


        private void btn4_Click(object sender, EventArgs e)
        {
            if (display.Text == "0")
            {
                display.Text = "4";
            }
            else
            {
                display.Text += "4";
            }
        }

        private void btn5_Click(object sender, EventArgs e)
        {
            if (display.Text == "0")
            {
                display.Text = "5";
            }
            else
            {
                display.Text += "5";
            }
        }

        private void btn6_Click(object sender, EventArgs e)
        {
            if (display.Text == "0")
            {
                display.Text = "6";
            }
            else
            {
                display.Text += "6";
            }
        }

        private void multi_Click(object sender, EventArgs e)
        {
            display.Text += "*";
        }

        private void btn1_Click(object sender, EventArgs e)
        {
            if (display.Text == "0")
            {
                display.Text = "1";
            }
            else
            {
                display.Text += "1";
            }
        }

        private void btn2_Click(object sender, EventArgs e)
        {
            if (display.Text == "0")
            {
                display.Text = "2";
            }
            else
            {
                display.Text += "2";
            }
        }

        private void btn3_Click(object sender, EventArgs e)
        {
            if (display.Text == "0")
            {
                display.Text = "3";
            }
            else
            {
                display.Text += "3";
            }
        }

        private void minus_Click(object sender, EventArgs e)
        {
            if (display.Text != "0")
            {
                display.Text += "-";
            }
        }

        private void clear_Click(object sender, EventArgs e)
        {
            if (display.Text != "0")
            {
                display.Text = "0";
            }

        }

        private void btn0_Click(object sender, EventArgs e)
        {
            if (display.Text != "0")
            {
                display.Text += "0";
            }
            
        }

        private void equals_Click(object sender, EventArgs e)
        {
            String dText = display .Text;
            // indexof는 찾는 문자가 없으면 -1을 반환한다 (return)
            // if문 작동 조건 = dText.lndexOf는 +가 있으면 작동한다 
            // dText.Split = 특정 문자 기준으로 문자열을 나누어서 배열로 반환한다
            if (dText.IndexOf('+') != -1)
            {
            int result = 0; // 더해서 담을 변수 
              String[] D =  dText.Split('+'); // 배열조건
                for (int i = 0; i< D.Length; i++)
                {
                    result += Int32.Parse(D[i]) ; // 차례대로 result에 더한다 
                    //  Int32.Parse : c#에서 문자열을 int로 형변환 하는 메소드
                }
                //display.Text= ""+ result;
                display.Text= result.ToString();
            }
            if(dText.IndexOf('-') != -1)
            {
                int result = 0;
                String[] D = dText.Split('-');
                for (int i = 0; i < D.Length; i++)
                {
                    result -= Int32.Parse(D[i]);
                }

                display.Text = result.ToString();
            }
        }

        private void divice_Click(object sender, EventArgs e)
        {
            if (display.Text != "0")
            {
                display.Text += "/";
            }
        }
        int num1 = 0;
        String op = null;
        private void plus_Click(object sender, EventArgs e)
        {
            // 지금까지 적은 숫자를 필드 num1에 저장
           this.num1 = Int32.Parse(display.Text);
            // 연산자 저장 
            op = "+";

            display.Text = "0";
        }

        private void multi_Click_1(object sender, EventArgs e)
        {
            if (display.Text != "0")
            {
                display.Text += "*";
            }
        }
    }
}
