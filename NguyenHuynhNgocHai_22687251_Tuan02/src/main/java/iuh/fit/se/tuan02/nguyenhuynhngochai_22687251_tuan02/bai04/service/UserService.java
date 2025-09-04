package iuh.fit.se.tuan02.nguyenhuynhngochai_22687251_tuan02.bai04.service;

import iuh.fit.se.tuan02.nguyenhuynhngochai_22687251_tuan02.bai04.User;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserService {
    public User getUser(){
        return new User(1,"Ngochai","ngochai147@gmail.com");
    }
}
