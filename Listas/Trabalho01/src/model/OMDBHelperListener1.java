package model;

import presenter.RecebedorDeDados;

public class OMDBHelperListener1 implements OMDBHelperListener{
    private  RecebedorDeDados recebedorDeDados;

    public OMDBHelperListener1(RecebedorDeDados recebedorDeDados){
        this.recebedorDeDados = recebedorDeDados;
    }

    public void chegaramOsDadosDoFilme(String dadosDoFilme) {
        recebedorDeDados.EnviarDadosParaTelaSemPoster(dadosDoFilme);
    }
}
