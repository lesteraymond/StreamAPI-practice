import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Calorie {

    private Map<String, Integer> data;

    public Calorie(Map<String, Integer> data) {
        this.data = data;
    }

    void run() {

        Map<String, List<Map<String, Integer>>> calories = data.entrySet()
                .stream()
                .filter(e -> !e.getKey().toLowerCase().contains("salad"))
                .collect(Collectors.groupingBy(
                        e -> e.getValue() >= 400 ? "High" : "Low",
                        Collectors.mapping(
                                e -> Map.of(e.getKey(), e.getValue()),
                                Collectors.toList())));

        System.out.println(calories);

    }

}
