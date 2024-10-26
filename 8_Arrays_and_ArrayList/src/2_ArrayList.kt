fun main(args: Array<String>) {
    val colors = arrayListOf<String>()
    colors.add("blue")
    println(colors)
    val favourites = arrayListOf("purple")
    colors.addAll(favourites)
    println(colors)
    colors.removeAll(listOf("blue"))
    println(colors)
}