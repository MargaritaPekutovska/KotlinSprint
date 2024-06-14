/*fun main() {
    val yearOfSpaceFlight: Int = 1961
    var takeOffHour: String = "09"
    var takeOffMinute: String = "07"
    println(
        "Year of space flight: $yearOfSpaceFlight \n " +
                "Take off hour: $takeOffHour \n " +
                "Take off minute: $takeOffMinute"
    )

    var landingHour: String = "10"
    var landingMinute: String = "55"
    println("Landing time: $landingHour:$landingMinute")
}*/
fun main(){
    trimMargin()
}

fun trimMargin() {
    val yearOfSpaceFlight: Int = 1961
    var takeOffHour: String = "09"
    var takeOffMinute: String = "07"

    val multiString= """
        |Year of space flight: $yearOfSpaceFlight
        |Take off hour: $takeOffHour
        |Take off minute: $takeOffMinute
        """.trimMargin()
    println(multiString)

    var landingHour: String = "10"
    var landingMinute: String = "55"
    println("Landing time: $landingHour:$landingMinute")
}

