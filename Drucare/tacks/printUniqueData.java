package org.example.tacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class printUniqueData {

    public static void main(String[] args) {


        List<String> names = Arrays.asList("Sam", "Peter","ballon","Sam");

        names.stream().collect(Collectors.toCollection(LinkedHashSet::new)).forEach(System.out::println);

    }
}
