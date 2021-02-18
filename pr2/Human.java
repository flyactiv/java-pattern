package pr2;

import java.util.Date;

public class Human {
    private final String firstName, secondName;
    private final int age, weight;
    private final Date birth;

    Human(String firstName, String secondName, int age, int weight, Date birth) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.weight = weight;
        this.birth = birth;
    }

    public int getAge() {
        return age;
    }

    public Date getBirth() {
        return birth;
    }

    public int getWeight() {
        return weight;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    @Override
    public String toString() {
        return "\nPerson{ " +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age= " + age +
                ", weight= " + weight +
                ", birth= " + birth +
                '}';
    }
}
