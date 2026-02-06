package com.example.project;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventController {

    private EventDAO dao = new EventDAO();
    @GetMapping
    public List<Event> getEvents() {
        return dao.getAllEvents();
    }

    @PostMapping
    public String addEvent(@RequestBody Event event) {
        dao.addEvent(event);
        return "com.example.project.Event '" + event.getTitle() + "' added successfully!";
    }
}