package com.appleyk.verify.controller;

import com.appleyk.core.result.ResponseResult;
import com.appleyk.verify.annotion.VLicense;
import com.appleyk.verify.entity.User;
import com.appleyk.verify.service.LoginTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>登录测试</p>
 *
 * @author appleyk
 * @version v1.0.0
 * @blob https://blog.csdn.net/appleyk
 * @date created on 00:02 上午 2020/8/22
 */
@CrossOrigin
@RestController
@RequestMapping("/user")
public class LoginTestController {
    @Autowired
    private LoginTestService loginTestService;

    @PostMapping("/login")
    public ResponseResult checkLicense(@RequestBody User user){
        if(loginTestService.checkLicense(user)){
            return ResponseResult.ok("登陆成功！");
        }else{
            return ResponseResult.fail("用户名或密码不对！");
        }
    }
}

