fun main() {
    val likes : UInt = 341U
    println("Понравилось $likes " + if((likes - 1U) % 10U == 0U) "человеку." else "людям.")
}