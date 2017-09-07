package delight.simplelog;

import delight.functional.Closure;
import delight.strings.ClassNameUtils;

public class Log {

    private static Closure<String> stdout;

    public static Level LEVEL = Level.WARN;

    public static void trace(final String message, final Throwable exception) {
        if (LEVEL.getLevel() >= Level.TRACE.getLevel()) {
            print(message);
            print(exception);
        }

    }

    public static void warn(final String message) {
        if (LEVEL.getLevel() >= Level.WARN.getLevel()) {
            print(message);
        }
    }

    public static void warn(final String message, final Throwable exception) {
        if (LEVEL.getLevel() >= Level.WARN.getLevel()) {
            print(message);
            print(exception);
        }
    }

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
            println("  " + element.toString());
        }

    }

    public static void println(final Object context, final String message) {
        
    	print(ClassNameUtils.getClassNameWithoutPackage(context.getClass())+"/"+Integer.toHexString(context.hashCode() / 1000) + ": " + message);
    }

    public static void setStdOut(final Closure<String> listener) {
        stdout = listener;
    }

}
