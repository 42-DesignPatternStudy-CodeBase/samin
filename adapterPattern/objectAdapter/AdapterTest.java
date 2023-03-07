package adapterPattern.objectAdapter;

public class AdapterTest {
    public static void main(String[] args) {
        Print p = new PrintBanner("hello");
        p.printWeak();
        p.printStrong();
    }
}
