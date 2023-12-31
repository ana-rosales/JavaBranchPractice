
package example.entities;

/**
 *
 * @author paula
 */
public class Horse {
    private String name;
    private String breed;
    private int age;
    private double weight;

    public Horse() {
    }

    public Horse(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" + "name=" + name + ", breed=" + breed + ", age=" + age + ", weight=" + weight + '}';
    }
}
