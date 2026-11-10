import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    private final LocalDateTime startMoment;

    public Gigasecond(LocalDate moment) {
        this(moment.atStartOfDay());
    }

    public Gigasecond(LocalDateTime moment) {
        this.startMoment = moment;
    }

    public LocalDateTime getDateTime() {
        long GIGA = 1_000_000_000L;

        return startMoment.plusSeconds(GIGA);
    }
}
