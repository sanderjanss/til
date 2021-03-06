package com.switchfully.til.service;

import com.switchfully.til.domain.Til;
import com.switchfully.til.domain.TilRequest;
import com.switchfully.til.exceptions.NoSuchTilException;
import com.switchfully.til.mappers.TilMapper;
import com.switchfully.til.repository.TilRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
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

    public void removeTil(UUID id) {
        Til til = tilRepository.findById(id);
        if(til != null){
            tilRepository.deleteTil(til);
        } else {
            throw new NoSuchTilException("Not a valid til");
        }
    }
}
