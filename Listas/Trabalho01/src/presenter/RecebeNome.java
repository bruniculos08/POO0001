package presenter;
import model.OMDBhelper;
import model.OMDBreceiver;

public class RecebeNome {
    public RecebeNome(String name){
        name = name.replace(' ', '+');
        OMDBhelper helper = new OMDBhelper();
        helper.requisitarDadosDoFilme(name);
    }
}