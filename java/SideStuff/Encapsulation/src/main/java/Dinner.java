public class Dinner {
    public static void main(String[] args) {
        Chicken charles = new Chicken();
        // You can't access the variable directly because it's been marked as private due to encapsulation
        // Trying to access directly will fail!
        // charles.age = 12;

        // Need to use the setter instead!
        charles.setAge(12);
        charles.setName("Charles");
        charles.setWeight(34);

        // Just like with setting, you have to use the getter in order to access the data back out
        System.out.println(charles.getAge());
        System.out.println(charles.getName());
        System.out.println(charles.getWeight());

    }
}
