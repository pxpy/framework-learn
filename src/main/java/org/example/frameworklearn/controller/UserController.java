package org.example.frameworklearn.controller;

import org.example.frameworklearn.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/user")
public class UserController {

    @PostMapping("/getOne")
    public String getOne(@RequestBody UserDTO user) {
        return user.toString();
    }

}
