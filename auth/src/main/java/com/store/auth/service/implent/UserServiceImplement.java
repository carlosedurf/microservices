package com.store.auth.service.implent;

import com.store.auth.domain.User;
import com.store.auth.repository.UserRepository;
import com.store.auth.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplement extends GenericServiceImplement<User, Long, UserRepository> implements UserService {
    public UserServiceImplement(UserRepository repository) {
        super(repository);
    }
}
