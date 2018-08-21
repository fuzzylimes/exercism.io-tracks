public class Animal {

    public String makesSound() {
        return "Moooo";
    }

    public static void main(String[] args) {

        Animal bob = new Animal();
        Cat billy = new Cat();
        Dog john = new Dog();

        System.out.println(bob.makesSound());
        System.out.println(billy.makesSound());
        System.out.println(john.makesSound());
    }
}
