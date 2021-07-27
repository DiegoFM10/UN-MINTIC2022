package clase3;

public class NumeroMenorRepresentable {
 
    public static void main(String[] args) {
        System.out.println(minMaquina());
        System.out.println(minMaquinaDoWhile());
    }
    
    public static double minMaquina(){
        double Xo = 1.0;
        double Xi = Xo / 2.0;
        while(Xi > 0.0){
            Xo = Xi;
            Xi = Xo /2.0;
        }
        return Xo;
    }
    
    public static double minMaquinaDoWhile(){
        double Xo = 1.0;
        double Xi = Xo / 2.0;
        do {
            Xo = Xi;
            Xi = Xo /2.0;
        }
        while(Xi > 0.0);        
        
        return Xo;
    }
    
    
}
