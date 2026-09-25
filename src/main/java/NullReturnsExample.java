// https://documentation.blackduck.com/bundle/coverity-docs/page/checker-ref/checkers/NO/null_returns.html

public class NullReturnsExample {
    static int count = 0;

    public static Object returnA() {
        return null;
    }
    public static Object returnB() {
        return new Object();
    }
    public static void testA() {
        // Bug fix here
        Object result = returnA();
        if (result != null) {
            String value = result.toString();
        }
    }
    public static void testB() {
        // no bug here
        returnB().toString();
    }
}
