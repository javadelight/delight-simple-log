package delight.simplelog;

public enum Level {
    ALL(0), TRACE(1), WARN(2), ERROR(5);

    public int getLevel() {
        return level;
    }

    private int level;

    private Level(final int level) {
        this.level = level;
    }
}
