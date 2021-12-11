package ru.cft.shiftlab.testing.data.repository;

import com.arangodb.springframework.annotation.Query;
import com.arangodb.springframework.repository.ArangoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.cft.shiftlab.testing.data.entity.Product;

@Repository
public interface ProductRepository extends ArangoRepository<Product, String> {

    @Query("UPSERT { intValue: @intValue } INSERT { intValue: @intValue, stringValue: @stringValue} UPDATE { intValue: @intValue, stringValue: @stringValue} IN _system OPTIONS { exclusive: true }")
    void upsert(@Param("intValue")int intValue, @Param("stringValue")String stringValue);
}
