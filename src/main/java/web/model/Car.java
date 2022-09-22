package web.model;

public class Car {

    private int id;
    private String model;
    private String series;
    private String number;

    public Car(int id, String model, String series, String number) {
        this.id = id;
        this.model = model;
        this.series = series;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
