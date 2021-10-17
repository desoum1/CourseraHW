
class sequence {
  
    static void Fibonacci(int N)
    {   
        
        int n1 = 1;
        int n2 = 1;
        int n3 = n1 + n2;
        
        
        for (int X = 0 ; X < N-1; X=X+1 ) {
            n3 = n1 + n2;
            
            n1=n2;
            n2=n3;
            System.out.print(n1);
            System.out.print(" ");

    }
    }
  
    public static void main(String args[])
    {
        Fibonacci(8);
        
        
    }
}