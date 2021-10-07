import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Aufgabe1 test1 = new Aufgabe1();
        List<Integer> test_list = new ArrayList<Integer>();
        test_list.add(38);
        test_list.add(67);
        test_list.add(80);
        test_list.add(78);
        List<Integer> asserting_list = new ArrayList<Integer>();
        asserting_list.add(67);
        asserting_list.add(80);
        asserting_list.add(78);
        assert(test1.not_enough(test_list) == asserting_list);
        double test_varriable = 66.75;
        assert(test1.avreage(test_list) == test_varriable);
    }
}
