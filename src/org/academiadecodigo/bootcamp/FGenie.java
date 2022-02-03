package org.academiadecodigo.bootcamp;

public class FGenie extends Genie{
    private int npedidos;

    public FGenie(int npedidos) {
        super();
        System.out.println("Eu sou um FGenie e conscedo-te "+ npedidos +" pedidos");
        this.npedidos = npedidos;
    }


    @Override
    public void concederPedido(String tGeneis) {
        int cont=0;
        while (cont < npedidos) {
            super.concederPedido(tGeneis);
            cont++;
        }
    }

    @Override
    public boolean isStatus() {
        return false;
    }

    @Override
    public void setStatus(boolean status) {

    }

}
