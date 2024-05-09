class Calculator:
    Ans=None
    
    def __init__(self):
        self.Ans=0
        
    def Add(self,input):
        self.Ans+=input
        return self
    def Sub(self,input):
        self.Ans-=input
        return self
    def Multiply(self,input):
        self.Ans*=input
        return self
    def Div(self,input):
        self.Ans/=input
        return self
    Read=lambda self:self.Ans
    Print=lambda self:print(f"Ans currently at: {self.Ans}")