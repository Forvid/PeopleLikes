fun main() {
    // Пример значения лайков
    val likes = 32 // Замените это значение для проверки

    // Вызов функции для вывода корректного текста
    println(getLikesText(likes))
}

// Функция для получения корректного текста
fun getLikesText(likes: Int): String {
    return when {
        likes % 10 == 1 && likes % 100 != 11 -> "Понравилось $likes человеку"
        likes % 10 in 2..4 && (likes % 100 !in 12..14) -> "Понравилось $likes людям"
        else -> "Понравилось $likes людям"
    }
}
