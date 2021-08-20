package presenter;
import com.google.gson.*;
public class RecebedorDeDados {
    private Movie movie;

    public RecebedorDeDados(String dados) {
        montarObjetoMovie(montarObjetoDeJson(dados));
        String posterUrl = jsonObject.get("Poster").getAsString();
        //posterHelper.requestPoster(posterUrl);
    }

    public void montarObjetoMovie(JsonObject jsonObject){
        movie = new Movie();
        movie.titulo = jsonObject.get("Title").getAsString();
        movie.sinopse = jsonObject.get("Plot").getAsString();
        movie.data = jsonObject.get("Released").getAsString();
        String posterUrl = jsonObject.get("Poster").getAsString();
        System.out.println(movie.titulo + "\n" + movie.sinopse + "\n" + movie.data + "\n" + posterUrl);
    }

    public JsonObject montarObjetoDeJson(String dados){
        JsonParser parser = new JsonsParser();
        JsonElement elemento = parser.parse(dados);
        JsonObject jsonObject = elemento.getAsJsonObject();
        return jsonObject;
    }
}