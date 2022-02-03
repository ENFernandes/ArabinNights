package org.academiadecodigo.bootcamp;

public class GDemon extends Genie{
    private boolean status=true;
    private int npedidos;
    public GDemon(int npedidos) {
        super();
        System.out.println("HAAAAAA JA BATES-TE HHHHO GUNA DE MATOSINHOS,\n EU SOU O GDEMON DA LAMP MAGIC");
        this.npedidos=npedidos;
    }



    @Override
    public void concederPedido(String tGeneis) {
        int cont=0;
        while (cont < npedidos) {
            super.concederPedido(tGeneis);
            cont++;
        }
        status=false;
    }
    @Override
    public boolean isStatus() {
        return status;
    }
    @Override
    public void setStatus(boolean status) {
        this.status = status;
    }
}
