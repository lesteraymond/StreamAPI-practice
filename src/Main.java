import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> names = List.of("Hanni", "Minji", "Haerin", "Hyein", "Danielle");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        StreamAPI api = StreamAPI.create(numbers);

        // ForEach forEach = new ForEach(api.getCollection());
        // forEach.run();
        // Map map = new Map(api.getCollection());
        // map.run();
        Filter filter = new Filter(api.getCollection());
        filter.run();
    }
}
