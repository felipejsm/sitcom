package com.nssp.sitcom.usecase.inbound;

import com.nssp.sitcom.data.Sitcom;
import com.nssp.sitcom.data.repository.SitcomRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CreateAndGetSitcomImpl implements CreateAndGetSitcom{

    private final SitcomRepository repository;

    public CreateAndGetSitcomImpl(SitcomRepository repository) {
        this.repository = repository;
    }
    @Override
    public Sitcom getSitcom() {
        var sitcom = new Sitcom();
        sitcom.setId(1234L);
        sitcom.setGenre("Comedy");
        sitcom.setName("Seinfeld");

        this.repository.save(sitcom);

        Optional<Sitcom> opSitcom = this.repository.findById(1234L);

        return opSitcom.get();
    }
}
