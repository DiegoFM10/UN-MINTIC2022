
package clase2;

import java.util.Scanner;

public class AreaDeUnRectangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double largo = sc.nextDouble();
        double ancho = sc.nextDouble();
        double area = areaRectangulo(largo, ancho);
        System.out.println(area);
    }
    public static double areaRectangulo(double l, double a){
        return l * a;
    }
}
