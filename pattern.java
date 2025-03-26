public class pattern {

    // problem 1st

    // static int Avg(int ... arr)
    // {
    //     int c=0;
    //     for(int a: arr)
    //     {
    //         c += a;
    //     }
    //     return c;
    // } 

    // problem 2nd

    static int fib(int n)
    {
        if(n==1 || n==2)
        {
            return n-1;
        }
        else
        {
            return fib(n-1) + fib(n-2);
        }
    }

// problem 3rd

    static int factorial(int n)
    {
        if(n==1)
         return 1;
        else
         return n*factorial(n-1); 
    }

//  Problem 4th 

    // static void printn(int n)
    // {
    //     if(n==0)
    //      return ;
    //     System.out.print("* ");
        
    //     printn(n-1);
    // }
    // static void pattern1(int num , int i)
    // {
    //     if(num == 0)
    //      return ;

    //     printn(i); 
    //     System.out.println();

    //     pattern1(num-1, i-1);
    // }

    static void pat(int n)
    {
        if(n>0)
         pat(n-1);
        
        for(int i=0;i<n;i++)
         {
            System.out.print("* ");
         } 
         System.out.println();

        
        
    }

    public static void main(String[] args) {

        // 1st problem of average 
        // System.out.println(Avg(5,2,3,4));

        // 2nd problem of fibonacci 
        // System.out.println("Result of fib is " + fib(5));

        // 3rd problem of factorial
        // System.out.println("result of factorial is " + factorial(2));

        // 4th Problem of pattern 
    //  System.out.println("Print pattern is " );
    //  pattern1(5, 5);
        pat(5);








    }
    
}
