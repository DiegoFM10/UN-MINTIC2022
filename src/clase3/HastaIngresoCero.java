package clase3;

import java.util.Scanner;

public class HastaIngresoCero {

       public static void main(String[] args) {
           int suma = 0;
           Scanner sc = new Scanner(System.in);
           while(true){
               System.out.print("Ingrese un número entero");
               System.out.println(" a sumar; oprima 0 para salir");
               int dato = sc.nextInt();
               if (dato == 0)
                   break;
               suma += dato;
               System.out.println(suma);
           }
       }
    
}
