package presenter;
import java.awt.*;

// POJO - Plain Old Java Object
public class Movie {
    public String titulo;
    public String sinopse;
    public String dataDeLancamento;
    public Image Poster;

    public String ToString() {
        return titulo + "\n" + sinopse + "\n" + dataDeLancamento + "\n";
    }
}