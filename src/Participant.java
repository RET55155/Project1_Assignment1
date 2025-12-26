public class Participant extends Person {

    private int age;
    private boolean registered;

    public Participant(String name, String email, int age) {
        super(name, email);
        this.age = age;
        this.registered = false;
    }

    public int getAge() {
        return age;
    }

    public boolean isRegistered() {
        return registered;
    }

    public void register() {
        registered = true;
        System.out.println(name + "you registered!!!");
    }
}