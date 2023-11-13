fun main(args: Array<String>) {
    nullableTest()
}

fun nullableTest()
{
	var nullA : Int? = 12   // ? you can assign null to nullable variable
	val nullB : Int? = 13

	nullA = null

	if(nullA == null){
		println("nullA = $nullA")
	}
	
	var str : String? = "123456"
	str = null

	if (str == null){
		println("str is null")
	}else{
		println("str.length => ${str.length}")
	}
	println(str?.length) // same as above.
	
	
	val arrTest : Array<Int?> = arrayOf(1,2,null,3,null,5,6,null)
	for (index in arrTest) {
		if (index == null){
			continue
		}
		println("index => $index")
	}
	for (index in arrTest) {
		index?.let { println("index => $it") }
	}
	
	val testStr : String? = null
	var length = 0
	length = if (testStr != null) testStr.length else -1
	// ?: operator
	length = testStr?.length ?: -1
	println(length)
	
	println(testStr!!.length)  // force to use testStr, if testStr is null will through exception.
	
	val num1 : Int? = "Koltin" as Int
	println("nun1 = $num1")  // will through exception
	val num2 : Int? = "Koltin" as? Int
	println("nun2 = $num2)   // return null
}
