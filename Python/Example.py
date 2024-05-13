import Calculator

if __name__=="__main__":
    cal=Calculator.Calculator();
    print(cal.Read())
    cal.Print()
    
    cal.Add(1).Add(2).Print()
    cal.Exponent(3).Print();

    cal.Multiply(2.5).Print()
    cal.Sub(1.5).Print()
    cal.Div(0).Print()