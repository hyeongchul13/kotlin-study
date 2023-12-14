// 1. 풀이
fun repeatTest(repeatText: String, repeatNumber: Int) {
    for (i in 1..repeatNumber) println(repeatText)
}
// repeatTest("안녕",3)

// 2. 풀이
fun sumTest(givenNumber: Int): Int {
    var sum: Int = 0
    for (i in 1..givenNumber) sum += i
    return sum
}
//sumTest(4)

// 3. 풀이
fun sumTest2(): Int {
    var sum: Int = 0
    for (i in 1..100) {
        if (i % 7 == 0) sum += i
    }
    return sum
}
//sumTest2()

// 4. 풀이
fun increaseOne(numberUnder100: Int) {
    var givenNumber: Int = numberUnder100
    while (givenNumber < 100) {
        givenNumber++
        println("up")
    }
}
//increaseOne(50)

// 5. 풀이
fun checkPassOrNot(examScores: List<Int>): BooleanArray {
    val resultArray = BooleanArray(examScores.size, { false })
    examScores.forEachIndexed { index, score ->
        if (score >= 80) resultArray[index] = true
    }
    return resultArray
}
//val result = checkPassOrNot(listOf<Int>(70,71,72,77,78,79,80,82,90,99))
//result.forEach {
//    println(it)
//}

// 6. 풀이
fun findSumIsSixFromDice(): List<List<Int>> {
    val resultList = mutableListOf<List<Int>>()
    for (i in 0..6) {
        for (j in 1..6) {
            if (i + j == 6) {
                val temp = listOf<Int>(i, j)
                resultList.add(temp)
            }
        }
    }
    return resultList
}
//println(findSumIsSixFromDice())

// 7. 풀이
fun eatUntilNothungry(totalCnt: Int, currentCnt: Int) {
    var currentCntCopy: Int = currentCnt
    do {
        println("밥을 먹었다")
        currentCntCopy++
    } while (currentCntCopy < totalCnt)
    println("배가 부르다")
}
//eatUntilNothungry(10,10)

// 8. 풀이
fun outArmys(
    firstArmy: List<String>, secondArmy: List<String>, outArmy: Int
): List<List<String>>? {
    if (firstArmy.size < outArmy || secondArmy.size < outArmy)  return null
    val firstArmyTemp = mutableListOf<String>()
    val secondArmyTemp = mutableListOf<String>()
    for ((index, army) in firstArmy.withIndex()) {
        if (index != outArmy) firstArmyTemp.add(army)
    }
    for ((index, army) in secondArmy.withIndex()) {
        if (index != outArmy) secondArmyTemp.add(army)
    }
    val result = listOf<List<String>>(firstArmyTemp, secondArmyTemp)
    return result
}
//println(outArmys(
//        firstArmy = listOf<String>("A", "B", "C", "D", "E"),
//        secondArmy = listOf<String>("A", "B", "C"),
//        outArmy = 2
//    )
//)

fun gugudan(dan: Int) {
    val numbers = mutableListOf<Int>()
    for (i in 1..9) numbers.add(dan * i)
    println(numbers)
}
//gugudan(8)

fun splitNumbers(firstIntList: List<Int>, secondIntList: List<Int>): Map<String, List<Int>> {
    val result = mutableMapOf<String, List<Int>>()
    val totalIntList = mutableListOf<Int>()
    totalIntList.addAll(firstIntList)
    totalIntList.addAll(secondIntList)

    val eventNumber = mutableListOf<Int>()
    val oddNumber = mutableListOf<Int>()

    totalIntList.forEach { number ->
        if (number % 2 == 0) eventNumber.add(number)
        else oddNumber.add(number)
    }
    result.put("짝수", eventNumber)
    result.put("홀수", oddNumber)
    return result
}
println(
    splitNumbers(listOf<Int>(1, 2, 3, 4, 5), listOf<Int>(6, 7, 8, 9, 10))
)