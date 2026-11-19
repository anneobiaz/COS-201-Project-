public class Physics {

    private static float gravity = 9.8f;

    float getGravity() {
        return gravity;
    }

    void setGravity(float gravity) {
        Physics.gravity = gravity;
    }

    public static float potentialEnergy(float mass, float height) {
        return mass * gravity * height;
    }

    float v(float u, float a, float t) {
        return u + a * t;
    }
}