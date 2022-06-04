package org.rrajesh1979.spring.demo.springbasics.person.repository;

import org.rrajesh1979.spring.demo.springbasics.person.domain.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class PersonRepositoryImpl implements PersonRepository {
    @Override
    public Mono<Person> findByName(String name) {
        return null;
    }

    @Override
    public Flux<Person> findAll() {
        return null;
    }
}
