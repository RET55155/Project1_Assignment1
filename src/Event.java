public class Event {
    private String title;
    private String date;
    private String location;
    private String prize;
    private int maxParticipants;
    private int durationDays;

    public Event(String title, String date, String location, String prize, int maxParticipants, int durationDays){
        this.title = title;
        this.date = date;
        this.location = location;
        this.prize = prize;
        this.maxParticipants = maxParticipants;
        this.durationDays = durationDays;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getPrize() {
        return prize;
    }
    public void setPrize(String prize) {
        this.prize = prize;
    }
    public int getMaxParticipants() {
        return maxParticipants;
    }
    public void setMaxParticipants(int maxParticipants) {
        this.maxParticipants = maxParticipants;
    }
    public int getDurationDays() {
        return durationDays;
    }
    public void setDurationDays(int durationDays) {
        this.durationDays = durationDays;
    }

    public void printEventInfo() {
        System.out.println("Event: " + title);
        System.out.println("Date: " + date);
        System.out.println("Location: " + location);
        System.out.println("Prize: " + prize);
        System.out.println("Max participants: " + maxParticipants);
        System.out.println("Duration (days): " + durationDays);
    }

}
