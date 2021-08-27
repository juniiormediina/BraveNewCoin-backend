package com.BraveNewCoinbackend.service;

import com.BraveNewCoinbackend.repository.CryptoCurrenciesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CryptoCurrenciesService {

    @Autowired
    CryptoCurrenciesRepository cryptoCurrenciesRepository;

}
