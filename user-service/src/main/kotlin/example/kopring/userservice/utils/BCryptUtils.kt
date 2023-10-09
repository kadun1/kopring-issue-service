package example.kopring.userservice.utils

import at.favre.lib.crypto.bcrypt.BCrypt

object BCryptUtils {

    fun hash(password: String) =
        BCrypt.withDefaults().hashToString(12, password.toCharArray())

    fun verify(password: String, hashedPassWord: String) =
        BCrypt.verifyer().verify(password.toCharArray(), hashedPassWord).verified
}