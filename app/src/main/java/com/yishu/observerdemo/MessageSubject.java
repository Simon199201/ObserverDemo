package com.yishu.observerdemo;

/**
 * Created by simon on 17/7/11.
 */

public class MessageSubject extends Subject {
    public void change(String status) {
        notifyObserver(status);
    }
}
