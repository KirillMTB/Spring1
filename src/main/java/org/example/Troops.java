package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Troops {

    @Autowired
    @Qualifier(value = "Cavalry")
    private NotificationService notificationService;


    public void notify(String text) {
        notificationService.create(text);
    }

    public void checkDeps(){
        System.out.println(notificationService.hashCode());
    }


}