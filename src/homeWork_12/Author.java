package homeWork_12;

public class Author {

    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Author() {
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    /*
    Добавлено : toString, equals, hashCode
    */

    public String toString() {
        return getName() + " " + getSurname();
    }

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author author = (Author) other;
        return toString().equals(other.toString());
    }

    public int hashCode() {
        return java.util.Objects.hash(toString());
    }


}
