package com.lingo.github

import com.lingo.common.Preference

object Settings {
    var username: String by Preference(AppContext, "username", "")
    var password: String by Preference(AppContext, "password", "")
}