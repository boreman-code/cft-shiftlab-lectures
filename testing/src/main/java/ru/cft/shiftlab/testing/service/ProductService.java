package ru.cft.shiftlab.testing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.cft.shiftlab.testing.data.entity.Product;
import ru.cft.shiftlab.testing.data.repository.ProductRepository;

import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository repository;

    @Autowired
    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Product getByIntValue(String value) {
        Optional<Product> product = repository.findById(value);
        return product.orElse(null);
    }

    public void addProduct(int integer, String string) {
        repository.upsert(integer, string);
    }
}
