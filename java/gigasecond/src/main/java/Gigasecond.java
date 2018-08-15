import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

    private final static long GIGASECOND = 1_000_000_000L;
    private final LocalDateTime birthDateTime;

    Gigasecond(LocalDate birthDate) {
        this.birthDateTime = birthDate.atStartOfDay();
    }

    Gigasecond(LocalDateTime birthDateTime) {
        this.birthDateTime = birthDateTime;
    }

    LocalDateTime getDate() {
        return birthDateTime.plusSeconds(GIGASECOND);
    }

}
