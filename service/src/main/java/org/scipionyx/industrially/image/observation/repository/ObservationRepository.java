package org.scipionyx.industrially.image.observation.repository;

import org.scipionyx.industrially.image.observation.model.Observation;
import org.springframework.data.repository.CrudRepository;

public interface ObservationRepository extends CrudRepository<Observation, Long> {
}
