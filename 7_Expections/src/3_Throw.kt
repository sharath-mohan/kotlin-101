fun main(args: Array<String>) {
    var test = readLine()
    try{
        test = test?.toString()
        if(test !="kotlin"){
            throw IllegalStateException("this is a wrong input")
        }
    }catch (e:Exception){
        println(e.toString())

    }

}