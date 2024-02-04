package ru.gikbrains.example3sem33hometask.services;

import org.springframework.stereotype.Service;
import ru.gikbrains.example3sem33hometask.domain.User;
//import ru.geekbrain.example3sem3hometask.domain.User;

@Service
public class NotificationService {

    public void notifyUser(User user) {
        System.out.println("A new user has been created: " + user.getName());
    }

    public void sendNotification(String s) {
        System.out.println(s);
    }
}
