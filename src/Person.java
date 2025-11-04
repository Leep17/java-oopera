import java.util.Objects;
public class Person {
    private String name;
    private String surname;
    Gender gender;
    private int height;

    public Person(int height, Gender gender, String surname, String name) {
        this.height = height;
        this.gender = gender;
        this.surname = surname;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public String getSurname() {
        return surname;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname) &&
                gender == person.gender &&
                height == person.height;
    }
}
