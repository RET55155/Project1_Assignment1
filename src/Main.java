public class Main {
    public static void main(String[] args) {
        Event event1 = new Event(
                "Jana Bolashak",
                "31.12.2025",
                "Astana",
                "200000tg",
                300,
                5
        );
        Event event2 = new Event(
                "City Hackathon",
                "15.12.2025",
                "Almaty",
                "5000000",
                2500,
                3
        );
        System.out.println("Event 1: ");
        event1.printEventInfo();
        System.out.println("Event 2: ");
        event2.printEventInfo();

        System.out.println("Сравнение - ");
        if (event1.getMaxParticipants() > event2.getMaxParticipants()) {
            System.out.println("Event 1 have more participants than Event 2");
        }
        else {
            System.out.println("Event 2 have more participants than Event 1");
        }
        Participant participant1 = new Participant(
                "Erkosh",
                "mdkwdkwmdk@mail.com",
                17
        );
        System.out.println("Статус Регистраций");

        participant1.register();

        Organizer organizer = new Organizer(
                "Nike",
                "events@nike.kz",
                10
        );
        organizer.organizeEvent(event1);
    }
}
