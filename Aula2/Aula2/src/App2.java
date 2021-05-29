public class App2 {
    public static void main(String args[]){     // String args[] é um vetor de strings em java
        Quadrado q = new Quadrado(0, 1, 10);            // Método Construtor
                                                // a variável "q" irá apontar para um novo objeto de classe Quadrado()
                                                // quando o tipo de dado começa com letra maiscúla significa que é uma classe e logo um objeto será criado
                                                // um objeto possui operações e atributos
        int area;
        //q.x = 0;
        //q.y = 0;
        //q.lado = 10;

        q.calcularArea();
        System.out.println("Hello, World!");
    }
}
