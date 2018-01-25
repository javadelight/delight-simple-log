package delight.simplelog;

import delight.functional.Closure;
import delight.simplelog.internal.DefaultListener;
import delight.simplelog.internal.StdOutListener;
import delight.strings.ClassNameUtils;

public class Log {

	private static LogListener listener = new DefaultListener();

	public static Level LEVEL = Level.WARN;

	public static void error(final String message) {
		listener.onMessage(Level.ERROR, message);
	}

	public static void error(final String message, Throwable exception) {
		listener.onMessage(Level.ERROR, message, exception);
	}

	public static void error(final Object context, final String message) {
		listener.onMessage(Level.ERROR, context, message);
	}

	public static void error(Object context, final String message, Throwable exception) {
		listener.onMessage(Level.ERROR, context, message, exception);
	}
	
	public static void info(final String message) {
		listener.onMessage(Level.INFO, message);
	}

	public static void info(final String message, Throwable exception) {
		listener.onMessage(Level.INFO, message, exception);
	}

	public static void info(final Object context, final String message) {
		listener.onMessage(Level.INFO, context, message);
	}

	public static void info(Object context, final String message, Throwable exception) {
		listener.onMessage(Level.INFO, context, message, exception);
	}

	public static void trace(final String message, final Throwable exception) {
		listener.onMessage(Level.TRACE, message, exception);
	}

	public static void trace(final Object context, final String message) {
		listener.onMessage(Level.TRACE, message);
	}
	
	public static void warn(final String message) {
		listener.onMessage(Level.WARN, message);
	}

	public static void warn(final Object context, final String message) {
		listener.onMessage(Level.WARN, context, message);
	}

	public static void warn(final String message, final Throwable exception) {
		listener.onMessage(Level.WARN, message, exception);
	}

	public static void warn(Object context, final String message, final Throwable exception) {
		listener.onMessage(Level.WARN, context, message, exception);
	}

	public static void print(final String message) {
		listener.onMessage(Level.INFO, message);
	}

	public static void println(final String message) {
		listener.onMessage(Level.INFO, message);

	}

	public static void print(final Throwable exception) {
		listener.onMessage(Level.INFO, exception.getMessage(), exception);
	}

	public static String getSimpleObjectName(Object context) {
		final Class<?> clazz;
		if (context instanceof Class) {
			clazz = (Class<?>) context;
		} else {
			clazz = context.getClass();
		}

		return ClassNameUtils.getClassNameWithoutPackage(clazz) + "/" + Integer.toHexString(context.hashCode() / 1000);

	}

	public static void println(final Object context, final String message) {
		listener.onMessage(Level.INFO, context, message);

	}

	public static void setStdOut(final Closure<String> stdout) {
		listener = new StdOutListener(stdout);
	}
	
	public static void setListener(LogListener logListener) {
		listener = logListener;
	}

}
