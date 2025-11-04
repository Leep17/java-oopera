public class Choreographer extends Person {
    private int numberOfBaletShows;

    public Choreographer(int height, Gender gender, String surname, String name, int numberOfBaletShows) {
        super(height, gender, surname, name);
        this.numberOfBaletShows = numberOfBaletShows;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname();
    }
}
