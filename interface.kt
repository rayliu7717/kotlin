interface MyInterface {
    var name:String // property
    fun bar()   // not implement 
    fun foo() {  // implement
        println("foo")
    }
}
class Child : MyInterface {
	override var name: String = "wang" //override property
    override fun bar() {
        println("bar")
    }
}
fun main(args: Array<String>) {
    val c =  Child()
    c.foo();
    c.bar(); 
}

interface A {
    fun foo() { print("A") }   // 
    fun bar()                  // 
}
 
interface B {
    fun foo() { print("B") }   // 
    fun bar() { print("bar") } // 
}
 
class C : A {
    override fun bar() { print("bar") }   // 
}
 
class D : A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }
 
    override fun bar() {
        super<B>.bar()
    }
}
 
fun main(args: Array<String>) {
    val d =  D()
    d.foo();
    d.bar();
}