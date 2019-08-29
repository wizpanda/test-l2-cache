package test.l2.cache

import com.wizpanda.test.User

class ApplicationController {

    def index() {
        User user = User.createCriteria().get {
            eq("id", 1l)
            cache(true)
        }

        println "Found $user"

        render ""
    }
}
