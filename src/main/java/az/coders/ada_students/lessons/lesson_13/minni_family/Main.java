package az.coders.ada_students.lessons.lesson_13.minni_family;

public class Main {

    public static void main(String[] args) {
        Human human = new Human();
        human.setName("Nabat");
        human.setSurname("Qasimzade");
        human.setAge(19);
        human.setIq(90);
        Human father = new Human("Father name", "Father surname");
        human.setFather(father);
        human.setMother(new Human("Mother name", "Mother surname"));

        Pet pet = new Pet();
        pet.setNickname("Bars");
        pet.setAge(2);
        pet.setTrickLevel(100);
        pet.setSpecies("Qurd basar");
        pet.setHabits(new String[]{"walking", "barking", "playing"});

        human.setPet(pet);

        System.out.println(human);
    }
}
