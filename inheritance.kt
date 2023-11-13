/*
inheritance 
super base class Any
Any equals()、hashCode()、toString()
*/

open class Person(var name : String, var age : Int){// base class

}

class Student(name : String, age : Int, var no : String, var score : Int) : Person(name, age) {

}

// test
fun main(args: Array<String>) {
    val s =  Student("Wang", 18, "S12346", 89)
    println("name： ${s.name}")
    println("age： ${s.age}")
    println("no： ${s.no}")
    println("score： ${s.score}")
}


open class Person(name:String){
    //secondary constructor
    constructor(name:String,age:Int):this(name){
        println("-------secondary---------")
    }
}

class Student:Person{

    constructor(name:String,age:Int,no:String,score:Int):super(name,age){
        println("-------subclass secondary ---------")
        println("name: ${name}")
        println("age： ${age}")
        println("no： ${no}")
        println("score： ${score}")
    }
}

fun main(args: Array<String>) {
    var s =  Student("Wang", 18, "S12345", 89)
}


open class Demo{
    open var num = 3
    open fun foo() = "foo"
    open fun bar() = "bar"
}

class DemoTest : Demo(){
}

fun main(args: Array<String>) {
    println(DemoTest().num)
    DemoTest().foo()
    DemoTest().bar()
}

open class Demo{
    fun test(){}   // NO open
}

class DemoTest : Demo(){
    
    // fun test(){}   // error
    // override fun test(){}   error
}

open class A{
    open fun foo(){}
}
open class B : Demo(){
   
    final override fun foo(){}
}

// method overload
open class Demo{
    open fun foo() = "foo"
}

class DemoTest : Demo(){

    fun foo(str: String) : String{   // overload method
        return str
    }

    override fun foo(): String {
        return super.foo()
    }
}    

fun main(args: Array<String>) {
    println(DemoTest().foo())
    DemoTest().foo("foo overload")
}

// override property
open class Demo{
    open var num = 3
}

class DemoTest : Demo(){
    override var num: Int = 10
}



// get and super
open class Demo{
    open val valStr = "val_propery"
}


class DemoTest : Demo(){

    // override val valStr: String
    //   get() = super.valStr

    //override var valStr: String = ""
       //get() = super.valStr

    // override val valStr: String = ""

    override var valStr: String = "abc"
        set(value){field = value}
}

fun main(arge: Array<String>){
    println(DemoTest().valStr)

    val demo = DemoTest()
    demo.valStr = "1212121212"
    println(demo.valStr)
}