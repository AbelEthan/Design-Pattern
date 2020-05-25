package com.aen.factory.method.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Title: {@link LocalOrderPizza}
 * Description:
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/21 16:09
 */
public class LocalOrderPizza {

    private LocalOrderPizza() {

    }

    public static OrderPizza getLocalOrderPizza() {
        String local = "";
        local = getLocal();
        if (local.equals("bj")) {
            return new BjOrderPizza();
        } else if (local.equals("ld")) {
            return new LdOrderPizza();
        } else {
            System.out.println("没有这个地方的披萨");
            return null;
        }
    }

    private static String getLocal() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请选择哪个地方:");
            String s = reader.readLine();
            return s;
        } catch (IOException e) {
            e.getStackTrace();
            return "";
        }
    }
}
