package com.bhupeshji.springbootmongodb.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

import com.bhupeshji.springbootmongodb.models.Users;

@Transactional
public interface UsersRepo extends MongoRepository<Users, String> {

}
