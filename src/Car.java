public class Car {

<<<<<<< HEAD
    private boolean wheels;
    private int cylinders;
=======
    private final boolean wheels;
    private final int cylinders;
>>>>>>> c2c96c2 (add car class)

    public Car(boolean wheels, int cylinders) {
        this.wheels = wheels;
        this.cylinders = cylinders;
    }
<<<<<<< HEAD

    public boolean isWheels() {
        return wheels;
    }

    public void setWheels(boolean wheels) {
        this.wheels = wheels;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String toString() {
        return "Wheels: " + wheels + " cylinders: " + cylinders + "\n";
    }
=======
>>>>>>> c2c96c2 (add car class)
}
