import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

    private final LocalDateTime birthDateTime;
    private final long seconds = 1000000000;

    Gigasecond(LocalDate birthDate) {
        this.birthDateTime = birthDate.atStartOfDay();
    }

    Gigasecond(LocalDateTime birthDateTime) {
        this.birthDateTime = birthDateTime;
    }

    LocalDateTime getDate() {
        return birthDateTime.plusSeconds(seconds);
    }

}
