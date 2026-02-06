package com.example.project;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EventDAO {


    public List<Event> getAllEvents() {
        List<Event> events = new ArrayList<>();
        String sql = "SELECT * FROM events";

        try (Connection conn = DBCJ.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                events.add(new Event(
                        rs.getString("title"),
                        rs.getString("event_date"),
                        rs.getString("location"),
                        rs.getString("prize"),
                        rs.getInt("max_participants"),
                        rs.getInt("duration_day")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return events;
    }


    public void addEvent(Event event) {
        String sql = "INSERT INTO events (title, event_date, location, prize, max_participants, duration_day) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = DBCJ.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, event.getTitle());
            stmt.setString(2, event.getDate());
            stmt.setString(3, event.getLocation());
            stmt.setString(4, event.getPrize());
            stmt.setInt(5, event.getMaxParticipants());
            stmt.setInt(6, event.getDurationDays());

            stmt.executeUpdate();
            System.out.println("com.example.project.Event added to DB successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void deleteEventByTitle(String title) {
        String sql = "DELETE FROM events WHERE title = ?";

        try (Connection conn = DBCJ.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, title);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}