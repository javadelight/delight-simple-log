package delight.simplelog.internal;

import delight.functional.Closure;

public class DefaultListener extends StdOutListener {

	public DefaultListener() {
		super(new Closure<String>() {

			@Override
			public void apply(String o) {
				System.out.println(o);
			}
			
		});
	}

	

}
