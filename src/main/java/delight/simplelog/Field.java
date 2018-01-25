package delight.simplelog;

import java.util.List;

public class Field {
	
	public static FieldDefinition define(final String key, final String value) {
		return new FieldDefinition() {
			
			@Override
			public String value() {
				
				return value;
			}
			
			@Override
			public String key() {
				return key;
			}
		};
	}
	
}
