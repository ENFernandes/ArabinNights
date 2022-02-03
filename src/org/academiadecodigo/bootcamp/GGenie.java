package org.academiadecodigo.bootcamp;

public class GGenie extends Genie{
    public GGenie() {
        super();
        System.out.println("eu sou um GGenie e estou cansado das tuas manias por isso so te vou conceder 1 pedido");
    }

    @Override
    public void concederPedido(String tGeneis) {
        super.concederPedido(tGeneis);
    }

    @Override
    public boolean isStatus() {
        return false;
    }

    @Override
    public void setStatus(boolean status) {

    }


}
