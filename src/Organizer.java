public class Organizer extends Person {
    private int experienceYears;

    public Organizer(String name, String contactEmail, int experienceYears) {
        super(name, contactEmail);
        this.experienceYears = experienceYears;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public void organizeEvent(Event event) {
        System.out.println(name + "organizing event: " + event.getTitle());
    }
}