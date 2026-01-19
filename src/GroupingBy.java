import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy extends StreamAPI {

    protected GroupingBy(List<?> list) {
        super(list);
    }

    @Override
    protected void run() {

        Map<String, List<Integer>> grouped = list
                .stream()
                .map(e -> (Integer) e)
                .collect(Collectors.groupingBy(e -> e % 2 == 0 ? "Even" : "Odd"));

        System.out.println(grouped);

    }

}
