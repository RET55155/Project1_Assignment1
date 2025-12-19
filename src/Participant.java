public class Participant {
    private String name;
    private String email;
    private int age;
    private boolean registered;

    public Participant(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.registered = false;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public boolean isRegistered() {
        return registered;
    }
    public void register() {
        registered = true;
        System.out.println(name + " your registered");
    }
}
