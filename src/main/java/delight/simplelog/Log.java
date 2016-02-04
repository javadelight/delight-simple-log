package delight.simplelog;

import delight.functional.Closure;

public class Log {

    private static Closure<String> stdout;

    public static void print(final String message) {
        if (stdout != null) {
            stdout.apply(message);
            return;
        }

        System.out.println(message);
    }

    public static void setStdOut(final Closure<String> listener) {
        stdout = listener;
    }

}
