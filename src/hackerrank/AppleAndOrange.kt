package hackerrank

import java.util.*

// Complete the countApplesAndOranges function below.
fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Unit {
    var apple = Array<Int>(apples.size, { 0 });
    var orange = Array<Int>(oranges.size, { 0 });
    var noApples = 0;
    var noOranges = 0;
    for (app in apples.indices) {
        apple[app] = a + apples[app];
        if(apple[app] in s..t){
            noApples++;
        }
    }
    for (ora in oranges.indices) {
        orange[ora] = b + oranges[ora];
        if(orange[ora] in s..t){
            noOranges++;
        }
    }
    println(noApples);
    println(noOranges);
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val st = scan.nextLine().split(" ")

    val s = st[0].trim().toInt()

    val t = st[1].trim().toInt()

    val ab = scan.nextLine().split(" ")

    val a = ab[0].trim().toInt()

    val b = ab[1].trim().toInt()

    val mn = scan.nextLine().split(" ")

    val m = mn[0].trim().toInt()

    val n = mn[1].trim().toInt()

    val apples = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val oranges = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    countApplesAndOranges(s, t, a, b, apples, oranges)
}
