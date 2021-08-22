package presenter;
import views.*;
import com.google.gson.*;
import model.PosterHelper;

import java.awt.*;

public class RecebedorDeDados {
    public boolean encerrandoSegundaThread = false;
    private Movie movie;
    private String dados;
    private String dadosPanel = "";
    public String posterUrl;
    public Image poster;
    private TelaExibir telaExibir = new TelaExibir();

    public RecebedorDeDados() {
        telaExibir.setViewListener(this);
    }

    public void montarObjetoMovie(JsonObject jsonObject){
        movie = new Movie();
        try {
            movie.titulo = jsonObject.get("Title").getAsString();
            movie.sinopse = jsonObject.get("Plot").getAsString();
            movie.dataDeLancamento = jsonObject.get("Released").getAsString();
            posterUrl = jsonObject.get("Poster").getAsString();
            System.out.println(movie.titulo + "\n" + movie.sinopse + "\n" + movie.dataDeLancamento + "\n" + posterUrl);
        } catch (Exception e) {
            encerrandoSegundaThread = true;
            e.printStackTrace();
        }
    }

    public String montarStringDoFilme(String dados){
        System.out.println(dados);
        if (dados == null){
            dadosPanel = "Filme não Encontrado";
        }
        else{
            JsonObject jsonObject = montarObjetoDeJson(dados);
            montarObjetoMovie(jsonObject);
            dadosPanel = dadosPanel + movie.titulo + "\n" + movie.sinopse + "\n" + movie.dataDeLancamento + "\n" + posterUrl;
        }
        return dadosPanel;
    }

    public JsonObject montarObjetoDeJson(String dados){
        if (dados != "Not found the movie"){
            JsonParser parser = new JsonParser();
            JsonElement elemento = parser.parse(dados);
            JsonObject jsonObject = elemento.getAsJsonObject();
            return jsonObject;
        }
        else {
            return null;
        }
    }

    public void EnviarDadosParaTelaSemPoster(String dados){
        this.dados = dados;
        if (dados == "Not found the movie"){
            telaExibir.RecarregarSemPoster(dados);
        }
        else {
            telaExibir.RecarregarSemPoster(montarStringDoFilme(dados));
        }
    }

    public void EnviarDadosParaTelaComPoster(){
        if (dados != null){
            telaExibir.RecarrregarComPoster(dadosPanel, poster);
        }
    }

    public void SetTelaExibirNull() {
        telaExibir = null;
    }
}