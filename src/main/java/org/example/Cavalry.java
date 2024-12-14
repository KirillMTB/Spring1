package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
@Scope("prototype")
@Service(value = "Cavalry")
public class Cavalry implements NotificationService {
    public void createCavalry(String text) {
        System.out.println("Создадим отряд конницы " + text);
    }
    @Override
    public void create(String text) {
        createCavalry(text);
    }
}
