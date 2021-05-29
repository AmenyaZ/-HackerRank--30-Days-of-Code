
fun main(args: Array<String>) {

    // val arr = Array<Array<Int>>(6, { Array<Int>(6, { 0 }) })

    // for (i in 0 until 6) {
    //     arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    // }
    
     val `in` = Scanner(System.`in`)
        val arr = Array(6) { IntArray(6) }
        for (i in 0..5) {
            for (j in 0..5) {
                arr[i][j] = `in`.nextInt()
            }
        }

        var max = -9 * 7
        for (i in 0..5) {
            for (j in 0..5) {
                if (j + 2 < 6 && i + 2 < 6) {
                    val sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]
                    if (sum > max) max = sum
                }
            }
        }

        println(max)
}
