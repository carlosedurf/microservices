package com.store.auth.service.implement;

import com.store.auth.domain.Company;
import com.store.auth.repository.CompanyRepository;
import com.store.auth.service.CompanyService;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImplement extends GenericServiceImplement<Company, Long, CompanyRepository> implements CompanyService {
    public CompanyServiceImplement(CompanyRepository repository) {
        super(repository);
    }
}
