package delight.simplelog.internal;

import delight.functional.Closure;
import delight.simplelog.Level;
import delight.simplelog.Log;
import delight.simplelog.LogListener;

public  class StdOutListener implements LogListener {

	private final Closure<String> stdout;

	private void println(String text) {
		stdout.apply(text);
	}

	@Override
	public void onMessage(Level level, String text) {

		if (level.getLevel() <= Log.LEVEL.getLevel()) {
			println(text);
		}

	}

	@Override
	public void onMessage(Level level, String text, Throwable exception) {
		if (level.getLevel() <= Log.LEVEL.getLevel()) {
			println(exception.toString());
			for (final StackTraceElement element : exception.getStackTrace()) {
				println("  " + element.toString());
			}
		}
	}

	@Override
	public void onMessage(Level level, Object context, String text) {
		if (level.getLevel() <= Log.LEVEL.getLevel()) {
			println(Log.getSimpleObjectName(context) + ": " + text);
		}
	}

	@Override
	public void onMessage(Level level, Object context, String text, Throwable exception) {
		if (level.getLevel() <= Log.LEVEL.getLevel()) {
			println(Log.getSimpleObjectName(context)+": "+exception.toString());
			for (final StackTraceElement element : exception.getStackTrace()) {
				println("  " + element.toString());
			}
		}
	}

	public StdOutListener(Closure<String> stdout) {
		super();
		this.stdout = stdout;
	}

}
