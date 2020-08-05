package org.irmantas.tabTwo.Controllers;

import org.irmantas.tabTwo.repositories.DarbuotojasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/darb")
public class DarbuotojaiController {

    @Autowired
    DarbuotojasRepository darbuotojasRepository;


}
