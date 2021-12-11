package ru.cft.shiftlab.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class LoggingService {

    private static final Logger logger = LoggerFactory.getLogger(LoggingService.class);

    public Integer parseStringToInteger(String string) {

        Integer integer = null;

        try {
            integer = Integer.parseInt(string);
            logger.info("Строка \"{}\" преобразована в число", string);
        } catch (NumberFormatException exception) {
            logger.error("Невозможно преобразовать строку \"{}\" в число", string, exception);
        }

        return integer;
    }
}
