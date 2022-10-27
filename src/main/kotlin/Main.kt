import java.util.Scanner
import kotlin.math.pow

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    print("Enter the side of the square >> ")
    var a:Int = reader.nextInt()

    var p = 4 * a
    var s = a * a

    println("P = $p")
    println("S = $s")

    print("Enter the side of the rectangle [a] >> ")
    a = reader.nextInt()
    print("Enter the side of the rectangle [b] >> ")
    var b:Int = reader.nextInt()

    s = a * b
    p = 2 * (a + b)

    println("P = $p")
    println("S = $s")

    print("Enter the side of the cube edge >> ")
    a = reader.nextInt()

    s = 6 * (a * a)
    val v:Int = a * a * a

    println("S = $s")
    println("V = $v")

    print("First num >> ")
    a = reader.nextInt()
    var temp:Int = a
    print("Second num >> ")
    b = reader.nextInt()

    println("Before swap")
    println("First = $a")
    println("Second = $b")
    println("After swap")
    temp = b
    b = a
    a = temp
    println("First = $a")
    println("Second = $b")

    print("Enter X >> ")
    a = reader.nextInt()
    b = 3 * a.toFloat().pow(6).toInt() - 6 * a.toFloat().pow(2).toInt() - 7
    println("Result = $b")
}