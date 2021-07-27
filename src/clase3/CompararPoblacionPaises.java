package clase3;

public class CompararPoblacionPaises {

    public static void main(String[] args) {
        
        int anio = 2022;
        double paisA = 25000000;
        double paisB = 18900000;
        double tasaA = 0.02;
        double tasaB = 0.03;
        
        for(anio = 2022; paisA <= paisB; anio++){
            paisA = paisA * tasaA + paisA;
            paisB = paisB * tasaB + paisB;
            anio += 1;
        }
        System.out.println(anio);
    }
    
}
