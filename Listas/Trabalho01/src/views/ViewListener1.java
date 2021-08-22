package views;

import presenter.RecebedorDeDados;

public class ViewListener1 implements ViewListener {
    private RecebedorDeDados recebedorDeDados;

    public ViewListener1 (RecebedorDeDados recebedorDeDados){
        this.recebedorDeDados = recebedorDeDados;
    }

    public void setTelaExbirNull(){
        recebedorDeDados.SetTelaExibirNull();
    }

    @Override
    public void telaMudou() {

    }
}
