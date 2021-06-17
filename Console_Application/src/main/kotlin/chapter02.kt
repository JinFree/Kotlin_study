fun ex03ch02(args: Array<String>)
{
    var strInt: String = "1"
    var strFloat:String = "2.5"
    var strDouble:String = (strInt.toDouble() + strFloat.toDouble()).toString()
    println(strDouble)
}
fun ex02ch02(args: Array<String>)
{
    var var01:Int =1
    var var02:Float = 0.5F
    var var03:Double = var01.toDouble() + var02.toDouble()
    println(var03)
}
fun ex01ch02(args: Array<String>)
{
    var pi : Float = 3.14F
    var str: String = "Hello World!"
    var aa : Int = 142

    println(pi)
    println(str)
    println(aa)
}

fun elvisOperator(args: Array<String>)
{
    // ?: 연산
    // A ?: B 일 때 A 가 null 이면 B 반환, null 이 아니면 A 반환
    var one = null ?: 1
    println(one)
    var two = 2 ?: 1
    println(two)
}
fun safeCallOperator(args: Array<String>)
{
    var c : String? = null
    var len : Int? = c?.length
    println(len)
}
fun helloWorld(args: Array<String>) {
    println("Hello World!")
}