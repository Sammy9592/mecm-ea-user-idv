package com.sl.mecm.service.user.idv.service;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import com.sl.mecm.service.user.idv.dao.UserAccountDao;
import com.sl.mecm.service.user.idv.entity.UserAccountInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.function.Function;

import reactor.core.publisher.Mono;

@Service
public class UserAccountService {

    @Autowired
    private UserAccountDao userAccountDao;

    public Mono<JSONObject> getUserAccountInfoByName(String username){
        return userAccountDao.getAccountInfoByUsername(username)
                .map(new Function<UserAccountInfo, JSONObject>() {
                    @Override
                    public JSONObject apply(UserAccountInfo userAccountInfo) {
                        return JSON.parseObject(JSON.toJSONString(userAccountInfo));
                    }
                });
    }
}
