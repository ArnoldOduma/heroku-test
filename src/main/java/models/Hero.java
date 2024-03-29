package models;

import javax.swing.text.html.HTMLWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hero {

    private String name;
    private int age;
    private String power;
    private String weakness;
    private int id;
    private static ArrayList<Hero> instances = new ArrayList<>();

    public Hero(String name, Integer age, String power, String weakness) {
        this.name = name;
        this.age = age;
        this.power = power;
        this.weakness = weakness;
        instances.add(this);
        this.id = instances.size();
    }

    public String getName() {return this.name;}
//    public String getCv() {
//        String cv = this.name && this.power;
//    }
    public int getAge() {return this.age;}
    public String getPower() {return this.power;}
    public String getWeakness() {return this.weakness;}
    public static ArrayList<Hero> getAllInstances() {return instances;}
    public int getId(){return id;}
    public static Hero findById(int id) {return instances.get(id-1);}

    public static Hero setUpNewHero(){
        return new Hero("Arnold",23,"flying","fire");
    }
    public static Hero setUpNewHero1(){
        return new Hero("Janet",30,"Night Vision","Light");
    }
    public static Hero setUpNewHero2(){
        return new Hero("Jay",30,"Night Vision","Light");
    }

}
