public class Dog extends Animal {

    public String makesSound() {
        return "Woof";
    }

    public static void main(String[] args) {
        Cat billy = new Cat();
        Dog john = new Dog();

        System.out.println(billy.makesSound());
        System.out.println(john.makesSound());
    }

}
