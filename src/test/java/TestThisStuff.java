import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author Frank Raiser <raiser.frank@gmail.com>
 */
public class TestThisStuff {
    public static final int CONSTANT = 10;

    static <T> Stream<T> dropWhile(Predicate<T> p, Stream<T> s) {
        class MutableBoolean { boolean b; }
        MutableBoolean inTail=new MutableBoolean();
        return s.filter(i -> inTail.b || !p.test(i) && (inTail.b=true));
    }

    public Integer calculate() {
        Integer i = null;
        i.toString();
        String nullString;

        if (i != null) {
            Optional.ofNullable("String");
        }

        if (i == null) {
            System.out.println("should be found");
        }
        return null;
    }
}
