import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        EventManager manager = new EventManager();
        manager.addEvent(new Event("Jana Bolashak", "31.12.2025", "Astana", "200000tg", 300, 5));
        manager.addEvent(new Event("City Hackathon", "15.12.2025", "Almaty", "5000000", 2500, 3));

        ArrayList<Person> users = new ArrayList<>();

        users.add(new Participant("Erkosh", "era@mail.com", 17));
        users.add(new Organizer("Nike", "events@nike.kz", 10));

        System.out.println("System Users: ");
        for (Person p : users) {
            System.out.println(p);
        }

        System.out.println("Sorting: ");
        manager.sortByParticipants();
        manager.showAllEvents();

        System.out.println("Search: ");
        Event found = manager.findByTitle("Jana Bolashak");
        if (found != null) {
            System.out.println("Found: " + found);
        }

        if (DBCJ.connect() != null) {
            System.out.println("Connected to PostgreSQL!");
        } else {
            System.out.println("Connection failed");
        }

        Event event = new Event(
                "Java Conference",
                "2026-03-10",
                "Almaty",
                "Certificate",
                100,
                2
        );

        EventDAO dao = new EventDAO();
        dao.addEvent(event);

        dao.deleteEventByTitle("Test Event");
    }
}