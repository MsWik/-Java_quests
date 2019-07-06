package by.peleng.jav.lesson8;
/*8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
и методами. Задать критерии выбора данных и вывести эти данные на консоль.
Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер n  кредитной карточки находится в заданном интервале*/


public class Customer {
    private int id;
    private String srname;
    private String name;

    public Customer(int id, String srname, String name, String patronymic, String address, long card, long bankAccount) {
        this.id = id;
        this.srname = srname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.card = card;
        this.bankAccount = bankAccount;
    }

    private String patronymic;
    private String address;
    private long card;
    private long bankAccount;

    @Override
    public String toString() {
        return "Покупатель (" +
                "id=" + id +
                ", srname='" + srname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", card=" + card +
                ", bankAccount=" + bankAccount +
                ')';
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setSrname(String srname) {
        this.srname = srname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCard(long card) {
        this.card = card;
    }

    public void setBankAccount(long bankAccount) {
        this.bankAccount = bankAccount;
    }

    public int getId() {
        return id;
    }

    public String getSrname() {
        return srname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getAddress() {
        return address;
    }

    public long getCard() {
        return card;
    }

    public long getBankAccount() {
        return bankAccount;
    }
}


