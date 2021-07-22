package az.coders.ada_students.lessons.lesson_15.inheritance;

public class Programmer extends Employer {

    private double bonuses;

    public double getBonuses() {
        return bonuses;
    }

    public void setBonuses(double bonuses) {
        this.bonuses = bonuses;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name=" + getName() +
                "bonuses=" + bonuses +
                '}';
    }
}
