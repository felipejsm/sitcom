package com.nssp.sitcom.entrypoint.http;

import com.nssp.sitcom.data.Sitcom;
import com.nssp.sitcom.usecase.inbound.CreateAndGetSitcom;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class SitcomController {
    private final CreateAndGetSitcom usecase;
    public SitcomController(CreateAndGetSitcom usecase) {
        this.usecase = usecase;
    }
    @CrossOrigin
    @GetMapping
    public Sitcom get() {
        return this.usecase.getSitcom();
    }

    @CrossOrigin
    @GetMapping("/page")
    public Page<Sitcom> getPage(Pageable pageable) {
        return this.usecase.getPageSitcom(pageable);
    }

    @CrossOrigin
    @PostMapping("/batch")
    public String postMult(@RequestParam("files") List<MultipartFile> files,
                           @RequestParam("metadata") String json) {
        return "ok";
    }
}
