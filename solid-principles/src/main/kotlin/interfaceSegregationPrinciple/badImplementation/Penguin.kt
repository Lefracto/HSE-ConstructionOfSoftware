package interfaceSegregationPrinciple.badImplementation


class Penguin(var numberOfFeathers: Int) : Bird {
    var currentLocation: String? = null

    override fun looseFeathers() {
        numberOfFeathers -= 1
    }

    override fun fly() {
        throw UnsupportedOperationException()
    }

    fun swim() {
        currentLocation = "in the water"
    }
}