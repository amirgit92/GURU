package guru.springframework.spring6restmvc.services;

import guru.springframework.spring6restmvc.model.Beer;
import guru.springframework.spring6restmvc.model.BeerStyle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;

/**
 * Created by jt, Spring Framework Guru.
 */
@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    Map<UUID, Beer> beerMap;
    public BeerServiceImpl() {
        beerMap = new HashMap<>();

        Beer beer1 = Beer.builder()
                .id(UUID.randomUUID())
                .beerName("Mammad")
                .beerStyle(BeerStyle.ALE)
                .price(new BigDecimal(12.36))
                .updateDate(LocalDateTime.now())
                .createdDate(LocalDateTime.now())
                .quantityOnHand(123)
                .upc("123")
                .version(1)
                .build();
        Beer beer2 = Beer.builder()
                .id(UUID.randomUUID())
                .beerName("Amir")
                .beerStyle(BeerStyle.GOSE)
                .price(new BigDecimal(12.36))
                .updateDate(LocalDateTime.now())
                .createdDate(LocalDateTime.now())
                .quantityOnHand(123)
                .upc("123")
                .version(1)
                .build();
        Beer beer3 = Beer.builder()
                .id(UUID.randomUUID())
                .beerName("Parsa")
                .beerStyle(BeerStyle.PORTER)
                .price(new BigDecimal(12.36))
                .updateDate(LocalDateTime.now())
                .createdDate(LocalDateTime.now())
                .quantityOnHand(123)
                .upc("123")
                .version(1)
                .build();

        beerMap.put(beer1.getId(), beer1);
        beerMap.put(beer2.getId(), beer2);
        beerMap.put(beer3.getId(), beer3);
    }
    @Override
    public Beer getBeerById(UUID id) {
        log.debug("Get Beer By Id: " + id.toString());
        return beerMap.get(id);
    }
    @Override
    public List<Beer> listBeers() {
        log.debug("list beer method");
        return new ArrayList<>(beerMap.values());
    }
}
