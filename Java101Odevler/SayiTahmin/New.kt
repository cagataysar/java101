import java.util.*

object New {
    @JvmStatic
    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)
        println("ilk Sayı")
        val n1 = scanner.nextInt()
        println("İkinci ")
        val n2 = scanner.nextInt()
        var ebob = 1
        for (i in 1..n1) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i
            }
        }
        println(ebob)
    }
}