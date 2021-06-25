class Ponto3D extends Ponto2D{
    private double z;
    
    Ponto3D(double x, double y, double z){ 
        x = _x;     //* as variáveis x e y deveriam ser declaradas com o método super(), da seguinte...
        y = _y;     //* ... maneira: super(x, y); ao invés de serem atribuidas a _x e _y respectivamente
        z = _z;     //* a variável "_z" não está declarada como parâmetro do método construtor logo...
                    //* ... o atributo z da classe não receberá nenhum argumento, ...
                    //* ... nesse caso o correto seria: this.z = z;  
    }
}