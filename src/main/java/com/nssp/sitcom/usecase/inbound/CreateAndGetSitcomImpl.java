package com.nssp.sitcom.usecase.inbound;

import com.nssp.sitcom.data.Sitcom;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class CreateAndGetSitcomImpl implements CreateAndGetSitcom {

    @Override
    public Sitcom getSitcom() {
        var sitcom = new Sitcom();
        sitcom.setId("my-id");
        sitcom.setGenre("Comedy");
        sitcom.setName("Seinfeld");
        return sitcom;
    }

    @Override
    public Page<Sitcom> getPageSitcom(Pageable pageable) {
        List<Sitcom> myListOfSitcom = new ArrayList<>();
        var sitcom = new Sitcom();
        sitcom.setId("my-id");
        sitcom.setGenre("Comedy");
        sitcom.setName("Seinfeld");
        myListOfSitcom.add(sitcom);
        for (int i = 0, size = 10; i < size; i++) {
            var id = UUID.randomUUID().getMostSignificantBits();
            sitcom.setId("my-id"+id);
            sitcom.setGenre("Comedy");
            sitcom.setName("Seinfeld - "+id);
            myListOfSitcom.add(sitcom);
        }

        Page<Sitcom> pages = new PageImpl<Sitcom>(myListOfSitcom, pageable, myListOfSitcom.size());

        return pages;
    }
}
