package dependencyInversionPrinciple.betterImplementation

class Emailer : Notifier {
    override fun generateWeatherAlert(weatherConditions: String): String {
        return "Email: It is $weatherConditions"
    }
}