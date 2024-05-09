namespace Example
{
    public class Calculator
    {
        private double Ans;
        public Calculator(){
            Ans = 0;
        }
        public Calculator Add(double input){
            this.Ans += input; return this;
        }
        public Calculator Sub(double input) {
            this.Ans -= input; return this;
        }
        public Calculator Multiply(double input) {
            this.Ans *= input; return this;
        }
        public Calculator Div(double input) {
            this.Ans/=input; return this;
        }
        public double Read() =>this.Ans;
        public void Print()=>Console.WriteLine(string.Format("Ans currently at: {0}", this.Ans));
    }
}