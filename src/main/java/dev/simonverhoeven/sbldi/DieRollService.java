package dev.simonverhoeven.sbldi;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.UUID;

@Service
public class DieRollService {

    private final DieRollRepository dieRollRepository;

    public DieRollService(DieRollRepository dieRollRepository) {
        this.dieRollRepository = dieRollRepository;
    }

    DieRoll roll() {
        DieRoll dieRoll = new DieRoll(UUID.randomUUID(), new Random().nextInt(6) + 1, LocalDateTime.now());
        return dieRollRepository.save(dieRoll);
    }

    Iterable<DieRoll> findAll() {
        return dieRollRepository.findAll();
    }
}
