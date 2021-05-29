package com.example.plugins.core;

import java.util.Random;
import java.util.UUID;

/**
 * @author ligq
 * @Description:
 * @date 2021/5/29 8:53 上午
 */
public class DemoUtil {

    public static String getUuid(){
        return UUID.randomUUID().toString().replace("-","");
    }

}
