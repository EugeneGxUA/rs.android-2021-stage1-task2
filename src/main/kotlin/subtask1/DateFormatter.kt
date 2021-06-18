package subtask1

import java.text.SimpleDateFormat
import java.time.DateTimeException
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class DateFormatter {


    fun toTextDay(day: String, month: String, year: String): String {
        return try {
            val localDate = LocalDate.of(year.toInt(), month.toInt(), day.toInt())
            val formatt = DateTimeFormatter.ofPattern("dd MMMM, EEEE", Locale.getDefault())


            formatt.format(localDate).toLowerCase()
        } catch (e: DateTimeException) {
            "Такого дня не существует"
        }


//        val formatter = SimpleDateFormat("dd MMMM yyyy", Locale.getDefault())
//
//        val calendar = Calendar.getInstance()
//        calendar.set(year.toInt(), month.toInt(), day.toInt())
//        formatter.format(calendar.)
    }
}
