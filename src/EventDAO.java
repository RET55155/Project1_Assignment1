import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EventDAO {

    public void addEvent(Event event) {
        String sql = "INSERT INTO events " +
                "(title, event_date, location, prize, max_participants, duration_day) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = DBCJ.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, event.getTitle());
            stmt.setString(2, event.getDate());
            stmt.setString(3, event.getLocation());
            stmt.setString(4, event.getPrize());
            stmt.setInt(5, event.getMaxParticipants());
            stmt.setInt(6, event.getDurationDays());

            stmt.executeUpdate();
            System.out.println("Event added to db");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteEventByTitle(String title) {
        String sql = "DELETE FROM events WHERE title = ?";

        try (Connection conn = DBCJ.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, title);
            int rowsDeleted = stmt.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println("Event " + title + "deleted!");
            } else {
                System.out.println("No event found with title: " + title);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
