package tech.bouncystream

private fun returningTheParam(value: String): String {
    return value
}

fun show(value: String) {
    println(returningTheParam(value))
}

