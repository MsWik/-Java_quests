package by.peleng.jav.lesson2_04;
/*4 Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
всем счетам, имеющим положительный и отрицательный балансы отдельно.*/
public class Invoice {
   private float money;
   private boolean lock=false;
   private long nnumber;

    @Override
    public String toString() {
        return "money=" + money +
                ", lock=" + lock +
                ", nnumber=" + nnumber + " ";
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public boolean isLock() {
        return lock;
    }

    public void setLock(boolean lock) {
        this.lock = lock;
    }

    public long getNnumber() {
        return nnumber;
    }

    public void setNnumber(long nnumber) {
        this.nnumber = nnumber;
    }

    public Invoice(float money, boolean lock, long nnumber) {
        this.money = money;
        this.lock = lock;
        this.nnumber = nnumber;
    }
    public Invoice() {
        this.money = money;
        this.lock = lock;
        this.nnumber = nnumber;
    }
}
