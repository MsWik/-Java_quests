package by.peleng.java.lesson5.lesson4;

import java.util.*;

public class TreasureGenerator extends TtreasureDescription {
    List<Treasure> hiddenTreasures = new ArrayList<Treasure>();
    private int treasureNumber;

    public List<Treasure> getHiddenTreasures() {
        return hiddenTreasures;
    }

    public void setHiddenTreasures(List<Treasure> hiddenTreasures) {
        this.hiddenTreasures = hiddenTreasures;
    }

    public TreasureGenerator(List<Treasure> hiddenTreasures) {
        this.hiddenTreasures = hiddenTreasures;
    }

    public TreasureGenerator(int treasureNumber) {
        Random random = new Random();

        for (int counter = 0; counter < treasureNumber; counter++) {


            hiddenTreasures.add(counter, new
                    Treasure(treasureName[random.nextInt(treasureName.length)],
                    random.nextInt(10000)));


        }

        this.treasureNumber = treasureNumber;

    }
    public String toStringList(List<Treasure> listTrasure) {
        String reasureList = "";
        int treasureLength = listTrasure.size();
        if (treasureLength != 0) {
            for (int counter = 0; counter < treasureLength; counter++) {
                reasureList += "№ сокровища " + counter +"  "+
                        listTrasure.get(counter).toString() + "\n";
            }
            return reasureList;
        } else {
            return "Список сокровищь пуст! ";
        }
    }

    public TreasureGenerator() {
        Random random = new Random();

        for (int counter = 0; counter < 100; counter++) {


            hiddenTreasures.add(counter, new
                    Treasure(treasureName[random.nextInt(treasureName.length)],
                    random.nextInt(10000)));


        }
        this.treasureNumber = 100;
    }

    @Override
    public String toString() {
        String reasureList = "";
        int treasureLength = hiddenTreasures.size();
        if (treasureLength != 0) {
            for (int counter = 0; counter < treasureLength; counter++) {
                reasureList += "№ сокровища " + counter +"  "+
                        hiddenTreasures.get(counter).toString() + "\n";
            }
            return reasureList;
        } else {
            return "Список сокровищь пуст! ";
        }
    }




    public Treasure searcDear() {
        Treasure treasure = null;
        int treasureLength = hiddenTreasures.size();
        long maximumЗrice = hiddenTreasures.get(0).getCostTreasure();
        for (int counter = 1; counter < treasureLength; counter++) {
            if (hiddenTreasures.get(counter).getCostTreasure() >= maximumЗrice) {
                treasure = hiddenTreasures.get(counter);
                maximumЗrice = hiddenTreasures.get(counter).getCostTreasure();
            }

        }


        return treasure;
    }

    public List<Treasure> giveTreasures(long treasureMaxPrice) {
        List<Treasure> maxPriceTreasures = new ArrayList<Treasure>();
        int treasureLength = hiddenTreasures.size();
        int counterMaxPriceTreasures = 0;
        for (int counter = 0; counter < treasureLength; counter++) {
            if (hiddenTreasures.get(counter).getCostTreasure()<=treasureMaxPrice) {
                treasureMaxPrice -=hiddenTreasures.get(counter).getCostTreasure();
                maxPriceTreasures.add(counterMaxPriceTreasures, hiddenTreasures.get(counter));
                counterMaxPriceTreasures++;
              //  System.out.println(treasureMaxPrice);
          //      System.out.println(hiddenTreasures.get(counter).getCostTreasure());
            }
        if (treasureMaxPrice==0){break;}

        }

        return maxPriceTreasures;
    }

}
