package org.rrajesh1979.spring.demo.springbasics.person.domain;

import lombok.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class Person {
    private String name;
    private int age;
    private String address;
}
