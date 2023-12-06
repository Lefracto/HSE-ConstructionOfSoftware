package dependencyInversionPrinciple.betterImplementation

class Phone : Notifier {
    override fun generateWeatherAlert(weatherConditions: String): String {
        return "Phone: It is $weatherConditions"
    }
}