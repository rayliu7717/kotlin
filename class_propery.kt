class Student{
    val id : String = "123"
    var name : String? = "Mat"
    var age : Int? = 16
    var sex : String? = "Male"
    var weight : Float = 120.3f

    var test : String = ""
        get() = "123"
        set(value){field = value}
}

fun main(args: Array<String>) {
    val Student = Student()
    println("id = ${Student.id} \t name = ${Student.name} \t age = ${Student.age}
    \t sex = ${Student.sex} \t weight = ${Student.weight}")
}

// getter, setter
class Test{
    private val size = 0        
    val isEmpty : Boolean
        get() = this.size == 0
    val num = 2
        get() = if (field > 5) 10 else 0
		
   var str1 = "test"
        get() = field   //
        set(value){
            field = if (value.isNotEmpty()) value else "null"
        }
		
}

fun main(args: Array<String>) {
    val test = Test()
    println("isEmpty = ${test.isEmpty}")
    println("num = ${test.num}")
}

// lateinit 
class Test{
    lateinit var student : Student    
    /*
        Int、Float、Double、Short are basic type cannot use latinit 
    */    
    // lateinit var num : Int     /error
}
