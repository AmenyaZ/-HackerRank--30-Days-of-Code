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



fun main(args: Array<String>) {
    // val n = readLine()!!.trim().toInt()

    // val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    // Write your code here
      val n:Int=readInt();
    var inputArray=readInts().toTypedArray();
      
    var ans=0;
    for(i in 0..n-1){
        for(j in 0..n-2){
            if(inputArray[j]>inputArray[j+1]){
              inputArray[j]=inputArray[j+1].also( { inputArray[j+1]=inputArray[j]}); //swap 
             
              ans++;
            }
        }
        if(ans==0)
          break;
    }
    println("Array is sorted in $ans swaps.");
    println("First Element: ${inputArray[0]}\nLast Element: ${inputArray[n-1]}");
  }
  private fun readLn() = readLine()!! ;
  private fun readInt() = readLn().toInt();
  private fun readStrings() = readLn().split(" ") ;
  private fun readInts() = readStrings().map { it.toInt() 
  } 

