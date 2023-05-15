package guru.springframework.spring6restmvc.controller;

import guru.springframework.spring6restmvc.model.Beer;
import guru.springframework.spring6restmvc.services.BeerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Created by jt, Spring Framework Guru.
 */
@Slf4j
@AllArgsConstructor
@Controller
@RestController
public class BeerController {
    private final BeerService beerService;
    @RequestMapping("/api/v1/beer")
    public Beer getBeerById(UUID id){
        log.debug("Get Beer by Id - in controller");
        return beerService.getBeerById(id);
    }

}
