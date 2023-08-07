package dev.simonverhoeven.sbldi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DieRollController {

    private final DieRollService dieRollService;

    public DieRollController(DieRollService dieRollService) {
        this.dieRollService = dieRollService;
    }

    @GetMapping("/rollDie")
    public DieRoll rollDie() {
        return dieRollService.roll();
    }

    @GetMapping("/listRolls")
    public Iterable<DieRoll> listRolls() {
        return dieRollService.findAll();
    }

}
