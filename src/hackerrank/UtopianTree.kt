//import java.io.*
//import java.math.*
//import java.security.*
//import java.text.*
//import java.util.*
//import java.util.concurrent.*
//import java.util.function.*
//import java.util.regex.*
//import java.util.stream.*
//import kotlin.collections.*
//import kotlin.comparisons.*
//import kotlin.io.*
//import kotlin.jvm.*
//import kotlin.jvm.functions.*
//import kotlin.jvm.internal.*
//import kotlin.ranges.*
//import kotlin.sequences.*
//import kotlin.text.*
//
//// Complete the utopianTree function below.
////fun utopianTree(n: Int): Int {
////    var result = Array<Int>(n, { 0 });
////    var cycle = 1;
////    var height = 1;
////    var arrayOfZeros = IntArray(size)
////
////    while (cycle <= n){
////        if(cycle % 2 !== 0 ){
////            height *= 2;
////        }else{
////            height++;
////        }
////        result[cycle] = height;
////        cycle++;
////    }
////
////    return result;
////}
////
////fun hackerrank.main(args: Array<String>) {
////    val scan = Scanner(System.`in`)
////
////    val t = scan.nextLine().trim().toInt()
////
////    for (tItr in 1..t) {
////        val n = scan.nextLine().trim().toInt()
////
////        val result = utopianTree(n)
////
////        println(result)
////    }
////}
