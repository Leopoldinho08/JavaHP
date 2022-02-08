package Clase1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class FechasNuevas {

    public static void main(String[] args) {

        LocalDate fecha = LocalDate.now();
        System.out.println("Fecha de hoy: " + fecha);

        LocalTime hora = LocalTime.now();
        System.out.println("Hora: " + hora);

        LocalDateTime fechaHora = LocalDateTime.now();
        System.out.println("Fecha y hora ahora: " + fechaHora);

        ZonedDateTime fechaHoraZonaHoraria = ZonedDateTime.now();
        System.out.println("Fecha y hora Zona horaria: " + fechaHoraZonaHoraria);
    }
}
