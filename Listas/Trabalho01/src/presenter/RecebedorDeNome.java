package presenter;
import model.OMDBHelper;
import model.OMDBReceiver;

public class RecebedorDeNome {
    public RecebedorDeNome(String name){
        name = name.replace(' ', '+');
        enviarParaPesquisa(name);
    }

    public void enviarParaPesquisa(String name) {
        OMDBHelper helper = new OMDBHelper();
        helper.iniciarRequisitarDados(name);
    }
}