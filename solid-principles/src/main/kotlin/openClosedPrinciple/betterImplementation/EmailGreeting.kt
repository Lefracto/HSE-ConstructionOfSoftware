package openClosedPrinciple.betterImplementation

class EmailGreeting(private var greetingStrategy: GreetingStrategy) {

    val greeting: String
        get() = greetingStrategy.greet()

    fun setGreetingStrategy(greetingStrategy: GreetingStrategy) {
        this.greetingStrategy = greetingStrategy
    }
}
