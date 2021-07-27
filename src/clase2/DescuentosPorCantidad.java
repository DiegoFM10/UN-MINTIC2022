
package clase2;

import java.util.Scanner;


public class DescuentosPorCantidad {

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroDeProductos = sc.nextInt();
        double valorDelProducto = sc.nextDouble();
        
        double precioTotal = calcularPrecioTotal(numeroDeProductos, valorDelProducto);
        System.out.println(precioTotal);
    }
    
    public static double calcularPrecioTotal(int numeroDeProductos, double valorDelProducto){
        if(numeroDeProductos > 20){
            return numeroDeProductos * valorDelProducto * 0.8;
        }
        else if(numeroDeProductos > 10){
            return numeroDeProductos * valorDelProducto * 0.9;
        }
        else if(numeroDeProductos > 5){
            return numeroDeProductos * valorDelProducto * 0.95;
        }
        else{
            return numeroDeProductos * valorDelProducto;
        }
    }
}
