public class Retangulo extends Quadrado {
    private int altura;

    public Retangulo(int x, int y, int base, int altura){
        super(x,y,base);       // utilizamos o super para enviar dar as informações do quadrado implícito dentro do retângulo
        this.altura = altura;  // atributo = argumento;
    }

    public int calcularArea(){
        return getLado()*altura; // como utilizamos o super, é como se tivessimos o código do quandrado aqui dentro
                                 // porém com as informações que passamos em super(x,y,base)

    }
}
