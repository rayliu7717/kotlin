// Generic class
class Box<T>(t : T) {
    var value = t
}

fun main(args: Array<String>) {
    var boxInt = Box<Int>(10)
    var boxString = Box<String>("generic demo")

    println(boxInt.value)
    println(boxString.value)
}

//Generic function
fun main(args: Array<String>) {
    val age = 23
    val name = "jack"
    val bool = true

    doPrintln(age)    // int
    doPrintln(name)   // string
    doPrintln(bool)   // boolean
}

fun <T> doPrintln(content: T) {

    when (content) {
        is Int -> println("int value: $content")
        is String -> println("upper case of string：${content.toUpperCase()}")
        else -> println("T  not int, not string")
    }
}