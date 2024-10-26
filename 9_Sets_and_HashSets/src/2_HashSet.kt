fun main(args: Array<String>) {
    val myHasSet = hashSetOf("apples","grapes")
    myHasSet.addAll(setOf("banana","apples"))
    println(myHasSet)
}