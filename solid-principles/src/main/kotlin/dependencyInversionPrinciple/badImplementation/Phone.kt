package dependencyInversionPrinciple.badImplementation

class Phone {
    fun generateWeatherAlert(weatherConditions: String): String {
        return "Phone: It is $weatherConditions"
    }
}