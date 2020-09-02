import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Person implements Comparable<Person>{
    private String name;
    private int height, age;

    public Person(String name, int height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person p) {
        if(this.age > p.getAge()){
            return -1;
        }
        if(this.age < p.getAge()){
            return 1;
        }
        if(this.age == p.getAge()){
            if(this.height > p.getHeight()){
                return -1;
            }else{
                return 1;
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Person one = new Person("Peter", 180, 19);
        Person two = new Person("Martin", 185, 22);
        Person three = new Person("Jens", 180, 21);
        Person four = new Person("Lars", 180, 22);
        Person five = new Person("Oskar", 180, 23);

        ArrayList<Person> list = new ArrayList<>(
                Arrays.asList(one, two, three, four, five)
        );

        Collections.sort(list);
        System.out.println(list.toString());

    }

}
