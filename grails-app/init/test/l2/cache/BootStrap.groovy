package test.l2.cache

import com.wizpanda.test.User

class BootStrap {

    def init = { servletContext ->
        User user = User.findOrCreateByEmail("test@example.com")

        if (!user.id) {
            user.firstName = "Jon"
            user.lastName = "Doe"
            user.save(flush: true, failOnError: true)
        }
    }

    def destroy = {
    }
}
