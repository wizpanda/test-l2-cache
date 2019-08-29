package com.wizpanda.test

class User {

    static Long COMMON_ID = 1

    static constraints = {
        email unique: true, email: true
    }

    String firstName
    String lastName
    String email
}
