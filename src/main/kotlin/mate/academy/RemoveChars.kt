package mate.academy

fun removeChars(str: String): String {
    if (str.length >= 2) {
        return str.substring(1, str.length - 1)
    }

    return ""
}
