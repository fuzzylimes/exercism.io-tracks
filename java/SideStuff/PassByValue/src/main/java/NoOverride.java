// https://stackoverflow.com/a/40523/7595951
public class NoOverride {

    public static void main(String[] args) {
        Dog2 aDog = new Dog2("Max");
        // we pass the object to foo
        foo(aDog);
        // aDog variable is still pointing to the "Max" dog when foo(...) returns
        System.out.println(aDog.getName().equals("Max")); // true
        System.out.println(aDog.getName().equals("Fifi")); // false
    }

    public static void foo(Dog2 d) {
        System.out.println(d.getName().equals("Max")); // true
        // change d inside of foo() to point to a new Dog instance "Fifi"
        d = new Dog2("Fifi");
        System.out.println(d.getName().equals("Fifi")); // true
    }
}
