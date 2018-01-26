# delight-simple-log

A most lightweight logging library for Java.

## Usage

Log something:

    Log.print("message to print");
    
By default, delight-simple-log will log any received messages to the command line.

You can use [delight-simple-log-log4j](https://github.com/javadelight/delight-simple-log-log4j) to send all
log messages to Log4J instead:

```
Log.setListener(new Log4JBridge());
```

You can also define your own custom listeners to redirect the log to where ever you wish.

Redirect log (simple):

    Log.setStdOut(new Closure<String>() {
       public void apply(String message) {
       		...
       }
    });

Redirect log (full context):

```
Log.setListener(new LogListener() { ... });
```