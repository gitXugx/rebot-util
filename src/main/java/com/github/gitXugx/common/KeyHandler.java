package com.github.gitXugx.common;

import java.awt.*;

/**
 * @author ：apple
 * @description ：
 * @copyright ：	Copyright 2018 yowits Corporation. All rights reserved.
 * @create ：2018/11/24 下午1:31
 */
public class KeyHandler {

    public static void key(Robot robot , String  key){
//        int randomInt = new Random().nextInt(100);
        int keyInt = RobotSuppot.StringToKey(key);
        robot.delay(5000);
        robot.keyPress(keyInt);
        robot.delay(1000);
//        robot.delay(10);
//        System.out.println(randomInt);
        robot.keyPress(keyInt);
    }

}
