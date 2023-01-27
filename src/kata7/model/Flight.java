package kata7.model;

public class Flight {
    private final int dayOfWeek;
    private final int depTime;
    private final int depDelay;
    private final int arrTime;
    private final int arrDelay;
    private final int cancelled;
    private final int diverted;
    private final int airTime;
    private final int distance;

    public Flight(int dayOfWeek, int depTime, int depDelay, int arrTime, int arrDelay, int cancelled, int diverted, int airTime, int distance) {
        this.dayOfWeek = dayOfWeek;
        this.depTime = depTime;
        this.depDelay = depDelay;
        this.arrTime = arrTime;
        this.arrDelay = arrDelay;
        this.cancelled = cancelled;
        this.diverted = diverted;
        this.airTime = airTime;
        this.distance = distance;
    }

    public int dayOfWeek() {
        return dayOfWeek;
    }

    public int depTime() {
        return depTime;
    }

    public int depDelay() {
        return depDelay;
    }

    public int arrTime() {
        return arrTime;
    }

    public int arrDelay() {
        return arrDelay;
    }

    public int cancelled() {
        return cancelled;
    }

    public int diverted() {
        return diverted;
    }

    public int airTime() {
        return airTime;
    }

    public int distance() {
        return distance;
    }


}