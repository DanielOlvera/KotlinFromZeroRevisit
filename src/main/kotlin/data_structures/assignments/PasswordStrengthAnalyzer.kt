package data_structures.assignments

fun main() {

    val passwords = listOf("password", "Pa$\$w0rd", "SuperSecurePwd!", "weakpw")

    println(solution(passwords))
}

private fun solution(passwords: List<String>): List<Map<String, Boolean>> {
    val result = mutableListOf<Map<String, Boolean>>()
    val specialCharacter = "!@#$%^&*()-+"
    val strength = mutableMapOf(
        "length" to false,
        "digit" to false,
        "uppercase" to false,
        "lowercase" to false,
        "special_character" to false
    )

    for (password in passwords) {
        if (password.length >= 8)
            strength["length"] = true
        for (char in password) {
            if (char.isDigit()) {
                strength["digit"] = true
            } else if (char.isUpperCase()) {
                strength["uppercase"] = true
            } else if (char.isLowerCase()) {
                strength["lowercase"] = true
            } else if (char in specialCharacter) {
                strength["special_character"] = true
            }
        }
        result.add(strength)
    }

    return result
}