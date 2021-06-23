package com.nssp.sitcom.data.repository;

import com.nssp.sitcom.data.Sitcom;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SitcomRepository extends PagingAndSortingRepository<Sitcom, Long> {
}
