package ru.cft.shiftlab.testing.data.entity;

import com.arangodb.springframework.annotation.Document;
import org.springframework.data.annotation.Id;

@Document
public class Product {

    @Id
    private String id;
    private String stringValue;
    private int intValue;

    public Product(String id, String stringValue, int intValue) {
        this.id = id;
        this.stringValue = stringValue;
        this.intValue = intValue;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }
}
