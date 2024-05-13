public class App {
    public static void main(String[] args) throws Exception {
        var cal=new Calculator();
        System.out.println(cal.Read());
        cal.Print();

        cal.Add(1).Add(2).Print();
        cal.Exponent(3).Print();
        cal.Multiply(2.5).Print();
        cal.Sub(1.5).Print();
        cal.Div(0).Print();
    }
}
