// TO make a thread, you have to have the class extend thread, as well as start it back in main.
// We also have to supply a run method as that's what's going to be started by `start`
class Hi extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Hello extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadDemo {

    public static void main(String[] args) {

        // Everything by default is being done by the main thread.
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        // These will run serially
        // obj1.show();
        // obj2.show();


        // These will run in parallel
        obj1.start();
        obj2.start();

    }

}
