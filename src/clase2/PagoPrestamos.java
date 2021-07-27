package clase2;

import java.util.Scanner;

public class PagoPrestamos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        int plazoMeses = sc.nextInt();
        
        System.out.println(calcularInteres(p, plazoMeses));
    }
    
    public static double calcularInteres(double p, int plazoMeses){
        double interes = (p * 0.03) * plazoMeses;
        return interes;
    }
}
