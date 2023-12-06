package dependencyInversionPrinciple.betterImplementation

interface Notifier {
    fun generateWeatherAlert(weatherConditions: String): String
}