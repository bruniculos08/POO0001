import java.util.Scanner;
public class Quadrado {
    private double medidaLados;
    
    public Quadrado(double medidaLados){
        this.medidaLados = medidaLados;
    }

    public void setMedidaLados(){
        Scanner scan = new Scanner(System.in);
        medidaLados = scan.nextDouble();
    }

    public double getMedidaLados(){
        return medidaLados;
    }

    public double getArea(){
        return Math.pow(medidaLados, 2);
    }
}