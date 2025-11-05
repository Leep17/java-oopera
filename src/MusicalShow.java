public class MusicalShow extends Show{
    private String librettoText;
    private Person musicAuthor;

    public MusicalShow(String title, int duration, Director director, String librettoText, Person musicAuthor) {
        super(title, duration, director);
        this.librettoText = librettoText;
        this.musicAuthor = musicAuthor;
    }

    public void printLibrettoText(){
        System.out.println(librettoText);
    }

}

