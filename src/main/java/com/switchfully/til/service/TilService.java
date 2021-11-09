package com.switchfully.til.service;

import com.switchfully.til.domain.Til;
import com.switchfully.til.domain.TilRequest;
import com.switchfully.til.mappers.TilMapper;
import com.switchfully.til.repository.TilRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TilService {
    private final TilRepository tilRepository;
    private final TilMapper tilMapper;

    public TilService(TilRepository tilRepository, TilMapper tilMapper) {
        this.tilRepository = tilRepository;
        this.tilMapper = tilMapper;
    }

    public List<Til> getTils() {
        return tilRepository.getTils();
    }

    public Til addTil(TilRequest tilToAdd) {
        return tilRepository.addTil(tilMapper.tilRequestToTil(tilToAdd));
    }

    public void removeTil(String id) {
        tilRepository.deleteTil(UUID.fromString(id));
    }
}
