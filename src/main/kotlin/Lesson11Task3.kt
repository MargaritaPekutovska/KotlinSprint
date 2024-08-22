class Room (
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
        val userName: String,
        var audioStatus: String,
    )


    val room = Room (
        roomName = "Funny podcasts",
        cover = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRi3HDfy9bU5aslSNV2hLNKt4Sv7-DAsTdqsA&s",
        participantList = arrayListOf(
            Participant(userName = "Dylan1", audioStatus = "Talking.."),
            Participant(userName = "Emily3", audioStatus = "Audio is mute"),
            Participant(userName = "RodgerD", audioStatus = "User muted")
        )
    )

    fun main() {
        room.displayRoomInfo()

        room.addParticipant(Participant(userName = "NewUser", audioStatus = "Listening"))

        room.updateAudioStatus(userName = "Emily3", newAudioStatus = "Talking..")

        room.displayRoomInfo()

    }