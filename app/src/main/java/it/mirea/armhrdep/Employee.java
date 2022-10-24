package it.mirea.armhrdep;

public class Employee {

    String name;
    String email;
    String secondName;
    String sector;

    public Employee(
            String name,
            String secondName,
            String sector,
            String email
    ) {
        this.name = name;
        this.secondName = secondName;
        this.sector = sector;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getSector() {
        return sector;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
}
