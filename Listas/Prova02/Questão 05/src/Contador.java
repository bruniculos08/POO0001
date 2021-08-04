import java.util.ArrayList;


public class Contador {
    private int valor = 0;
    public ContadorListener observador = new ContadorListener();
    public ArmazenaListener armazena = ArmazenaListener.getInstance();
    
    public Contador(){
        armazena.addLista(observador);
    }
    public void incremetarValor(){
        valor++;
        observador.oValorMudou(valor);
    }

    public void decrementarValor(){
        valor--;
        observador.oValorMudou(valor);
    }
}
