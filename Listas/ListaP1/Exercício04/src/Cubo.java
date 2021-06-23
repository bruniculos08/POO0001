public class Cubo extends Quadrado{
    public double lado;
    public double area;

    public Cubo(double lado){
        super(lado);
        this.lado = lado;
        area = 6*(getAreaQuadrado());
    }

    public double getAreaCubo(){
        return area;
    }
}