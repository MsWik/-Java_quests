package by.peleng.java.lesson5.lesson4;


import java.util.List;

public class TreasureSave extends TreasureGenerator {


    @Override
    public String toString() {

        return "TreasureHunt{" +
                "hiddenTreasures=" + hiddenTreasures +
                '}';
    }

    public String toStringList(List<Treasure> listTrasure) {
        String reasureList = "";
        int treasureLength = listTrasure.size();
        if (treasureLength != 0) {
            for (int counter = 0; counter < treasureLength; counter++) {
                reasureList += "№ сокровища " + counter + "  Описание сокровища: " +
                        listTrasure.get(counter).toString() + "\n";
            }
            return reasureList;
        } else {
            return "Список сокровищь пуст! ";
        }
    }
}
