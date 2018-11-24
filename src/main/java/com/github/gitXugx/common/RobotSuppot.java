package com.github.gitXugx.common;

import java.awt.event.KeyEvent;

/**
 * @author ：Administrator
 * @description ：
 * @copyright ：	Copyright 2018 yowits Corporation. All rights reserved.
 * @create ：2018/11/24 0024 14:56
 */
public class RobotSuppot {


    /**
     * 将字符转换成key
     * @param key 字符
     * @return key
     */
    public static int StringToKey(String key){
        if ("a".equals(key)) {
            return KeyEvent.VK_A;
        } else if ("b".equals(key)) {
            return KeyEvent.VK_B;
        } else if ("c".equals(key)) {
            return KeyEvent.VK_C;
        } else if ("d".equals(key)) {
            return KeyEvent.VK_D;
        } else if ("e".equals(key)) {
            return KeyEvent.VK_E;
        } else if ("f".equals(key)) {
            return KeyEvent.VK_F;
        } else if ("g".equals(key)) {
            return KeyEvent.VK_G;
        } else if ("h".equals(key)) {
            return KeyEvent.VK_H;
        } else if ("i".equals(key)) {
            return KeyEvent.VK_I;
        } else if ("j".equals(key)) {
            return KeyEvent.VK_J;
        } else if ("k".equals(key)) {
            return KeyEvent.VK_K;
        } else if ("l".equals(key)) {
            return KeyEvent.VK_L;
        } else if ("m".equals(key)) {
            return KeyEvent.VK_M;
        } else if ("n".equals(key)) {
            return KeyEvent.VK_N;
        } else if ("o".equals(key)) {
            return KeyEvent.VK_O;
        } else if ("p".equals(key)) {
            return KeyEvent.VK_P;
        } else if ("q".equals(key)) {
            return KeyEvent.VK_Q;
        } else if ("r".equals(key)) {
            return KeyEvent.VK_R;
        } else if ("s".equals(key)) {
            return KeyEvent.VK_S;
        } else if ("t".equals(key)) {
            return KeyEvent.VK_T;
        } else if ("u".equals(key)) {
            return KeyEvent.VK_U;
        } else if ("v".equals(key)) {
            return KeyEvent.VK_V;
        } else if ("w".equals(key)) {
            return KeyEvent.VK_W;
        } else if ("x".equals(key)) {
            return KeyEvent.VK_X;
        } else if ("y".equals(key)) {
            return KeyEvent.VK_Y;
        } else if ("z".equals(key)) {
            return KeyEvent.VK_Z;
        } else if ("0".equals(key)) {
            return KeyEvent.VK_0;
        } else if ("1".equals(key)) {
            return KeyEvent.VK_1;
        } else if ("2".equals(key)) {
            return KeyEvent.VK_2;
        } else if ("3".equals(key)) {
            return KeyEvent.VK_3;
        } else if ("4".equals(key)) {
            return KeyEvent.VK_4;
        } else if ("5".equals(key)) {
            return KeyEvent.VK_5;
        } else if ("6".equals(key)) {
            return KeyEvent.VK_6;
        } else if ("7".equals(key)) {
            return KeyEvent.VK_7;
        } else if ("8".equals(key)) {
            return KeyEvent.VK_8;
        } else if ("9".equals(key)) {
            return KeyEvent.VK_9;
        } else if (".".equals(key)) {
            return KeyEvent.VK_PERIOD;
        } else {
            return 0;
        }
    }

}
