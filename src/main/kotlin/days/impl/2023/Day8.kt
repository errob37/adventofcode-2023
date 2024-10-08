package days.impl.`2023`

import days.impl.AdventOfCodeDayImpl
import days.model.Network


class Day8 : AdventOfCodeDayImpl(2023, 8, 6L, 6L, 16897L) {

    override fun partOne(input: List<String>) =
        execute(input, Regex("^AAA$"), Regex("^ZZZ$"))

    override fun partTwo(input: List<String>) =
        execute(input, Regex("^..A$"), Regex("^..Z$"))

    private fun execute(input: List<String>, fromNode: Regex, toNode: Regex) =
        Network(input).hopCount(fromNode, toNode)
}
