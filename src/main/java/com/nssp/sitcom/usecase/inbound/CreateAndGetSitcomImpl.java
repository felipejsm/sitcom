package com.nssp.sitcom.usecase.inbound;

import com.nssp.sitcom.data.Sitcom;
import com.nssp.sitcom.data.repository.SitcomRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class CreateAndGetSitcomImpl implements CreateAndGetSitcom {

    private final SitcomRepository repository;

    public CreateAndGetSitcomImpl(SitcomRepository repository) {
        this.repository = repository;
    }

    private void generateSitcom() {
        var sitcom = new Sitcom();
        sitcom.setId(1234L);
        sitcom.setGenre("Comedy");
        sitcom.setName("Seinfeld");

        this.repository.save(sitcom);

        for (int i = 0, size = 10; i < size; i++) {
            var id = UUID.randomUUID().getMostSignificantBits();
            sitcom.setId(id);
            sitcom.setGenre("Comedy");
            sitcom.setName("Seinfeld - "+id);
            this.repository.save(sitcom);

        }


    }

    @Override
    public Sitcom getSitcom() {
        generateSitcom();
        Optional<Sitcom> opSitcom = this.repository.findById(1234L);
        return opSitcom.get();
    }

    @Override
    public Page<Sitcom> getPageSitcom(Pageable pageable) {
        return this.repository.findAll(pageable);
    }
}
