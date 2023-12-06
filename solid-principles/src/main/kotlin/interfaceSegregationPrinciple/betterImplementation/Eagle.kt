package interfaceSegregationPrinciple.betterImplementation


class Eagle(var numberOfFeathers: Int): Flyer, FeathersLooser {
    var currentLocation: String? = null

    override fun fly() {
        currentLocation = "in the air"
    }

    override fun looseFeathers() {
        numberOfFeathers -= 1
    }
}