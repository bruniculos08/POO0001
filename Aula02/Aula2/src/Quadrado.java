public class Quadrado {
    private int x;
    private int y;
    private int lado;

    // em geral se colocam os atributos antes
    //método construtor; Obs.: o método construtor pode receber argumentos

    public Quadrado(int X, int Y, int Lado) // [acesso] [métodoconstrutor] ([argumentos]): o método construtor já tem seu tipo de retor implicito
    {
        System.out.println("Criando objeto da classe quadrado");
        x = X; // usando this.x não precisaríamos usar a variável 'X' (x maiuscúlo)
        y = Y; // na classe do retângulo há um exemplo do uso de this
        lado = Lado;
    }

    public void setLado (int novoLado) // [acesso] [retorno] [nomedaoperação] ([argumentos])
    {
        x = novoLado;
    }

    public int calcularArea() // [acesso] [retorno] [nomedaoperação] ([argumentos])
    {
        System.out.println("chamando metodo calcular area");
        return lado*lado;
    }

    public int getLado(){
        return lado;
    }
}
