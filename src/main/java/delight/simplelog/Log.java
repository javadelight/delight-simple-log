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

    public static void println(final String message) {
        print(message);
    }

    public static void print(final Throwable exception) {
        println(exception.toString());
        for (final StackTraceElement element : exception.getStackTrace()) {
            println(element.toString());
        }

    }

    public static void println(final Object context, final String message) {
        print(context.toString() + ": " + message);
    }

    public static void setStdOut(final Closure<String> listener) {
        stdout = listener;
    }

}
