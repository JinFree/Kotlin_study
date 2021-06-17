fun helloWorld(args: Array<String>) {
    println("Hello World!")
}

fun safeCallOperator(args: Array<String>)
{
    var c : String? = null
    var len : Int? = c?.length
    println(len)
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
fun main(args: Array<String>)
{
    elvisOperator(args)
}