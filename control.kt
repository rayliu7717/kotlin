fun main(args: Array<String>) {
    ifTest()
	forTest()
	whenTest()
}

fun ifTest()
{
	var numA = 2
	if (numA == 2){
		println("numA == $numA => true")
	}else{
		println("numA == $numA => false")
	}
	
	var numB: Int = if ( numA > 2 ) 3 else 5  
	println("numB = > $numB")
	
	var numC: Int = if (numA > 2){
		numA++
		numA = 10
		println("numA > 2 => true")
		numA
	}else if (numA == 2){
		numA++
		numA = 20
		println("numA == 2 => true")
		numA
	}else{
		numA++
		numA = 30
		println("numA < 2 => true")
		numA
	}
	println("numC => $numC")
}

fun forTest()
{
	for (i in 0 until 5){
		print("i => $i \t")
	}
	println()
	for (i in 15 downTo 11){
		print("i => $i \t")
	}
	
	for (i in 20 .. 25){
		print("i => $i \t")
	}
	println()

	for (i in 10 until 16 step 2){
		print("i => $i \t")
	}
	
	println()
	for (i in "abcdefg"){
		print("i => $i \t")
	}
	println()
	var arrayListOne = arrayOf(10,20,30,40,50)
	for (i in arrayListOne){
		print("i => $i \t")
	}
	
	println()
	var arrayListTwo = arrayOf(1,3,5,7,9)
	for (i in arrayListTwo.indices){
		println("arrayListTwo[$i] => " + arrayListTwo[i])
	}
	
	println()
	var arrayListTwo = arrayOf(1,3,5,7,9)
	for ((index,value) in arrayListTwo.withIndex()){
		println("index => $index \t value => $value")
	}
}

fun whenTest()
{
	var num:Int = 5
	when(num){
		1 -> {
			println("1")
		}
		2 -> println("2")
		3 -> println("3")
		5 -> {
			println("5")
		}
		else -> {
			println("0")
		}
	}
	
	when(num){
		1 , 2 , 3 -> {
			println("1")
		}
		5 -> {
			println("5")
		}
		else -> {
			println("0")
		}
	}
	when(num > 5){
		true -> {
			println("num > 5")
		}
		false ->{
			println("num < 5")
		}
		else -> {
			println("num = 5")
		}
	}
	
	var arrayList = arrayOf(1,2,3,4,5)
	when(1){
		in arrayList.toIntArray() -> {
			println("1 is in arrayList")
		}
		in 0 .. 10 -> println("1 is in 0~10 ")
		!in 5 .. 10 -> println("1 int 5~10")
		else -> {
			println("exception")
		}
	}
	
	// is or !is to check the value type
	when("abc"){
		is String -> println("abc is a string")
		else -> {
			println("abc is not a string")
		}
	}
}
