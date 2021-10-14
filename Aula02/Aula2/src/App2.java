public class App2 {
    public static void main(String args[]){
        // String args[] é um vetor de strings em java

        // Chamada do método construtor de Objeto da Classe Quadrado
        Quadrado q = new Quadrado(0, 1, 10);
        // Chamando método construtor de Objeto da Classe Retângulo
        Retangulo r = new Retangulo(0, 0, 8, 10);

        // A variável "q" irá apontar para um novo objeto de classe Quadrado()
        // Quando o tipo de dado começa com letra maiscúla significa que é uma classe e logo um objeto (um objeto possui operações e atributos) será criado
        // q.x = 0; caso o atributo x do quadrato tivesse em acesso public poderiámos alterar o atributo desta maneira
        // q.y = 0; porém como o acesso é private, caso tentássemos isso ocorreria um erro
        // q.lado = 10;

        int area1 = q.calcularArea();
        int area2 = r.calcularArea();

        System.out.println("Area do Quadrado de endereco: " + q + " eh " + area1);
        System.out.println("Area do Retangulo de endereco: " + r + " eh " + area2);
    }
}
