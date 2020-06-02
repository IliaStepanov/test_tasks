package main.java.task_1;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayEntryCounter {
    public Map<Integer, Integer> count(int[] array) {

        Map<Integer, Integer> result = Arrays.stream(array)
                .boxed()
                .collect(Collectors.toMap(Function.identity(), e -> 1, Integer::sum));


        return result.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldVal, newVal) -> newVal,
                        LinkedHashMap::new));
    }
}

