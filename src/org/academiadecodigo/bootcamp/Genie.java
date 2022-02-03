package org.academiadecodigo.bootcamp;

public abstract class Genie {


    public Genie()
    {

    }
    public void concederPedido(String tgenios)
    {
        switch (tgenios){
            case "fGeneis":
                System.out.println("O teu desejo foi-te concedido\n");
                break;
            case "gGeneis":
                System.out.println("O teu desejo foi-te concedido\n");
                break;
            case "GDemon":
                System.out.println("O teu desejo foi-te concedido, mas toma la uma chapada na cara.\n");
                break;
        }
    }

    public abstract boolean isStatus();

    public abstract void setStatus(boolean status);
}
