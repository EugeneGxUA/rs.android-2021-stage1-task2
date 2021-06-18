package subtask3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {

        when (blockB) {
            String::class -> {
                val typedList = blockA.filterIsInstance(String::class.java)
                return typedList.joinToString("", "", "")
            }
            Int::class -> {
                val typedList = blockA.filterIsInstance(Number::class.java)
                return typedList.map {
                    it.toString().toInt()
                }.sum()
            }
            else -> {
                val typedList = blockA.filterIsInstance(LocalDate::class.java)
                val set : NavigableSet<LocalDate> = TreeSet(typedList)
                return set.lower(LocalDate.now())?.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) ?: ""
            }
        }
    }
}
