package impls

import interfaces.Functions

/**
 * Класс, реализующий интерфейс Functions
 */
class FunctionsImpl : Functions {
    override fun calculate(a: Int, b: Int) = a + b
    override fun substringCounter(s: String, sub: String): Int {
        return s.split(sub).size - 1
    }

    override fun splitterSorter(s: String, sub: String): List<String> {
        return s.split(sub).sorted()
    }

    override fun uniqueCounter(s: String, sub: String): Map<String, Int> {
        val map = mutableMapOf<String, Int>()
        s.split(sub).forEach { str -> map[str] = (map[str] ?: 0) + 1 }
        return map
    }

    override fun isPalindrome(s: String): Boolean {
        return s == s.reversed()
    }

    override fun invert(s: String): String {
        return s.reversed()
    }
}
