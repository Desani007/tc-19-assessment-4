package rocks.zipcode.io.assessment4.generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {


        for (SomeType n : array) {
            int i =Collections.frequency(Arrays.asList(array),n);
            if ( (i%2!=0)){
                return n;
            }
        }


        return null;
    }

    public SomeType findEvenOccurringValue() {


        for (SomeType n : array) {
          int i =Collections.frequency(Arrays.asList(array),n);
            if ( (i%2==0)){
             return n;
            }

        }

        return  null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {

        for (SomeType n : array) {
            int i = Collections.frequency(Arrays.asList(array), n);
            if ((n == valueToEvaluate)) {
                return i;

            }
        }



        return null;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        Arrays.stream(array).filter((Predicate<? super SomeType>) predicate).toArray();


        return  null;

    }
}
