public class Organizer {
    private String name;
    private String contactEmail;
    private int experienceYears;

    public Organizer(String name, String contactEmail, int experienceYears) {
        this.name = name;
        this.contactEmail = contactEmail;
        this.experienceYears = experienceYears;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        if (experienceYears >= 0) {
            this.experienceYears = experienceYears;
        }
    }

    public void organizeEvent(Event event) {
        System.out.println(name + " is organizing event: " + event.getTitle());
    }
}
