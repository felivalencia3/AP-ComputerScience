package valencia.java;

public class Animal {
    String name;
    String animalType;
    double age;

    public Animal(String n, String type, double a) {
        name = n;
        animalType = type;
        age = a;
    }
    public void print() {
        System.out.println(name+" "+animalType+" "+age);
    }
}
