public class Cat extends Animal {

    public String makesSound() {
        return "Meow";
    }

    public static void main(String[] args) {
        Cat billy = new Cat();
        Dog john = new Dog();

        System.out.println(billy.makesSound());
        System.out.println(john.makesSound());
    }

}
