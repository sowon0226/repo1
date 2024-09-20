namespace Calcluator
{
    partial class Form1
    {
        /// <summary>
        /// 필수 디자이너 변수입니다.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// 사용 중인 모든 리소스를 정리합니다.
        /// </summary>
        /// <param name="disposing">관리되는 리소스를 삭제해야 하면 true이고, 그렇지 않으면 false입니다.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form 디자이너에서 생성한 코드

        /// <summary>
        /// 디자이너 지원에 필요한 메서드입니다. 
        /// 이 메서드의 내용을 코드 편집기로 수정하지 마세요.
        /// </summary>
        private void InitializeComponent()
        {
            this.btn7 = new System.Windows.Forms.Button();
            this.btn8 = new System.Windows.Forms.Button();
            this.btn9 = new System.Windows.Forms.Button();
            this.divice = new System.Windows.Forms.Button();
            this.multi = new System.Windows.Forms.Button();
            this.btn4 = new System.Windows.Forms.Button();
            this.minus = new System.Windows.Forms.Button();
            this.btn1 = new System.Windows.Forms.Button();
            this.plus = new System.Windows.Forms.Button();
            this.equals = new System.Windows.Forms.Button();
            this.btn0 = new System.Windows.Forms.Button();
            this.clear = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            this.display = new System.Windows.Forms.Label();
            this.btn6 = new System.Windows.Forms.Button();
            this.btn5 = new System.Windows.Forms.Button();
            this.btn2 = new System.Windows.Forms.Button();
            this.btn3 = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // btn7
            // 
            this.btn7.Location = new System.Drawing.Point(8, 152);
            this.btn7.Name = "btn7";
            this.btn7.Size = new System.Drawing.Size(77, 72);
            this.btn7.TabIndex = 0;
            this.btn7.Text = "7";
            this.btn7.UseVisualStyleBackColor = true;
            this.btn7.Click += new System.EventHandler(this.btn7_Click);
            // 
            // btn8
            // 
            this.btn8.Location = new System.Drawing.Point(81, 152);
            this.btn8.Name = "btn8";
            this.btn8.Size = new System.Drawing.Size(75, 72);
            this.btn8.TabIndex = 1;
            this.btn8.Text = "8";
            this.btn8.UseVisualStyleBackColor = true;
            this.btn8.Click += new System.EventHandler(this.btn8_Click);
            // 
            // btn9
            // 
            this.btn9.Location = new System.Drawing.Point(150, 152);
            this.btn9.Name = "btn9";
            this.btn9.Size = new System.Drawing.Size(75, 72);
            this.btn9.TabIndex = 2;
            this.btn9.Text = "9";
            this.btn9.UseVisualStyleBackColor = true;
            this.btn9.Click += new System.EventHandler(this.btn9_Click);
            // 
            // divice
            // 
            this.divice.Location = new System.Drawing.Point(219, 152);
            this.divice.Name = "divice";
            this.divice.Size = new System.Drawing.Size(75, 72);
            this.divice.TabIndex = 3;
            this.divice.Text = "/";
            this.divice.UseVisualStyleBackColor = true;
            this.divice.Click += new System.EventHandler(this.divice_Click);
            // 
            // multi
            // 
            this.multi.Location = new System.Drawing.Point(219, 219);
            this.multi.Name = "multi";
            this.multi.Size = new System.Drawing.Size(75, 72);
            this.multi.TabIndex = 7;
            this.multi.Text = "*";
            this.multi.UseVisualStyleBackColor = true;
            this.multi.Click += new System.EventHandler(this.multi_Click_1);
            // 
            // btn4
            // 
            this.btn4.Location = new System.Drawing.Point(8, 219);
            this.btn4.Name = "btn4";
            this.btn4.Size = new System.Drawing.Size(75, 72);
            this.btn4.TabIndex = 4;
            this.btn4.Text = "4";
            this.btn4.UseVisualStyleBackColor = true;
            this.btn4.Click += new System.EventHandler(this.btn4_Click);
            // 
            // minus
            // 
            this.minus.Location = new System.Drawing.Point(219, 285);
            this.minus.Name = "minus";
            this.minus.Size = new System.Drawing.Size(75, 72);
            this.minus.TabIndex = 11;
            this.minus.Text = "-";
            this.minus.UseVisualStyleBackColor = true;
            this.minus.Click += new System.EventHandler(this.minus_Click);
            // 
            // btn1
            // 
            this.btn1.Location = new System.Drawing.Point(8, 285);
            this.btn1.Name = "btn1";
            this.btn1.Size = new System.Drawing.Size(75, 72);
            this.btn1.TabIndex = 8;
            this.btn1.Text = "1";
            this.btn1.UseVisualStyleBackColor = true;
            this.btn1.Click += new System.EventHandler(this.btn1_Click);
            // 
            // plus
            // 
            this.plus.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F);
            this.plus.Location = new System.Drawing.Point(219, 352);
            this.plus.Name = "plus";
            this.plus.Size = new System.Drawing.Size(75, 72);
            this.plus.TabIndex = 15;
            this.plus.Text = "+";
            this.plus.UseVisualStyleBackColor = true;
            this.plus.Click += new System.EventHandler(this.plus_Click);
            // 
            // equals
            // 
            this.equals.Location = new System.Drawing.Point(150, 352);
            this.equals.Name = "equals";
            this.equals.Size = new System.Drawing.Size(75, 72);
            this.equals.TabIndex = 14;
            this.equals.Text = "=";
            this.equals.UseVisualStyleBackColor = true;
            this.equals.Click += new System.EventHandler(this.equals_Click);
            // 
            // btn0
            // 
            this.btn0.Location = new System.Drawing.Point(81, 352);
            this.btn0.Name = "btn0";
            this.btn0.Size = new System.Drawing.Size(75, 72);
            this.btn0.TabIndex = 13;
            this.btn0.Text = "0";
            this.btn0.UseVisualStyleBackColor = true;
            this.btn0.Click += new System.EventHandler(this.btn0_Click);
            // 
            // clear
            // 
            this.clear.Location = new System.Drawing.Point(8, 352);
            this.clear.Name = "clear";
            this.clear.Size = new System.Drawing.Size(75, 72);
            this.clear.TabIndex = 12;
            this.clear.Text = "c";
            this.clear.UseVisualStyleBackColor = true;
            this.clear.Click += new System.EventHandler(this.clear_Click);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(-5, 0);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(12, 15);
            this.label1.TabIndex = 16;
            this.label1.Text = " ";
            // 
            // display
            // 
            this.display.Dock = System.Windows.Forms.DockStyle.Top;
            this.display.Font = new System.Drawing.Font("맑은 고딕", 19.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.display.Location = new System.Drawing.Point(0, 0);
            this.display.Name = "display";
            this.display.Size = new System.Drawing.Size(306, 82);
            this.display.TabIndex = 17;
            this.display.Text = "0";
            this.display.TextAlign = System.Drawing.ContentAlignment.MiddleRight;
            // 
            // btn6
            // 
            this.btn6.Location = new System.Drawing.Point(150, 219);
            this.btn6.Name = "btn6";
            this.btn6.Size = new System.Drawing.Size(75, 72);
            this.btn6.TabIndex = 20;
            this.btn6.Text = "6";
            this.btn6.UseVisualStyleBackColor = true;
            this.btn6.Click += new System.EventHandler(this.btn6_Click);
            // 
            // btn5
            // 
            this.btn5.Location = new System.Drawing.Point(81, 219);
            this.btn5.Name = "btn5";
            this.btn5.Size = new System.Drawing.Size(75, 72);
            this.btn5.TabIndex = 19;
            this.btn5.Text = "5";
            this.btn5.UseVisualStyleBackColor = true;
            this.btn5.Click += new System.EventHandler(this.btn5_Click);
            // 
            // btn2
            // 
            this.btn2.Location = new System.Drawing.Point(81, 285);
            this.btn2.Name = "btn2";
            this.btn2.Size = new System.Drawing.Size(75, 72);
            this.btn2.TabIndex = 21;
            this.btn2.Text = "2";
            this.btn2.UseVisualStyleBackColor = true;
            this.btn2.Click += new System.EventHandler(this.btn2_Click);
            // 
            // btn3
            // 
            this.btn3.Location = new System.Drawing.Point(150, 285);
            this.btn3.Name = "btn3";
            this.btn3.Size = new System.Drawing.Size(75, 72);
            this.btn3.TabIndex = 22;
            this.btn3.Text = "3";
            this.btn3.UseVisualStyleBackColor = true;
            this.btn3.Click += new System.EventHandler(this.btn3_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(306, 436);
            this.Controls.Add(this.btn3);
            this.Controls.Add(this.btn2);
            this.Controls.Add(this.btn6);
            this.Controls.Add(this.btn5);
            this.Controls.Add(this.display);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.plus);
            this.Controls.Add(this.equals);
            this.Controls.Add(this.btn0);
            this.Controls.Add(this.clear);
            this.Controls.Add(this.minus);
            this.Controls.Add(this.btn1);
            this.Controls.Add(this.multi);
            this.Controls.Add(this.btn4);
            this.Controls.Add(this.divice);
            this.Controls.Add(this.btn9);
            this.Controls.Add(this.btn8);
            this.Controls.Add(this.btn7);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button btn7;
        private System.Windows.Forms.Button btn8;
        private System.Windows.Forms.Button btn9;
        private System.Windows.Forms.Button divice;
        private System.Windows.Forms.Button multi;
        private System.Windows.Forms.Button btn4;
        private System.Windows.Forms.Button minus;
        private System.Windows.Forms.Button btn1;
        private System.Windows.Forms.Button plus;
        private System.Windows.Forms.Button equals;
        private System.Windows.Forms.Button btn0;
        private System.Windows.Forms.Button clear;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label display;
        private System.Windows.Forms.Button btn6;
        private System.Windows.Forms.Button btn5;
        private System.Windows.Forms.Button btn2;
        private System.Windows.Forms.Button btn3;
    }
}

