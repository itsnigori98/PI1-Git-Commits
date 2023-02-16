public class Car {

    private boolean wheels;
    private int cylinders;

    public Car(boolean wheels, int cylinders) {
        this.wheels = wheels;
        this.cylinders = cylinders;
    }

    public boolean isWheels() {
        return wheels;
    }

<<<<<<< HEAD
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
        return "Wheels: " + wheels + "cylinders: " + cylinders + "\n";
    }
=======
    public int getCylinders() {
        return cylinders;
    }
>>>>>>> 1d742be (add getters on car)
}
