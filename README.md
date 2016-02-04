# delight-simple-log

A most lightweight logging library for Java.

## Usage

Log something:

    Log.print("message to print");
    
Redirect log:

    Log.setStdOut(new Closure<String>() {
       public void apply(String message) {
       		...
       }
    });
