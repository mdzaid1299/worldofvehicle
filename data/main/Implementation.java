package main;

import data.ElectricEngine;
import data.IcEngine;
import derived.Cng;
import derived.Diesel;
import derived.Petrol;

public class Implementation {
    public static void main(String[] args) {
        IcEngine icEngine = new IcEngine(1234,60,70,45,3,"petrol");
        ElectricEngine electricEngine = new ElectricEngine(145,90,100,220);
        Petrol petrol = new Petrol(345,78,89,90,3,"petrol");
        Diesel diesel = new Diesel(2562,234,566,345,4,"diesel");
        Cng cng = new Cng(6758,89,345,78,4,"CNG");
        System.out.println("IC Engine details");
        icEngine.display();
        System.out.println("Electric engine details");
        electricEngine.display();
        System.out.println("Petrol Engine details");
        petrol.display();
        System.out.println("Diesel Engine details");
        diesel.display();
        System.out.println("CNG Details");
        cng.display();
    }
}
