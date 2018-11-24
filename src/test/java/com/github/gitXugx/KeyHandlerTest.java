package com.github.gitXugx;

import com.github.gitXugx.common.KeyHandler;
import org.junit.Test;

import java.awt.*;

/**
 * @author ：Administrator
 * @description ：
 * @copyright ：	Copyright 2018 yowits Corporation. All rights reserved.
 * @create ：2018/11/24 0024 15:03
 */


public class KeyHandlerTest {


    @Test
    public void keyTest() throws AWTException {
        Robot robot = new Robot();
        KeyHandler.key(robot , "k");
    }


}
