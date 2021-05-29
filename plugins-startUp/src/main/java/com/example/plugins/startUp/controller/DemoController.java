package com.example.plugins.startUp.controller;

import com.example.plugins.core.DemoUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ligq
 * @Description:
 * @date 2021/5/29 8:52 上午
 */
@RequestMapping("demo")
@RestController
public class DemoController {

    @RequestMapping("get")
    public Map get(){
        Map map = new HashMap();
        map.put("id", DemoUtil.getUuid());
        return map;
    }


}
