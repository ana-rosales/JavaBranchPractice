
package example.entities;

/**
 *
 * @author paula
 */
public class Rabbit {
    private String name;
    private String breed;
    private int age;

    public Rabbit() {
    }

    public Rabbit(String name, String breed, int age) {
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

    @Override
    public String toString() {
        return "Rabbit{" + "name=" + name + ", breed=" + breed + ", age=" + age + '}';
    }
}
