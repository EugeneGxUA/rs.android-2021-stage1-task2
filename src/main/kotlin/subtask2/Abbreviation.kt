package subtask2

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {
        var dest = a.toUpperCase()

        val sb = StringBuilder()

        b.toCharArray().forEach { c ->
            val reg = c.toString().toRegex()
            if (reg.containsMatchIn(dest)) {
                val position = dest.indexOf(c)
                dest = dest.drop(position + 1)
                sb.append(c)
            }
        }


        val res = sb.toString()

        return if (res == b) {
            "YES"
        } else {
            "NO"
        }


    }
}
