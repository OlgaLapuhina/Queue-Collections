import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static List<Person> generateClients() {
        return List.of(
                new Person("Кира", "Иванова", 4),
                new Person("Ольга", "Скворцова", 3),
                new Person("Игорь", "Сидоров", 5),
                new Person("Алина", "Гаянова", 2),
                new Person("Валентина", "Афанасьева", 1)
        );
    }

    public static void main(String[] args) {
        Queue<Person> attraction = new LinkedList<>(generateClients());

        while (!attraction.isEmpty()) {
            Person participant = attraction.poll();

            int ticketCounter = participant.getTickets();
            if (ticketCounter > 0) {
                System.out.println("Клиент " + participant.getName() + " " + participant.getSurName()
                        + " прокатился на аттракционе, у него осталось: " + participant.getTickets()
                        + " билета/ов");
                participant.setTickets(--ticketCounter);
                attraction.offer(participant);
            }
        }
        System.out.println("У участников аттракциона закончились билеты!");
    }
}



