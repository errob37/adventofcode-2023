package days.impl.`2023`

import days.impl.AdventOfCodeDayImpl
import days.model.Boat
import days.model.Record

class Day6 : AdventOfCodeDayImpl(2023, 6, 288L, 71503L, 5133600L) {

    override fun partOne(input: List<String>) =
        execute(input, false)

    override fun partTwo(input: List<String>) =
        execute(input, true)

    private fun execute(input: List<String>, onlyOneRace: Boolean) =
        Record
            .from(input, onlyOneRace)
            .map { Boat().getWinningOptionCount(it) }
            .fold(1L) { acc, it -> acc * it }
}

