package com.nssp.sitcom.usecase.inbound;

import com.nssp.sitcom.data.Sitcom;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CreateAndGetSitcom {
    Sitcom getSitcom();
    Page<Sitcom> getPageSitcom(Pageable pageable);
}
