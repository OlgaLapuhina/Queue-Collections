public class Person {
    private String name;
    private String surName;
    private int tickets;

    public Person(String name, String surName, int tickets) {
        this.name = name;
        this.surName = surName;
        this.tickets = tickets;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }
}
