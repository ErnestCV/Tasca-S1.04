import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;

public class StringLengthMatcher{
    //is(Matcher<T> matcher)
    //Decorates another Matcher, retaining the behaviour but allowing tests to be slightly more expressive.
    //https://junit.org/junit4/javadoc/4.12/org/hamcrest/core/Is.html
    //http://hamcrest.org/JavaHamcrest/javadoc/2.2/
    public static Matcher<String> stringLength(Matcher<? super Integer> matcher) {
        return new FeatureMatcher<String, Integer>(matcher, "a String whose length", "length") {
            @Override
            protected Integer featureValueOf(String actual) {
                return actual.length();
            }
        };
    }
}