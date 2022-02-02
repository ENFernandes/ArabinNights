package org.academiadecodigo.bootcamp;

public class FGenie extends Genie{
    private int npedidos;

    public FGenie(int npedidos) {
        super(npedidos);
        System.out.println("eu sou um FGenie e consedite 3 pedidos");
        this.npedidos = npedidos;
    }


    @Override
    public int concederPedido() {
        int cont=0;
        if(cont < npedidos)
        super.concederPedido();
        cont++;
        return -1;
    }
}
