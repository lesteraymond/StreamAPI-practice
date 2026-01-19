import java.util.List;

public abstract class StreamAPI {

    protected List<?> list;

    protected StreamAPI(List<?> list) {
        this.list = list;
    }

    public static StreamAPI create(List<?> list) {
        return new StreamContext(list);
    }

    public List<?> getCollection() {
        return list;
    }

    protected abstract void run();

}
