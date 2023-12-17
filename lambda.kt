// Lambdas Expressions are essentially anonymous functions that we can treat as values 
// for example, pass them as arguments to methods, return them, or do any other thing 
// we could do with a normal object.

// format
// {（parameters）-> return_type }

fun lamda_demo1()
{
    val simpleLambda : () -> Unit = { println("Hello") }
    // can be simplified to
    // val simpleLambda = { println("Hello") }
    simpleLambda()
}

fun lamda_demo2() {
    val lambda2: (String) -> Unit = { name: String ->
        println("My name is $name")
    }
    lambda2("Gerry")
}

fun lamda_demo3() {
    var addFive = { x: Int -> x + 5 }
    var s = addFive.invoke(5)
    println(s)
    println(addFive(5))
}

fun lamda_demo4() {
    val vals = listOf(1, 2, 3, 4, 5, 6).filter { num ->
        num.mod(2) == 0
    }
    for (element in vals) {
        println(element)
    }
    println (vals.toString())
}

fun lamda_demo5() {
    val lambda_m1 : (String, String) -> String = { first: String, last: String ->
        "My name is $first $last"
    }
    val lambda_m2 = { first: String, last: String ->
        "My name is $first $last"
    }
    val lambda_m3 : (String, String) -> String = { first, last ->
        "My name is $first $last"
    }
    println( lambda_m1("Gerry", "Liu"))
}

//
fun convert(x:Double,   converter:(Double)->Double): Double {
    val result  = converter(x)
    return result
}
fun lamda_demo6() {
    println(convert(10.0, { x:Double-> x+10 } ))
    println(convert(10.0) { x:Double-> x+10} )
}

// return a lambda function
fun getLambda(x:Int):(Int)->Int
{
    if(x == 0){
        return {it * 10}
    }else{
        return {it * 20}
    }
}
fun lamda_demo7() {
    val m = getLambda(0)
    println(m(10))
    val n = getLambda(1)
    println(n(10))
}

fun main() {
	lamda_demo1()    
	lamda_demo2()
	lamda_demo3()
	lamda_demo4()
	lamda_demo5()
	lamda_demo6()
	lamda_demo7()
}


/*
SAM Single Abstract Method Conversions
https://kotlinlang.org/docs/fun-interfaces.html#sam-conversions

// Kotlin 
view.setOnClickListener{
    println("click")
}
// java 
view.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        System.out.println("click");
    }
});

// Kotlin 
view.setOnClickListener({
    v -> println("click")
})

kotlin method
public final fun setOnClickListener(l: ((v:View!)->Unit)!): Unit

java method
public void setOnClickListener(OnClickListener l)

// OnClickListener java interface
public interface OnClickListener {
    void onClick(View v);
}
*/