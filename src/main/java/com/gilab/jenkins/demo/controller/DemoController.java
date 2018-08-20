package com.gilab.jenkins.demo.controller;

import com.alibaba.druid.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

/**
 * @Author: HU_zhenwei
 * @Date: 2018/8/20上午11:21
 * @Descripton:
 */
@RestController
@CrossOrigin
public class DemoController {

    /**
     * 测试范围内号不出现次数
     */
    @RequestMapping(value="/test")
    @ResponseBody
    public Object test(String ob) throws ParseException {
        if(StringUtils.isEmpty(ob)){
            ob = "{code:505;msg:null}";
        }
        return "{code:0;msg:success}";
    }

}
