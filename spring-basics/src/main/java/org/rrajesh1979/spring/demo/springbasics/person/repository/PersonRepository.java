package org.rrajesh1979.spring.demo.springbasics.person.repository;

import org.rrajesh1979.spring.demo.springbasics.person.domain.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonRepository {
    Mono<Person> findByName(String name);

    Flux<Person> findAll();
}
