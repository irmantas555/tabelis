package org.irmantas.tabTwo.Controllers;

import org.irmantas.tabTwo.model.Darbuotojas;
import org.irmantas.tabTwo.repositories.DarbuotojasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Flux;

@RequestMapping("/darb")
public class DarbuotojaiController {

    @Autowired
    DarbuotojasRepository darbuotojasRepository;

    @GetMapping
    public Flux<Darbuotojas> duokDarbuotojus() {
        return darbuotojasRepository.findAll();
    }


}
