package org.irmantas.tabTwo.repositories;

import org.irmantas.tabTwo.model.Darbuotojas;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface DarbuotojasRepository extends ReactiveCrudRepository<Darbuotojas, Integer> {
    @Query("SELECT id, firstName,lastname, position from darbuotojas where email=:email")
    Mono<Darbuotojas> findByEmail(String email);
    @Query("SELECT id, firstName,lastname, position from darbuotojas where email=:email")
    Flux<Darbuotojas> findByLastName(String email);
}
