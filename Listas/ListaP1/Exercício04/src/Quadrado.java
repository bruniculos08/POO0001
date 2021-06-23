public class Quadrado {
    private double lado;
    private double area;

    public Quadrado (double lado){
        this.lado = lado;
        area = Math.pow(lado,2);
    }

    public double getAreaQuadrado(){
        return area;
    }
}