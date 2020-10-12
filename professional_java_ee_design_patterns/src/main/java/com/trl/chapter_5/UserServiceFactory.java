package com.trl.chapter_5;

public class UserServiceFactory {
    public UserService6 getInstance() {
        return new UserService6(new UserDataRepositoryImpl());
    }
}
