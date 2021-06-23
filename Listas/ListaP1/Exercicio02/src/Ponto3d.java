public class Ponto3d extends Ponto2d {
    private double z;
    Ponto3d (double x, double y, double z) {
        super(x, y);     //^ o erro era não haver o comando super e haver os comando em relação 
                         //^ à variáveis privadas da classe mãe.
        //! this.x = x;       
        //! this.y = y;
        this.z = z;
    }
    
}
