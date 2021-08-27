package com.BraveNewCoinbackend.controller;

import com.BraveNewCoinbackend.entity.CryptoCurrencies;
import com.BraveNewCoinbackend.service.CryptoCurrenciesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cryptocurrencies")
@CrossOrigin(origins = "*")
public class CryptoCurrenciesController {

    @Autowired
    CryptoCurrenciesService cryptoCurrenciesService;
}
