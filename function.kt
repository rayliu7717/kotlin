fun main(args: Array<String>) {
    funArgs(1,10f)
	defArgs()
    defArgs(1,10f,true)
}

fun unitFun() : Unit{
    println("unitFunc")
    return
    
    // return Unit
}

fun unit1Fun(){
    println("unitFunc")
}

fun returnFun() : Int{
    return 2
}

fun funArgs(numA : Int, numB : Float){
    println("numA = $numA \t numB = $numB")
}

fun defArgs(numA : Int  = 1, numB : Float = 2f, numC : Boolean = false){
    println("numA  =  $numA \t numB = $numB \t numC = $numC")
}

fun test1() = 2                     // expression function
fun test2(num : Int) = num * 2      // 
fun test3(x : Float, y : Int = 2) = x * y  // return Float