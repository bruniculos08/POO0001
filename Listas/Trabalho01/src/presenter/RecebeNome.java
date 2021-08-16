package presenter;
import model.OMDBhelper;

public class RecebeNome {
    public RecebeNome(String name){
        System.out.println(name + " teste");
        OMDBhelper helper = new OMDBhelper();
        helper.requisitarDadosDoFilme(name);
    }
}