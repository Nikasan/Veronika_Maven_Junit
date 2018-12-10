package streams_lymbds;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toMap;

public class Learner_streams_Test {
    private Collection<Pets> pets;

    @BeforeEach
    void createCats() {
        pets = Learner_streams.getCats();

    }

//    @Test
//    void print() {
//
//        Map<Pets, List<House>> collect = pets.stream()
//                .collect(toMap(o -> o,::getStreet));
//        System.out.println(collect);
//
//    }

    @Test
    void stringUpperCase() {
        String str = "bvdfhb565BGDVG";

        str = str.toUpperCase();
        System.out.println(str);
    }

}
