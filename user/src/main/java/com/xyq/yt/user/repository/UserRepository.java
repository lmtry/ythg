package com.xyq.yt.user.repository;

import com.xyq.yt.user.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by mac on 17/7/19.
 */



// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<UserEntity, Long> {

}
