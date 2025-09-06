fun main() {
    println("Введите строку:")
    val inputString = readLine() ?: ""
    val result = cstring(inputString)
    println(result)
}

fun cstring(input: String): String {
    if (input.isEmpty()) {
        return ""
    }

    val result = StringBuilder()
    var count = 1
    var currChar = input[0]

    for (i in 1 until input.length) {
        if (input[i] == currChar) {
            count++
        } else {
            result.append(currChar)
            if (count > 1) {
                result.append(count)
            }
            currChar = input[i]
            count = 1
        }
    }


    result.append(currChar)
    if (count > 1) {
        result.append(count)
    }

    return result.toString()
}