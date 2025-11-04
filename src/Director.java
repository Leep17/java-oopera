public class Director extends Person {

    private int numberOfShows;

    public Director(int height, Gender gender, String surname, String name, int numberOfShows) {
        super(height, gender, surname, name);
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname();
    }

}
