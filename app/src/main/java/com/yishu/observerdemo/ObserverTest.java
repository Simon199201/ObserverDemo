package com.yishu.observerdemo;

/**
 * Created by simon on 17/7/11.
 */

public class ObserverTest {
    public static void main(String[] args){

        Observer fan = new GirlFrient("范冰冰");
        Observer yang = new GirlFrient("杨幂");
        Observer lin = new GirlFrient("林志玲");
        MessageSubject messageSubject = new MessageSubject();
        messageSubject.attach(fan);
        messageSubject.attach(yang);
        messageSubject.attach(lin);
        messageSubject.change("我在大保健");

        messageSubject.detach(fan);
        messageSubject.change("我在泡吧");
    }

}
