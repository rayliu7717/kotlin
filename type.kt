fun main(args: Array<String>) {
    typeTest()
}
fun typeTest()
{
	var a: Byte = 2
	var b: Short = 2
	var c: Int = 2
	var d: Long = 2L         //
	var e: Float = 2f        // or 2F
	var f: Double = 2.0
	
	println(" a => $a \n b => $b \n c => $c \n d => $d \n e => $e \n f => $f);   
	
	var g = 0x0F            //hex
	var h = 0b00001011      //binary
	var k = 123             //decimal
	println(" g => $g \n h => $h \n k => $k);   
	
	var isNum: Boolean
	isNum = false
	println("isNum => $isNum")
	
	var char1: Char
	char = 'a'
	
	val str: String = "kotlin"
	println("str => $str")
}

fun typeConvertionTest()
{
	var numA: Int = 97
	println(numA.toByte())
	println(numA.toShort())
	println(numA.toInt())
	println(numA.toLong())
	println(numA.toFloat())
	println(numA.toDouble())
	println(numA.toChar())
	println(numA.toString(
}

fun logicalOperatorTest()
{
	var a: Boolean = false
	var b: Boolean = true
	var result: Boolean

	if (a || b){
		result = a || b
		println("a || b => $result")
	}

	if (a && b){
		result = a && b
		println("a && b => $result")
	}
	result = !a
	println("!a => $result")

	result = !b
	println("!b => $result")
}
