package model;
import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class PosterHelper {
    private String posterURL;
    private PosterHelperListener listener;
    public Image poster = null;
    private Runnable runnable;

    public PosterHelper(String posterURL){
        this.posterURL = posterURL;
        runnable = new Runnable() {
            @Override
            public void run() {
                //abre o socket, lê o poster e avisa o listener
                //String response =  connectionManager.requisitarPoster();
                    try {
                        URL url = new URL(posterURL);
                        poster = ImageIO.read(url);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                Thread.currentThread().stop();
            }
        };
    }

    public void setListener(PosterHelperListener listener){
        this.listener = listener;
    }

    public void requestPoster(){
        (new Thread(runnable)).start();
    }
}
