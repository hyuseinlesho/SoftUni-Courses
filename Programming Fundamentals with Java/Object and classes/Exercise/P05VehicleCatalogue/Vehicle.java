package Exercise.P05VehicleCatalogue;

public class Vehicle {
    private String typeOfVehicle;
    private String model;
    private String color;
    private int horsepower;

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public Vehicle(String typeOfVehicle, String model, String color, int horsepower) {
        this.typeOfVehicle = typeOfVehicle;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }
}
