package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
@Scope("prototype")
@Service(value = "infantry")
public class Infantry implements NotificationService {
    public void createInfantry(String text) {
        System.out.println("Создадим отряд пехоты " + text);
    }
    @Override
    public void create(String text) {
        createInfantry(text);
    }
}
