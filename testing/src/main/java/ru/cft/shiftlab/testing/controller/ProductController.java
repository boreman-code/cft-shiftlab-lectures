package ru.cft.shiftlab.testing.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.cft.shiftlab.testing.data.entity.Product;
import ru.cft.shiftlab.testing.service.ProductService;

@RestController
@Api("API для работы с продуктами")
@RequestMapping("api/v1/product")
public class ProductController {

    private final ProductService service;

    @Autowired
    public ProductController(ProductService service) {
        this.service = service;
    }

    @ApiOperation("Получение продукта по числовому значению")
    @GetMapping("get/by-int-value/{value}")
    public Product getByIntValue(@ApiParam("Строковое значение") @PathVariable("value") String value) {
        return service.getByIntValue(value);
    }
}
