package dev.simonverhoeven.sbldi;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DieRollRepository extends CrudRepository<DieRoll, UUID> {
}
