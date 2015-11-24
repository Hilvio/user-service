package com.refix.qa.user.runtime;

import com.refix.qa.user.domain.User;
import com.refix.qa.user.domain.UserId;
import com.refix.qa.user.domain.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Genevieve on 2015-11-24.
 */
@Repository
public class TestUserRepository implements UserRepository {

    Set<User> testUsers = new HashSet<>();

    @Override
    public User read(UserId userId) {

        for (User user : testUsers) {

            if(user.getId().equals(userId)) {

                return user;

            }
        }

        throw new RuntimeException("User not found!");

    }

    @Override
    public void write(User user) {

        testUsers.add(user);

    }

    @Override
    public void update(User user) {

        for(User testUser : testUsers) {

            if(testUser.getId().equals(user.getId())) {

                testUsers.remove(testUser);
                testUsers.add(user);
                return;

            }
        }

        throw new RuntimeException("User not found!");

    }

    @Override
    public void delete(User user) {

        testUsers.remove(user);

    }
}
