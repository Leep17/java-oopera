import java.util.Objects;

public class Actor extends Person {

    public Actor(int height, Gender gender, String surname, String name) {
        super(height, gender, surname, name);
    }


    @Override
    public String toString() {
        return getName() + " " + getSurname() + " (" + getHeight() + ")";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Actor otheractor = (Actor) obj;
        return Objects.equals(getName(), otheractor.getName()) &&
                Objects.equals(getSurname(), otheractor.getSurname()) &&
                getHeight() == otheractor.getHeight();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getHeight());
    }

}
