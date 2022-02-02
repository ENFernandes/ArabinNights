package org.academiadecodigo.bootcamp;

public class Genie {

    private int nMaxPedidos;
    public Genie(int nMaxPedidos)
    {
        this.nMaxPedidos=nMaxPedidos;
    }
    public int concederPedido()
    {
        System.out.println("O teu desejo foi-te concedido");
        if(nMaxPedidos>0)
        return -1;
        else return 1;
    }
}
