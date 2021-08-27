package com.BraveNewCoinbackend.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class CryptoCurrenciesDto {

    @NotBlank
    private String name;

    private String source;

    @Min(0)
    private float price;

    public CryptoCurrenciesDto(String name, String source, float price) {
        this.name = name;
        this.source = source;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
