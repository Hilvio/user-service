package com.refix.qa.user.domain;

/**
 * Created by Genevieve on 2015-11-24.
 */
public interface UserRepository {

    User read(UserId userId);
    void write(User user);
    void update(User user);
    void delete(User user);

}
