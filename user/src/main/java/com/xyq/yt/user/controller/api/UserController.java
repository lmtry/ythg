package com.xyq.yt.user.controller.api;

import com.xyq.yt.user.entity.UserEntity;
import com.xyq.yt.user.repository.UserRepository;
import com.xyq.yt.user.service.ApplicationService;
import com.xyq.yt.user.service.userservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by mac on 17/7/19.
 */

@Controller
@RequestMapping(path="/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(path="/add")
    public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email) {
        return userService.insertAnUser(name, email);
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<UserEntity> getAllUser() {
        // This returns a JSON or XML with the users
        return userService.findAllUser();
    }

    @GetMapping(path="/find")
    public @ResponseBody UserEntity getUserById(@RequestParam Long id) {
        return userService.findOneUserById(id);
    }
}
