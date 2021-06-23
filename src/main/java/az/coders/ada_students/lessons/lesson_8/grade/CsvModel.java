package az.coders.ada_students.lessons.lesson_8.grade;

import java.util.Objects;

public class CsvModel implements Comparable<CsvModel> {

    private String name;
    private String country;

    public CsvModel() {
    }

    public CsvModel(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CsvModel)) return false;
        CsvModel csvModel = (CsvModel) o;
        return name.equals(csvModel.name) && country.equals(csvModel.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, country);
    }

    @Override
    public String toString() {
        return "CsvModel{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public void execute() {
        System.out.println("Executing: " + this.name + "...");
        System.out.println("Completed!");
    }

    @Override
    public int compareTo(CsvModel o) {
        return 0;
    }
}