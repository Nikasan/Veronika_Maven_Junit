package streams_lymbds;

import java.util.Arrays;
import java.util.List;

import lombok.Value;

@Value
class Info {
    String name;
    int age;

    public String getName() {
        return name;
    }
}

@Value
 class House {
     int number;
    String street;
    int rooms;
    public String getStreet() {
        return street;
    }
}

@Value
class Pets {
    private final Info info;
    private final List<House> house;
}


public class Learner_streams {

    protected static List<Pets> getCats() {
        return Arrays.asList(
                new Pets(
                        new Info("Yarik", 2),
                        Arrays.asList(
                                new House(51, "Shuvalovskiy", 1),
                                new House(66, "Rafieva", 2)
                        )),
                new Pets(
                        new Info("Bobik", 4),
                        Arrays.asList(
                                new House(51, "Nevskiy", 1),
                                new House(66, "Pevcheskiy", 2),
                                new House(77, "Pushkina", 3)
                        ))
        );
    }

}

