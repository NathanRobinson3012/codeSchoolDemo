namespace Example
{
    public class Runner
    {
        public static void Main(string[] args)
        {
            var cal=new Calculator();
            Console.WriteLine(cal.Read());
            cal.Print();

            cal.Add(1).Add(2).Print();
            cal.Multiply(2.5).Print();
            cal.Sub(1.5).Print();
            cal.Div(0).Print();
        }
    }
}