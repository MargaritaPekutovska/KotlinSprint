enum class Fish {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH
}

fun addFish(fish: Fish) {
    when (fish) {
        Fish.GUPPY -> println("Add ${Fish.GUPPY} to aquarium")
        Fish.ANGELFISH -> println("Add ${Fish.ANGELFISH} to aquarium")
        Fish.GOLDFISH -> println("Add ${Fish.GOLDFISH} to aquarium")
        Fish.SIAMESE_FIGHTING_FISH -> println("Add ${Fish.SIAMESE_FIGHTING_FISH} to aquarium")
    }
}

fun listOfFish() {
    println("Available fish to add to the aquarium:")
    for (fish in Fish.values()) {
        println(fish)
    }
}

fun main() {
    listOfFish()
}
