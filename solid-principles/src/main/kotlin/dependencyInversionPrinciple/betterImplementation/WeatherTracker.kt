package dependencyInversionPrinciple.betterImplementation

class WeatherTracker(
    private var conditions: String,
    private val rainNotifier: Notifier,
    private val sunnyNotifier: Notifier
) {

    fun setCurrentConditions(weatherDescription: String) {
        this.conditions = weatherDescription
        val alert = if (weatherDescription === "rainy") {
            rainNotifier.generateWeatherAlert(weatherDescription)
        } else if (weatherDescription === "sunny") {
            sunnyNotifier.generateWeatherAlert(weatherDescription)
        } else {
            "Non such description of weather"
        }
        print(alert)
    }
}