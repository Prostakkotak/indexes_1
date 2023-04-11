package main

import impls.FunctionsImpl
import tests.FunctionsTest

fun main() {
    val tests: FunctionsTest = FunctionsTest()

    tests.invertTest()
    tests.calculateTest()
    tests.isPalindromeTest()
    tests.splitterSorterTest()
    tests.uniqueCounterTest()
    tests.substringCounterTest()
}