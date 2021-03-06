package hackerrank

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

// Complete the angryProfessor function below.
fun angryProfessor(k: Int, a: Array<Int>): String {
    a.sort();
    var count = 0;
    var result = "";
    for(element in a){
        if(element <= 0) {
            count++;
        }
    }
    result = if(count>=k){
        "NO"
    }
    else{
        "YES"
    }
    return result;
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val nk = scan.nextLine().split(" ")

        val n = nk[0].trim().toInt()

        val k = nk[1].trim().toInt()

        val a = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()


        val result = angryProfessor(k, a)

         println(result)

    }
}
