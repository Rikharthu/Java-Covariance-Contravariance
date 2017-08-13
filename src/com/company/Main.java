package com.company;

import com.sun.naming.internal.VersionHelper;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // https://stackoverflow.com/questions/2723397/what-is-pecs-producer-extends-consumer-super
        // Contravariance
        // Можем положить любой класс - наследник (Класс, чей родитель является X)
        // Collection of a definite type which is a super of XYZ
        // That means we can allways add an instance of XYZ and above
        // Since we do not know actual type, we cannot retrivie anything from it except Object (WRITE-ONLY collection)
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
        // Можем достать любой класс-наследник)
        // Every object in a given collection implements/extends XYZ
        // Thus ? is any subclass of XYZ
        // That means I can get objects out of that list so long as I only need to use the XYZ interface
        // I can't put objects (except null) since type can't be sure at compile-time (READ-ONLY collection)
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

        object = vegetableProducer.get(0);
        energy=vegetableProducer.get(0);
        vegetable=vegetableProducer.get(0);
//        bamboo=vegetableProducer.get(0);

        object = bambooProducer.get(0);
        energy=bambooProducer.get(0);
        vegetable=bambooProducer.get(0);
        bamboo=bambooProducer.get(0);
    }
}
