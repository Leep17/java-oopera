public class Opera extends MusicalShow{
    private int choirSize;

    public Opera(String title, int duration, Director director, String librettoText, Person musicAuthor, int choirSize) {
        super(title, duration, director, librettoText, musicAuthor);
        this.choirSize = choirSize;
    }
}
