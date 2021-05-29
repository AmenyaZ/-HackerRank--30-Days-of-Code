
fun main(args: Array<String>) {
//val n = readLine()!!.trim().toInt()

   // val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    
       val n = readLine()!!.toInt()
    var a = readLine()!!.split(" ")


    print(a.asReversed().toString().replace(",", "").replace("[", "").replace("]", ""))

}
