package web.model;

import jdk.jfr.DataAmount;
import org.springframework.stereotype.Component;



@Component


public class Car {


    private String manufacture;
    private String model;
    private int series;

    public Car() {}

    public Car(String manufacture, String model, int series) {
        this.model = model;
        this.series = series;
        this.manufacture = manufacture;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(Long id) {
        this.manufacture = manufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
