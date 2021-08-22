package model;

import presenter.RecebedorDeDados;

import java.awt.*;

public class PosterHelperListener1 implements PosterHelperListener {
    private RecebedorDeDados recebedorDeDados;

    public PosterHelperListener1(RecebedorDeDados recebedorDeDados){
        this.recebedorDeDados = recebedorDeDados;
    }

    @Override
    public void chegouOPoster(Image Poster) {
        recebedorDeDados.poster = Poster;
        recebedorDeDados.EnviarDadosParaTelaComPoster();
    }
}
