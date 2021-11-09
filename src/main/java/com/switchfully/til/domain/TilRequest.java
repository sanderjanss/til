package com.switchfully.til.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class TilRequest {

    private final String person;
    private final String knowledgeOfTheDay;


}
