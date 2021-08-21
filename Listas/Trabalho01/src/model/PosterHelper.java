package model;
import java.awt.*;

public class PosterHelper {
    private String posterURL;
    private PosterHelperListener listener;
    private Runnable runnable;
    AmazonConnectionManager connectionManager = new AmazonConnectionManager();

    public PosterHelper(){
        runnable = new Runnable() {
            @Override
            public void run(){
                //abre o socket, lê o poster e avisa o listener
                //String response =  connectionManager.requisitarPoster();
            }
        };
    }

    public void setListener(PosterHelperListener listener){
        this.listener = listener;
    }

    public void requestPoster(String posterURL){
        this.posterURL = posterURL;
        (new Thread(runnable)).start();
    }
}
