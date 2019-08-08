package by.peleng.java.lesson5.lesson5.flower;

import by.peleng.java.lesson5.lesson5.impl.Command;

public class Rose extends Flover  implements Command {
    public final static String nameFlow="РОЗА";

   private boolean spikes;


    public boolean isSpikes() {
        return spikes;
    }

    public void setSpikes(boolean spikes) {
        this.spikes = spikes;
    }


    public Rose(int price, String freshness, long lenght, String name, boolean spikes) {
        super(price, freshness, lenght, name);
        this.spikes = spikes;
    }

    @Override
    public String toString() {
        String str=null;
        if (spikes==true){str="С шипами";} else {str="Без шипов";}

        return super.toString() +"  "+ "Роза " +
                str
                ;
    }

    @Override
    public String esecute(String[] params) {
        return nameFlow;
    }
}
