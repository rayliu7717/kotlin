import kotlin.math.sqrt
open class Shape
{
    protected var size = 0
    open fun draw()
    {
        println("drawing a shape")
    }
    open fun update()
    {
        println("updating a shape")        
    }
}

data class MyPoint (var x:Int, var y: Int)

class Line (var start: MyPoint, var end:MyPoint) : Shape()
{
    var length = 0.0
    init {
        length = sqrt(((end.y - start.y) * (end.y - start.y) + (end.x - start.x) * (end.y - start.x)).toDouble())

        println("First initializer block that prints $length")
    }

    val area = 0.0

    init {
        println("Second initializer block that prints ${area}")
    }

  
    override fun draw() {
        println("drawing a line from : ${start.x}, ${start.y} to ${end.x}, ${end.y} length is $length")
    }
    override fun update() {
    }
}

class Circle (var center: MyPoint, var radius: Double) : Shape()
{
	//val area = radius*radius*PI
    var area = 0
    init {
        println("Second initializer block that prints ${area}")
    }

    override fun draw() {
        println("drawing a cirlce  center: ${center.x}, ${center.y}  radius $radius")
    }
    override fun update() {
    }
}

fun drawShape(shape:Shape)
{
    shape.draw()
}


// test
fun main(args: Array<String>) {
    val from  =MyPoint(1,2)
    val to =  MyPoint(3,4)
    println(from);
    val line = Line(from,to)
    var shape = Shape()
    drawShape(shape)
    drawShape(line)
}
