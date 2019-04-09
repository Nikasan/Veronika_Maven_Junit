package streams_lymbds;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class JustLearner {
    @Test
    public void method() {
        List<String> words = new ArrayList<>();
        words.add("aa");
        words.add("bb");
        words.add("cc");
        words.add("dd");

        List<String> megaWords;

//        words.forEach(o -> {
//            megaWords.add(o.toUpperCase());
//        });
//
//        System.out.println(megaWords);


       List<String > anotherWords = new ArrayList<>();
       words.forEach(o -> anotherWords.add(o.toUpperCase()));
       anotherWords.forEach(System.out::println);

     megaWords = words
                .stream()
                .map(String::toUpperCase)
                .collect(Collectors.toCollection(LinkedList::new));

        megaWords.forEach(System.out::println);

    }
}
