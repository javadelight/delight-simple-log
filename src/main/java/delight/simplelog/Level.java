package delight.simplelog;

/**
 * Based on https://logging.apache.org/log4j/2.x/manual/customloglevels.html
 * @author Max Rohde
 *
 */
public enum Level {
    OFF(0), FATAL(100), ERROR(200), WARN(300), INFO(400), DEBUG(500), TRACE(600), ALL(Integer.MAX_VALUE);

    public int getLevel() {
        return level;
    }

    private int level;

    private Level(final int level) {
        this.level = level;
    }
}
