package com.switchfully.til.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Objects;

@Data
@Builder
@EqualsAndHashCode
@AllArgsConstructor
public class Person {

    private final String name;

}
