import java.util.ArrayList;


public class ArmazenaListener {
    private static ArmazenaListener instance = null;
    private static ArrayList<ContadorListener> lista = new ArrayList();
    //private ArrayList<int> listaValores = new ArrayList();

    //private ArmazenaListener() {}

    public static ArmazenaListener getInstance() {
        if(instance == null){
            instance = new ArmazenaListener();
        }
        return instance;
    }
    
    public void addLista(ContadorListener x){
        lista.add(x);
        //System.out.println("observador adicionado a lista");
    }

    public static void chamaContadores(){
        for(ContadorListener x : lista){
            x.oValorMudou(x.valor);
        }
    }

}
