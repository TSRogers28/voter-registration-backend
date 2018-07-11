package com.globalartimatics.bike.repositories;

import com.globalartimatics.bike.com.globalmatics.bike.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    
}
