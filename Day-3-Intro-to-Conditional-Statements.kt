import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

import java.util.Scanner




fun main(args: Array<String>) {
   
    val inputType: String
    val scan = Scanner(System.`in`)
    val N = readLine()!!.trim().toInt()
   
    // println("$N")
     if(0 < N && N <=100)
    {
        if(N%2 != 0)
        {
            inputType = "Weird";
        }
        else
        {
            if(2<= N && N <=5)
            {
                inputType = "Not Weird";
            }
            else if(6<= N && N <=20)
            {
                inputType = "Weird";
            }
            else
            {
                inputType = "Not Weird";
            }
        }
        println(inputType)
    }
     
 
}
