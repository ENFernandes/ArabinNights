package org.academiadecodigo.bootcamp;
public class MagicLamp {
    private int contGenios;
    private boolean status = true;
    private int contRecycled;
    private final String name;
    public MagicLamp(String name) {
        this.name=name;
    }

    public void newLamp(int nGenios)
    {
        if(status) {
            contGenios = nGenios;
            String[] tGeneis = {"fGeneis", "gGeneis", "GDemon"};
            while (contGenios > 0) {
                if (contGenios % 2 == 0) {
                    esfrega(2, tGeneis[0]);
                } else esfrega(1, tGeneis[1]);
            }
            if (contGenios == 0) {
                esfrega(3, tGeneis[2]);
            }
        }
        else {
            status=true;
            contRecycled++;
            newLamp(nGenios);
        }
    }

    public void esfrega(int npedidos, String tGeneis) {
        switch (tGeneis) {
            case "fGeneis":
                Genie fGenie = new FGenie(npedidos);
                fGenie.concederPedido(tGeneis);

                contGenios--;
                break;
            case "gGeneis":
                Genie gGenie=new GGenie();
                gGenie.concederPedido(tGeneis);
                contGenios--;
                break;
            case "GDemon":
                GDemon gDemon=new GDemon(npedidos);
                gDemon.concederPedido(tGeneis);
                status=gDemon.isStatus();
                break;
        }
    }
    public String toString()
    {
        return "\nA Lampada magica " +name+ " foi reciclada " +contRecycled+ " vezes";
    }

}

