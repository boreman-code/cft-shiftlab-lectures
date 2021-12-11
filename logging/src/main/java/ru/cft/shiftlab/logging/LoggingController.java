package ru.cft.shiftlab.logging;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/logging")
@Api("Получение информации из контроллера")
public class LoggingController {

    private static final Logger logger = LoggerFactory.getLogger(LoggingController.class);

    private final LoggingService loggingService;

    @Autowired
    public LoggingController(LoggingService loggingService) {
        this.loggingService = loggingService;
    }

    @ApiOperation("Какой-то метод")
    @GetMapping("parse-string-to-integer/{string}")
    public Integer parseStringToInteger(@ApiParam("Строка") @PathVariable("string") String string) {

        logger.debug("Получена строка \"{}\"", string);

        Integer integer = loggingService.parseStringToInteger(string);

        logger.debug("Число {} отправлено", integer);

        return integer;
    }

    @ApiOperation("Какой-то метод")
    @PutMapping("parse-string-to-integer")
    public Integer putString(@ApiParam("Что-то") @RequestBody() String string) {

        logger.debug("Получена строка \"{}\"", string);

        Integer integer = loggingService.parseStringToInteger(string);

        logger.debug("Число {} отправлено", integer);

        return 100;
    }
}

