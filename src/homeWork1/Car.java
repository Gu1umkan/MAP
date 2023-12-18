package homeWork1;

public class Car {
    private  long id;
    private  String autoNumber;

    public Car() {
    }

    public Car(long id, String autoNumber) {
        this.id = id;
        this.autoNumber = autoNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAutoNumber() {
        return autoNumber;
    }

    public void setAutoNumber(String autoNumber) {
        this.autoNumber = autoNumber;
    }

    @Override
    public String toString() {
        return
                "id: " + id +
                "   autoNumber: " + autoNumber
                ;
    }
}
