package com.trl.chapter_5;

import javax.inject.Inject;
import javax.inject.Named;

class UserService8 {

    @Inject
    @Named("UserDataRepositoryMongo")
    private UserDataRepository udr;

    public void persistUser(User user) {
        udr.save(user);
    }
}
