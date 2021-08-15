import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

import model.OMDBhelper;
import model.OMDBreceiver;
import views.TelaInicial;

public class App {
    public static void main(String[] args) throws Exception {
        OMDBhelper helper = new OMDBhelper();
        helper.requisitarDadosDoFilme("Pulp+Fiction");
        TelaInicial janela = new TelaInicial();
    }
}