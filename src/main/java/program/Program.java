package program;

import model.Garden;
import model.Plant;

public class Program {
    public static void main(String[] args) {
        Garden garden = new Garden(6);
        Plant plant = new Plant("A", "White");
        Plant plant2 = new Plant("B", "Black");
        Plant plant3 = new Plant("C", "Red");
        Plant plant4 = new Plant("D", "Blue", 2, 4,
                3.4, 2.5, 5.4);
        garden.add(plant);
        garden.add(plant2);
        garden.add(plant3);
        garden.add(plant4);
        System.out.println(garden);
        garden.insert(plant4, 1);
        System.out.println(garden);
//        garden2.add(plant);
//        garden2.add(plant2);
//        garden2.add(plant3);
//        garden2.add(plant4);
//        System.out.println(garden.equals(garden2));

//        System.out.println(garden);
//        System.out.println(garden.get(1));
//        System.out.println(garden.count());
//        System.out.println(garden.search(plant));
//        System.out.println(garden.search("A"));
//        System.out.println(garden.delete("C"));


//        System.out.println(plant);
//        System.out.println(plant2);
//        System.out.println(plant3);
//        System.out.println("-------------");
//        System.out.println(plant.getColor());
//        System.out.println(plant.getLifeTime());
//        System.out.println(plant.getMarketPrice());
//        System.out.println(plant.getName());
//        System.out.println(plant.getNumberOfStems());
//        System.out.println(plant.getSize());
//        System.out.println("-------------");
//        plant.setLifeTime(2);
//        System.out.println(plant.getLifeTime());
//        plant.setMarketPrice(20);
//        System.out.println(plant.getMarketPrice());
//        plant.setNumberOfStems(1);
//        System.out.println(plant.getNumberOfStems());
//        System.out.println("-------------");
//        plant.incrementLifeTime(2);
//        System.out.println(plant.getLifeTime());
//        plant.incrementMarkerPrice(40);
//        System.out.println(plant.getMarketPrice());
//        plant.incrementNumberOfStems(3);
//        System.out.println(plant.getNumberOfStems());


    }
}
