//OOP features: Encapsulation , Inheritance, Polymorphism

/*
class Test{
    // property...
    ...
    // constructor
    ...
    // method
    ...
    // internal class
   ...
   ...
}
*/

class Test constructor(num : Int){
     ...
}
same as
class Test(num: Int){
      ...
}

// main constructor
fun main(args: Array<String>) {
    // instantiate  
    var test = Test(1)
}

class Test constructor(var num : Int){
    init {
        num = 5
        println("num = $num")
    }
}

// secondary constructor sample 
fun main(args: Array<String>) {
    var test1 = Test(1)
    var test2 = Test(1,2)
}

class Test constructor(num: Int){
    init {
        println("num = $num")
    }
    constructor(num : Int, num2: Int) : this(num) {
        println(num + num2)
    }
}

fun main(args: Array<String>) {
    var test = Test()
    var test1 = Test(1,2)
    var test2 = Test(4,5,6)
}

// constructor with default values
class Test constructor(num1: Int = 10 , num2: Int = 20){

    init {
        println("num1 = $num1\t num2 = $num2")
    }

    constructor(num1 : Int = 1, num2 : Int = 2, num3 : Int = 3) : this(num1 , num2){
        println("num1 = $num1\t num2 = $num2 \t num3 = $num3")
    }
}

class Person {

    var lastName: String = "zhang"
        get() = field.toUpperCase()   // convert to upper case
        set

    var no: Int = 100
        get() = field               
        set(value) {
            if (value < 10) {       // 
                field = value
            } else {
                field = -1         //
            }
        }

    var heiht: Float = 145.4f
        private set
}

fun main(args: Array<String>) {
    var person: Person = Person()

    person.lastName = "wang"

    println("lastName:${person.lastName}")

    person.no = 9
    println("no:${person.no}")

    person.no = 20
    println("no:${person.no}")

}