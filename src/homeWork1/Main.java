package homeWork1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
     Car car = new Car(1L,"201");
     DataOfCar dataOfCar = new DataOfCar(2019,"Mers",5000,"silver");
     Car car1 = new Car(2L,"001");
     DataOfCar dataOfCar1 = new DataOfCar(2016,"BMW",4000,"black");
        HashMap<Car,DataOfCar> carHashMap  = new HashMap<>();
        carHashMap.put(car,dataOfCar);
        carHashMap.put(car1,dataOfCar1);
        for (Map.Entry<Car, DataOfCar> carDataOfCarEntry : carHashMap.entrySet()) {
            System.out.println(carDataOfCarEntry.getKey() + "    " + carDataOfCarEntry.getValue());
        }
    }
}
