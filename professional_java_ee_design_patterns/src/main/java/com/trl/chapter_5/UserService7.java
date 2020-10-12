package com.trl.chapter_5;

import javax.inject.Inject;

class UserService7 {

    @Inject
    private UserDataRepository udr;

    public void persistUser(User user) {
        udr.save(user);
    }
}
