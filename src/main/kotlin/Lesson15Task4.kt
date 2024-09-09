abstract class Product(val name: String, val quantityInStock: Int)

class MusicalInstrument(name: String, quantityInStock: Int) : Product(name, quantityInStock)

class Component(name: String, quantityInStock: Int, val approachesTheInstrument: String) :
    Product(name, quantityInStock)

interface FindComponent {
    fun findComponent(instrument: MusicalInstrument): Component?
}

class ComponentFinder(private val components: List<Component>) : FindComponent {
    override fun findComponent(instrument: MusicalInstrument): Component? {
        println("Searching for suitable components for the tool: ${instrument.name}")
        return components.find { it.approachesTheInstrument == instrument.name }
    }
}

fun main() {
    val guitar = MusicalInstrument("Guitar", 10)
    val piano = MusicalInstrument("Piano", 5)

    val guitarString = Component("Guitar string", 100, "Guitar")
    val pianoKey = Component("Piano key", 50, "Piano")
    val drumstick = Component("Drum stick", 30, "Drum")

    val components = listOf(guitarString, pianoKey, drumstick)
    val componentFinder = ComponentFinder(components)

    val foundComponent = componentFinder.findComponent(guitar)
    if (foundComponent != null) {
        println("Component found: ${foundComponent.name}")
    } else {
        println("Instrument component not found.")
    }
}
