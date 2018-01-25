package delight.simplelog;

public interface LogListener {
	
	public void onMessage(Level level, String text);
	
	public void onMessage(Level level, String text, FieldDefinition[] fields);
	
	public void onMessage(Level level, String text, Throwable exception);
	
	public void onMessage(Level level, String text, Throwable exception, FieldDefinition[] fields);
	
	public void onMessage(Level level, Object context, String text);
	
	public void onMessage(Level level, Object context, String text, FieldDefinition[] fields);
	
	public void onMessage(Level level, Object context, String text, Throwable exception);
	
	public void onMessage(Level level, Object context, String text, Throwable exception, FieldDefinition[] fields);

	
	
}
