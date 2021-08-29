package com.BraveNewCoinbackend.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class CryptoCurrenciesDto {

    @NotBlank
    private String name;

    private String symbol;

    @Min(0)
    private float price;

    public CryptoCurrenciesDto(String name, String symbol, float price) {
        this.name = name;
        this.symbol = symbol;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
