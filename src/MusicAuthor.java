public class MusicAuthor extends Person{
    private int numberOfSongs;

    public MusicAuthor(int height, Gender gender, String surname, String name, int numberOfSongs) {
        super(height, gender, surname, name);
        this.numberOfSongs = numberOfSongs;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname();
    }
}
