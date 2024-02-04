package ru.gikbrains.example3sem33hometask.repository.java;

import org.springframework.stereotype.Repository;
import ru.gikbrains.example3sem33hometask.domain.User;
//import ru.geekbrain.example3sem3hometask.domain.User;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private List<User> users = new ArrayList<>();

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
