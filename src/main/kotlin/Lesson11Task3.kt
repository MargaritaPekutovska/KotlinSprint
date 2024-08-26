class Room(
    val roomName: String,
    val cover: String,
    val participantList: ArrayList<Participant>
) {

    fun addParticipant(participant: Participant) {
        participantList.add(participant)
        println("${participant.userName} has been added to the room.")
    }

    fun updateAudioStatus(userName: String, newAudioStatus: String) {
        val participant = participantList.find { it.userName == userName }
        if (participant != null) {
            participant.audioStatus = newAudioStatus
            println("Audio status of $userName has been updated to: $newAudioStatus")
        } else {
            println("Participant $userName not found.")
        }
    }

    fun displayRoomInfo() {
        println("Room: $roomName")
        println("Cover: $cover")
        println("Participants:")
        for (participant in participantList) {
            println("${participant.userName}: ${participant.audioStatus}")
        }
    }
}

class Participant(
    val avarat: String,
    val userName: String,
    var audioStatus: String,
)

fun main() {

    val room = Room(
        roomName = "Funny podcasts",
        cover = "cover_image.png",
        participantList = arrayListOf(
            Participant(avarat = "cover_image.png", userName = "Dylan1", audioStatus = "Talking.."),
            Participant(avarat = "cover_image.png", userName = "Emily3", audioStatus = "Audio is mute"),
            Participant(avarat = "cover_image.png", userName = "RodgerD", audioStatus = "User muted")
        )
    )

    room.displayRoomInfo()

    room.addParticipant(Participant(avarat = "cover_image.png", userName = "NewUser", audioStatus = "Listening"))

    room.updateAudioStatus(userName = "Emily3", newAudioStatus = "Talking..")

    room.displayRoomInfo()

}