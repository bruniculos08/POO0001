public class Contador {
    private int valor = 0;
    private ContadorListener observador;

    public Contador(){
    }

    public void incremetarValor(){
        valor++;
        observador.onChange(valor);
    }

    public void decrementarValor(){
        valor--;
        observador.onChange(valor);
    }
}
