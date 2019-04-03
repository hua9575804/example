package com.qianfeng.tea;

import com.qianfeng.ioc.IWater;
import org.springframework.stereotype.Component;

@Component("tea")//昵称
public class TeaWater implements IWater {
    @Override
    public String getName() {
        return "茶";
    }
}
