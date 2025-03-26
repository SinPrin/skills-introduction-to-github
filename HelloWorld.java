// import java.io.Closeable;
import java.util.Scanner;
// package java.pri
public class HelloWorld{
     public static void main(String[] args) {
         System.out.print("Enter three numbers to add : ");
         
         Scanner sc = new Scanner(System.in);
         System.out.println(5>2 && 5>3);


        //  System.out.println(sc.hasNextInt());
        //  int a= sc.nextInt();
        //  int b= sc.nextInt();
        //  int c= sc.nextInt(); 
        //  int sum = a+b+c;
        //  System.out.print("sum of these no. is :" );
        //  System.out.println(sum);

        // boolean s= sc.hasNextInt();
        // System.out.println(s);

        // String str = sc.next();

        // String str = sc.nextLine();
        // System.out.println(str);
        sc.close();
        
    }

}