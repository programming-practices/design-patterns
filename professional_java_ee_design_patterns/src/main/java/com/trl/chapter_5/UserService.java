package com.trl.chapter_5;

class UserService {

    private UserDataRepository udr;

    UserService() {
        this.udr = new UserDataRepositoryImpl();
    }

    public void persistUser(User user) {
        udr.save(user);
    }
}
