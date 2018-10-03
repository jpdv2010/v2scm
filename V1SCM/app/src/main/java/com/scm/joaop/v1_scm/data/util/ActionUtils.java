package com.scm.joaop.v1_scm.data.util;

import com.scm.joaop.v1_scm.data.model.User;

import java.util.function.Function;

/**
 * Created by joaop on 03/10/2018.
 */

public class ActionUtils {
    private Function<User, ResponseObject> saveUser = u -> {
        return new ResponseObject();
    }
}
