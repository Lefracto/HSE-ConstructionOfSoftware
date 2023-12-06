package dependencyInversionPrinciple.badImplementation

class Emailer {
    fun generateWeatherAlert(weatherConditions: String): String {
        return "Email: It is $weatherConditions"
    }
}