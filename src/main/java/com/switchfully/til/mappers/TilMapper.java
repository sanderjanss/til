package com.switchfully.til.mappers;

import com.switchfully.til.domain.Til;
import com.switchfully.til.domain.TilRequest;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class TilMapper {

    public Til tilRequestToTil (TilRequest tilRequest){
        return new Til.TilBuilder()
                .setUuid(UUID.randomUUID())
                .setPerson(tilRequest.getPerson())
                .setKnowledgeOfTheDay(tilRequest.getKnowledgeOfTheDay())
                .build();
    }

}

