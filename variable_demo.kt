fun main(args: Array<String>) {
    variableTest()
}
fun variableTest()
{
    //initilize 
	var var_a: Int = 10
	// 
	var var_b = 5

	//if not init，
	var var_c: Float
	var_c = 12.3f
	var_c += 1

	println("var_a => $var_a \t var_b => $var_b \t var_a => $var_c")

	val val_a: Int = 100

	val val_b = 50

	val val_c: Int
	val_c = 1
	// val_c += 1 val_c is constant, cannot change
	println("val_a => $val_a \t val_b => $val_b \t val_c => $val_c")    
}
