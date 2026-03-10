import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeConverter {

    // Metodo compatto per la conversione
    public static String converti(long timestamp) {
        return Instant.ofEpochMilli(timestamp)
                .atZone(ZoneId.systemDefault())
                .format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }

    public static void main(String[] args) {
        long ultimaModifica = 1712759743057L;
        System.out.println("Ultima modifica: " + converti(ultimaModifica));
    }
}