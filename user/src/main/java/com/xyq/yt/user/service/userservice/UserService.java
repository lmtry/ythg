package com.xyq.yt.user.service.userservice;

import com.xyq.yt.user.entity.UserEntity;
import com.xyq.yt.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by mac on 17/7/19.
 */

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Iterable<UserEntity> findAllUser() { //返回所有的 users
        return userRepository.findAll();
    }

    public UserEntity findOneUserById(Long id) { //根据 id 去寻找具体某一个 user
        return userRepository.findOne(id);
    }

    public String insertAnUser(String name, String email) { //添加一个用户
        userRepository.save(new UserEntity(name, email));
        return "Saved";
    }

    public String deleteAnUserById(Long id) { //删除一个用户
        userRepository.delete(id);
        return "Deleted";
    }

    public String updateAnUser() { //更新一个用户
        return "updated";
    }
}
