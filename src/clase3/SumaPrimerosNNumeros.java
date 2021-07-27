package clase3;

public class SumaPrimerosNNumeros {

    public static void main(String[] args) {
        sumaFor(7);
    }
    
    public static void sumaFor(int n){
        int s = 0;
        for(int i = 0; i <= n ; i++){
            s += i;
        }
        System.out.println(s);
    }
}
