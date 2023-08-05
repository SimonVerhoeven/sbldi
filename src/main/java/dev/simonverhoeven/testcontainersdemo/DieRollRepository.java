package dev.simonverhoeven.testcontainersdemo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DieRollRepository extends CrudRepository<DieRoll, UUID> {
}
