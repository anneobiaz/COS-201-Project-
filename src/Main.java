public class Main {
    public static void main(String[] args) {
        Physics physics = new Physics();

        System.out.println(Physics.potentialEnergy(10f, 5f));
        System.out.println(physics.v(10f, 30f, 20f));

        Loops loops = new Loops();
        //loops.whileLoops();
        //loops.doWhileLoops();
        loops.forLoop();
    }
}