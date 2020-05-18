package br.com.devdojo.demo.util;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author: Jose Augusto for DevDojo SpringBoot Course on 5/18/20
 */

@Component
public class DateUtil {
    public String formatLocalDateTimetoDatabaseStyle(LocalDateTime localDateTime) {
        return DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(localDateTime);
    }
}
