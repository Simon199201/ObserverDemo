package com.yishu.observerdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by simon on 17/7/11.
 */

public abstract class Subject {
    private List<Observer> observables = new ArrayList<>();

    public void attach(Observer observer){
        observables.add(observer);
        System.out.println("我新交了个女朋友,名字叫做"+observer);
    }

    public void detach(Observer observer){
        observables.remove(observer);
        System.out.println("和女朋友分手了");

    }

    public void notifyObserver(String status){
        for (Observer observer : observables) {
            observer.update(status);
        }
    }
}
