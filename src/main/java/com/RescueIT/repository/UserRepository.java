package com.RescueIT.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.RescueIT.domain.User;



@Repository
public interface UserRepository extends CrudRepository<User, Long>{

}
