package Model;

public class Owner {
    private String name;
    private String surname;

    public Owner(String name, String surname) {
        this.setName(name);
        this.setSurname(surname);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }
}
