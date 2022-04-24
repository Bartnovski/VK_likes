fun main() {
    val likes : UInt = 35811U
    println("Понравилось $likes " + if(((likes - 1U) % 10U == 0U) && (likes  % 100U != 11U)) "человеку." else "людям.")
}