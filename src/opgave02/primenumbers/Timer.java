package opgave02.primenumbers;

import java.time.Duration;
import java.time.Instant;

public class Timer {

    private Instant startIns;
    private Instant endIns;

    public Timer() {
        this.startIns = Instant.now();
    }

    public void endTimer() {
        endIns = Instant.now();
    }

    public Duration getTimeBetween() {
        return Duration.between(startIns, endIns);
    }


}
