public class Calculator {
    private double Ans;
    public Calculator(){
        this.Ans=0;
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
    public Calculator Exponent(double input) {
        this.Ans = Math.pow(this.Ans,input); return this;
    }
    public double Read(){
        return this.Ans;
    }
    public void Print(){System.out.println(String.format("Ans currently at: %f", this.Ans));}
}
