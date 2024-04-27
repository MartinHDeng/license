package com.appleyk.verify.service;

import com.appleyk.core.result.ResponseResult;
import com.appleyk.verify.annotion.VLicense;
import com.appleyk.verify.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

@Component
public class LoginTestService {

    @VLicense
    public boolean checkLicense(User user){
        if("admin".equals(user.getUserName()) && "admin".equals(user.getPassword())){
            return true;
        }else{
            return false;
        }
    }
}
