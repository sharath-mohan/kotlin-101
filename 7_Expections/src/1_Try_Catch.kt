fun main(args: Array<String>) {
    val input = readLine()
    try{
        println(input?.toInt())
    }catch (e:Exception){
        println(e.cause)
    }
}