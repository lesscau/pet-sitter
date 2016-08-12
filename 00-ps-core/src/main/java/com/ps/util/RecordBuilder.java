package com.ps.util;

import com.ps.ents.User;

/**
 * Created by iuliana.cosmina on 2/23/16.
 */
public class RecordBuilder {

    /**
     * Builder method used to create a simple User instance with all the main fields populated.
     * @return
     */
    public static User buildUser(String email){
        User user = new User();
        user.setEmail(email);
        String[] namePieces = email.split("@");
        user.setUsername(namePieces[0]);
        if (namePieces[0].contains(".")) {
            // fn and ln can be inferred
            String[] names = namePieces[0].split("\\.");
            user.setLastName(names[0]);
            user.setFirstName(names[1]);
        }
        user.setRating(0d);
        user.setActive(true);
        return user;
    }
}
