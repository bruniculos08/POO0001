class Ponto2D {
    private double x, y;

    Ponto2D(double _x, double _y) { //* deveria estar escrito "Ponto2D" (sem espaço), pois o método construtor deve...
        x = _x;                             //* ... ter o mesmo nome da classe qual ele pertence
        y = _y;
    }
    
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
