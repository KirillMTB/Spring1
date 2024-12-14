package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Scope("prototype")
@Service(value = "Array")
public class Array implements NotificationService {
    public void createArray(String text) {
        System.out.println("Создадим отряд лучников " + text);
    }
    @Override
    public void create(String text) {
        createArray(text);
    }
}