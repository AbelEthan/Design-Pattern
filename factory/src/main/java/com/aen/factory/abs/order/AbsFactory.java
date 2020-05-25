package com.aen.factory.abs.order;

import com.aen.factory.abs.pizza.Pizza;

/**
 * Title: {@link AbsFactory}
 * Description:
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/21 16:55
 */
public interface AbsFactory {

    /**
     * 创建披萨
     *
     * @param orderType
     * @return
     */
    Pizza createPizza(String orderType);
}
