package com.yishu.observerdemo;

/**
 * Created by simon on 17/7/11.
 */

public class GirlFrient implements Observer {
    private String girlFriendName = "";

    public GirlFrient(String name) {
        girlFriendName = name;
    }

    @Override
    public void update(String status) {
        System.out.println(girlFriendName + "接受到新消息－>男朋友的状态: " + status);
    }
}
