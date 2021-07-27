package clase2;

import java.util.Scanner;

public class clase2 {

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         double numeroPorTeclado =  sc.nextDouble();
         System.out.println(funcionCuadrado(numeroPorTeclado));
                 
     }
    public static double funcionCuadrado(double x){
         return x * x;    
    }
}
