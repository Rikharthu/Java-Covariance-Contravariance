package com.company;

import com.sun.naming.internal.VersionHelper;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // https://stackoverflow.com/questions/2723397/what-is-pecs-producer-extends-consumer-super
        // Contravariance
        // Можем положить любой супер-класс
        List<? super EnergySource> energyConsumer = new ArrayList<>();
        List<? super Vegetable> vegetableConsumer = new ArrayList<>();
        List<? super Bamboo> bambooConsumer = new ArrayList<>();

        energyConsumer.add(new EnergySource());
        energyConsumer.add(new Vegetable());
        energyConsumer.add(new Bamboo());

//        vegetableConsumer.add(new EnergySource());
        vegetableConsumer.add(new Vegetable());
        vegetableConsumer.add(new Bamboo());

//        bambooConsumer.add(new EnergySource());
//        bambooConsumer.add(new Vegetable());
        bambooConsumer.add(new Bamboo());

        Object object = energyConsumer.get(0);
        EnergySource energy=energyConsumer.get(0);
        Vegetable vegetable=energyConsumer.get(0);
        Bamboo bamboo=energyConsumer.get(0);

        energy=vegetableConsumer.get(0);
        vegetable=vegetableConsumer.get(0);
        bamboo=vegetableConsumer.get(0);

        energy=bambooConsumer.get(0);
        vegetable=bambooConsumer.get(0);
        bamboo=bambooConsumer.get(0);

        // Covariance
        // Можем достать л
        List<? extends EnergySource> energyProducer = new ArrayList<>();
        List<? extends Vegetable> vegetableProducer = new ArrayList<>();
        List<? extends Bamboo> bambooProducer = new ArrayList<>();

        // You cannot put anything into a type declared with an
        // extends wildcard—except for the value null, which belongs to every reference type:
        energyProducer.add(null);
//        energyProducer.add(new EnergySource());
//        energyProducer.add(new Vegetable());
//        energyProducer.add(new Bamboo());

//        vegetableProducer.add(new EnergySource());
//        vegetableProducer.add(new Vegetable());
//        vegetableProducer.add(new Bamboo());

//        bambooProducer.add(new EnergySource());
//        bambooProducer.add(new Vegetable());
//        bambooProducer.add(new Bamboo());

        object = energyProducer.get(0);
        energy=energyProducer.get(0);
//        vegetable=energyProducer.get(0);
//        bamboo=energyProducer.get(0);

        object = energyProducer.get(0);
        energy=vegetableProducer.get(0);
        vegetable=vegetableProducer.get(0);
//        bamboo=vegetableProducer.get(0);

        object = energyProducer.get(0);
        energy=bambooProducer.get(0);
        vegetable=bambooProducer.get(0);
        bamboo=bambooProducer.get(0);
    }
}
