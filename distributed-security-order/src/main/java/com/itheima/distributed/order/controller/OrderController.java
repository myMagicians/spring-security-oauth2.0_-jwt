package com.itheima.distributed.order.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.itheima.distributed.order.model.UserDTO;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @version 1.0
 **/
@RestController
public class OrderController {

    @GetMapping(value = "/r1")
    @PreAuthorize("hasAuthority('p2')")//拥有p1权限方可访问此url
    public String r1(){
        //获取用户身份信息
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
      //  UserDTO userDTO = (UserDTO) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        JSONObject jsonObject= JSONObject.parseObject(principal.toString());
        return jsonObject.get("username")+"访问资源1";
        //return userDTO.getFullname()+"访问资源1";
    }

}
