package com.example.controller;

import com.example.modle.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(tags="用户相关接口",description = "提供用户相关的restful api")
@RestController
@RequestMapping("/user")
public class UserController {
    @ApiOperation("新增用户接口")
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public boolean addUser(@RequestBody User user) {
        return false;
    }
    @RequestMapping(value = "/find/{id}",method = RequestMethod.GET)
    public User findById(@RequestParam("id") int id){
        return new User();
    }
    @PutMapping("/update")
    public boolean update(@RequestBody User user) {
        return true;
    }
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int id) {
        return true;
    }
}
