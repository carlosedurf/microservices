package com.store.auth.service.implent;

import com.store.auth.domain.Company;
import com.store.auth.domain.User;
import com.store.auth.repository.CompanyRepository;
import com.store.auth.repository.UserRepository;
import com.store.auth.service.CompanyService;
import com.store.auth.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImplement extends GenericServiceImplement<Company, Long, CompanyRepository> implements CompanyService {
    public CompanyServiceImplement(CompanyRepository repository) {
        super(repository);
    }
}
