import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        List<String> names = List.of("Hanni", "Minji", "Haerin", "Hyein", "Danielle");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        StreamAPI api = StreamAPI.create(numbers);

        // ForEach forEach = new ForEach(api.getCollection());
        // forEach.run();
        // Map map = new Map(api.getCollection());
        // map.run();
        // Filter filter = new Filter(api.getCollection());
        // filter.run();
        // Sorted sorted = new Sorted(api.getCollection());
        // sorted.run();
        // Limit limit = new Limit(api.getCollection());
        // limit.run();
        // Collect collect = new Collect(api.getCollection());
        // collect.run();
        // Distinct distinct = new Distinct(api.getCollection());
        // distinct.run();
        // Reducing reducing = new Reducing(api.getCollection());
        // reducing.run();
        // GroupingBy groupingBy = new GroupingBy(api.getCollection());
        // groupingBy.run();
        // FlatMap flatMap = new FlatMap(names);
        // flatMap.run();
        // Peek peek = new Peek(numbers);
        // peek.run();

        Map<String, Integer> data = Map.of(
                "Grits", 235,
                "Pancakes", 330,
                "Burrito", 875,
                "Bacon & Eggs", 450,
                "Greek Salad", 330,
                "Caesar Salad", 330,
                "Sandwich", 435);
        Calorie calorie = new Calorie(data);
        calorie.run();
    }
}
