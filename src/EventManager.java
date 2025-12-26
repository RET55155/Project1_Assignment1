import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class EventManager {
    private ArrayList<Event> events = new ArrayList<>();
    public void addEvent(Event event) {
        events.add(event);
    }
    public void showAllEvents() {
        for (Event e : events) {
            System.out.println(e);
        }
    }
    public Event findByTitle(String title) {
        for (Event e : events) {
            if (e.getTitle().equalsIgnoreCase(title)) {
                return e;
            }
        }
        return null;
    }
    public ArrayList<Event> filterByLocation(String location) {
        ArrayList<Event> result = new ArrayList<>();
        for (Event e : events) {
            if (e.getLocation().equalsIgnoreCase(location)) {
                result.add(e);
            }
        }
        return result;
    }
    public void sortByParticipants() {
        Collections.sort(events, new Comparator<Event>() {
            @Override
            public int compare(Event e1, Event e2) {
                return Integer.compare(e1.getMaxParticipants(), e2.getMaxParticipants());
            }
        });
        System.out.println("Sorting completed: ");
    }
}