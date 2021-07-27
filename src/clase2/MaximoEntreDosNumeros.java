package clase2;

import static clase2.valorAbsoluto.valAbsoluto;
import java.util.Scanner;

public class MaximoEntreDosNumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double maximo = max(a,b);
        System.out.println(maximo);
        
        double maximoConOpTernario = maxConOperadorTernario(a,b);
        System.out.println(maximoConOpTernario);
    }
    public static double max(double a, double b){
        if (a > b){
            return a;
        }
        else{
            return b;
        }
    }
    public static double maxConOperadorTernario(double a, double b){
        return a > b ? a : b;
    }
}
