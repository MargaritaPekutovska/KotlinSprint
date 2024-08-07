package lesson8

fun main() {
    viewsForWeek()
}

const val MONDAY_VIEWS = 5
const val TUESDAY_VIEWS = 6
const val WEDNESDAY_VIEWS = 9
const val THURSDAY_VIEWS = 11
const val FRIDAY_VIEWS = 15
const val SATURDAY_VIEWS = 20
const val SUNDAY_VIEWS = 30

fun viewsForWeek() {
    val viewsArray = intArrayOf(
        MONDAY_VIEWS,
        TUESDAY_VIEWS,
        WEDNESDAY_VIEWS,
        THURSDAY_VIEWS,
        FRIDAY_VIEWS,
        SATURDAY_VIEWS,
        SUNDAY_VIEWS
    )

    var totalViews = 0
    for (view in viewsArray) {
        totalViews += view
    }
    println(totalViews)
}
