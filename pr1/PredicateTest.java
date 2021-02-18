package pr1;

import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        String regex = "\\d+";
        Predicate<String> isEvenNumber = x -> x.matches(regex) && (x.length()==4 || x.length()==6);
        System.out.println(isEvenNumber.test("1235"));
        System.out.println(isEvenNumber.test("12356"));
        System.out.println(isEvenNumber.test("123567"));
        System.out.println(isEvenNumber.test("sbhj"));
    }
}
