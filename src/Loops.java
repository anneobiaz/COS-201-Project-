public class Loops {
    void whileLoops() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }

    void doWhileLoops() {
        int i = 10;
        do {
            System.out.println("Do-while loop: " + i);
            i++;
        } while (i < 20);
    }

    // for loop
    void forLoop() {
        for (int i = 0; i < 10; i++) {
            System.out.println("For loop: " + i);
            for (int j = 0; j < 10; j++) {
                System.out.println("  Inner loop: " + j);
            }
        }
    }
}
// using a for loop  identify all prime number between 1 and 500

//assignment write a method in java, that generate the first n of the figurrnatry sequence