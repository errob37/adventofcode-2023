#bash

echo  "package days.impl.$2\n\n\nimport days.impl.AdventOfCodeDayImpl\n\nclass Day$1 : AdventOfCodeDayImpl($2, $1, 0L, 0L) {\n\n override fun partOne(input: List<String>): Long { return 0L}\noverride fun partTwo(input: List<String>): Long {return 0L}  }" > ./kotlin/days/impl/$2/Day$1.kt;

touch ./resources/input/$2/day-$1.txt;
touch ./resources/test/$2/day-$1-1.txt;
touch ./resources/test/$2/day-$1-2.txt;

git add *
