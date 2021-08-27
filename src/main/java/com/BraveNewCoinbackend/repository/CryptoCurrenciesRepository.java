package com.BraveNewCoinbackend.repository;

import com.BraveNewCoinbackend.entity.CryptoCurrencies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CryptoCurrenciesRepository extends JpaRepository<CryptoCurrencies, Integer>  {

    Optional<CryptoCurrencies> findByName(String name);
    boolean existsByName(String name);
}
