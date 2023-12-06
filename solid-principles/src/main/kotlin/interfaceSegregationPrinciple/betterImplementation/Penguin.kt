package interfaceSegregationPrinciple.betterImplementation


class Penguin(var numberOfFeathers: Int) : FeathersLooser, Swimmer {
    var currentLocation: String? = null

    override fun looseFeathers() {
        numberOfFeathers -= 1
    }

    override fun swim() {
        currentLocation = "in the water"
    }
}