package by.peleng.java.lesson5.lesson5.Pack;

import by.peleng.java.lesson5.lesson5.impl.Command;

public class Green extends Pack implements Command {
    private String leaves;
   public final static String namePack = "ЛИСТЬЯ";

    public String getLeaves() {
        return leaves;
    }

    public void setLeaves(String leaves) {
        this.leaves = leaves;
    }

    public Green(int price, String name, String color, String leaves) {
        super(price, name, color);
        this.leaves = leaves;
    }

    @Override
    public String toString() {

        return  super.toString() + "Название лисьев " + leaves;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Green green = (Green) o;

        return leaves.equals(green.leaves);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + leaves.hashCode();
        return result;
    }
    @Override
    public String esecute(String[] params) {
        return namePack;
    }
}
