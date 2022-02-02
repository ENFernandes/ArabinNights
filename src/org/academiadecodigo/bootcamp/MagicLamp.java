package org.academiadecodigo.bootcamp;


public class MagicLamp {
    private int cont;

    public MagicLamp()
    {
    }
    public Genie esfrega()
    {
        if (cont < 3) {
            if (cont % 2 == 0) {
                FGenie fGenie=new FGenie(6);
                if(fGenie.concederPedido()==-1){
                    cont++;
                }
                return fGenie;
            } else {
                GGenie gGenie = new GGenie(2);
                gGenie.concederPedido();
                cont++;
                return gGenie;
            }
        }
         else {
             GDemon gDemon=new GDemon(2);
             cont++;
             return gDemon;
         }
    } 
}
