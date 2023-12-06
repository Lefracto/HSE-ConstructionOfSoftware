package openClosedPrinciple.badImplementation

class EmailGreeting(private var formality: String) {

    val greeting: String = when(formality) {
        "formal" -> "Good evening, sir."
        "casual" -> "Sup bro?"
        "intimate" -> "Hello Darling!"
        else -> "Hello!"
    }

    fun setFormality(formality: String) {
        this.formality = formality
    }

}