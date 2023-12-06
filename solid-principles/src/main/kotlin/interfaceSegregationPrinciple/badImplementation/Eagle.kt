package interfaceSegregationPrinciple.badImplementation


class Eagle(var numberOfFeathers: Int): Bird {
    var currentLocation: String? = null

    override fun fly() {
        currentLocation = "in the air"
    }

    override fun looseFeathers() {
        numberOfFeathers -= 1
    }
}