public class Main {
    public static void main(String[] args) {
    var male = new Person("Joao");
    male.setAge(12);

    var female = new Person("Maria");
    female.setAge(10);
    System.out.println("male name: " + male.getName() + " and age: " + male.getAge());
    System.out.println("female name: " + female.getName() + " and age: " + female.getAge());
    }
}