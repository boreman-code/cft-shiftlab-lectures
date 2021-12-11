package ru.cft.shiftlab.testing;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import ru.cft.shiftlab.testing.data.entity.Product;
import ru.cft.shiftlab.testing.data.repository.ProductRepository;
import ru.cft.shiftlab.testing.service.ProductService;

import java.util.Optional;

@RunWith(MockitoJUnitRunner.class)
public class ProductServiceTest {

    @InjectMocks
    ProductService service;

    @Mock
    ProductRepository repository;

    @Test
    public void getByIntegerTest() {
        Optional<Product> product = Optional.of(new Product("1", "2", 3));

//        Mockito.doReturn(product).when(repository).findById("1");
        Mockito.when(repository.findById("1")).thenReturn(product);

        Assertions.assertEquals("1", service.getByIntValue("1").getId());

        Mockito.verify(repository, Mockito.times(1)).findById("1");
    }


}
