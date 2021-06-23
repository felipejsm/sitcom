package com.nssp.sitcom.entrypoint.http;

import com.nssp.sitcom.data.Sitcom;
import com.nssp.sitcom.usecase.inbound.CreateAndGetSitcom;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class SitcomController {
    private final CreateAndGetSitcom usecase;
    public SitcomController(CreateAndGetSitcom usecase) {
        this.usecase = usecase;
    }
    @GetMapping
    public Sitcom get() {
        return this.usecase.getSitcom();
    }

    @GetMapping("/page")
    public Page<Sitcom> getPage(Pageable pageable) {
        return this.usecase.getPageSitcom(pageable);
    }
}
