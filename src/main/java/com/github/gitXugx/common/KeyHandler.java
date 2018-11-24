package com.github.gitXugx.common;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.Random;

/**
 * @author ：apple
 * @description ：
 * @copyright ：	Copyright 2018 yowits Corporation. All rights reserved.
 * @create ：2018/11/24 下午1:31
 */
public class KeyHandler {

    /**
     * 按键盘
     *
     * @param robot
     * @param key 字符串类型
     */
    public static void key(Robot robot, String key) {
        int keyInt = RobotSuppot.StringToKey(key);
        key(robot, keyInt);
    }

    /**
     * 按键盘
     * @param robot
     * @param keyInt int类型
     */
    public static void key(Robot robot, int keyInt) {
        int randomInt = new Random().nextInt(100);
        robot.delay(5000);
        robot.keyPress(keyInt);
        robot.delay(250 + randomInt);
        robot.keyPress(keyInt);
    }

    /**
     * 点击鼠标左键
     *
     * @param robot
     */
    public static void mouseClickLeft(Robot robot) {
        int randomInt = new Random().nextInt(50);

        robot.mousePress(MouseEvent.BUTTON1);
        robot.delay(80 + randomInt);
        robot.mouseRelease(MouseEvent.BUTTON1);

    }

    /**
     * 点击鼠标右键
     *
     * @param robot
     */
    public static void mouseClickRight(Robot robot) {
        int randomInt = new Random().nextInt(50);
        robot.mousePress(MouseEvent.BUTTON3);
        robot.delay(80 + randomInt);
        robot.mouseRelease(MouseEvent.BUTTON3);
    }

    /**
     * 循环点击鼠标左键
     * @param robot
     */
    public static void DealMouseClickLeft(Robot robot){
        while (true){
            mouseClickLeft(robot);
            int randomInt = new Random().nextInt(50);
            robot.delay(80 + randomInt);
        }
    }

    /**
     * 循环点击鼠标右键
     * @param robot
     */
    public static void DealLoopMouseClickRight(Robot robot){
        while (true){
            mouseClickRight(robot);
            int randomInt = new Random().nextInt(50);
            robot.delay(80 + randomInt);
        }
    }


    /**
     * 循环按某一个键
     *
     * @param robot
     * @param key   被按的键
     * @param num   循环按多少次
     */
    public static void loopKey(Robot robot, String key, int num) {
        for (int i = 0; i < num; i++) {
            key(robot, key);
            int randomInt = new Random().nextInt(100);
            robot.delay(250 + randomInt);
        }
    }

    /**
     * 循环按某一个键
     * @param robot
     * @param key   被按的键
     */
    public static void dealLoopKey(Robot robot, String key) {
        while (true) {
            key(robot, key);
            int randomInt = new Random().nextInt(100);
            robot.delay(250 + randomInt);
        }
    }




}
