package clase2;

import java.util.Scanner;

public class valorAbsoluto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        System.out.println(valAbsoluto(n));
    }
    public static double valAbsoluto(double x){
        double valor;
        if (x >= 0 ){
            valor = x;
        }
        else{
            valor = -x;
        }
        return valor;
    }
}
