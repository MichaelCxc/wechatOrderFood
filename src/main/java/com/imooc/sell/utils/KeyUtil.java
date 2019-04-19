package com.imooc.sell.utils;

import java.util.Random;

public class KeyUtil {

    /*
     * @Author Michael
     * @Description 生成唯一的主键，时间+随机数
     * @Date 5:09 PM 2019/4/19
     * @Param []
     * @return java.lang.String
     **/
    public static synchronized String genUniqueKey(){
        Random random = new Random();

        //System.currentTimeMillis();

        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);

    }

}
