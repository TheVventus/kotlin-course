package stimmax.lessons.lesson05.homework

fun main() {
    // example 1
    val measuredSoundValue: Double = 23.0
    val soundCoef: Double? =  0.8

    val result: Double = measuredSoundValue * (soundCoef ?: 0.5)

    // example 2
    val defaultCost: Double = 50.0
    var cost: Double? = 20.0
    val deliveryCost = 5.0
    val insuranceCoefficient = 0.005

    val insuranceCost =  (cost ?: defaultCost) * insuranceCoefficient
    val totalCost: Double = deliveryCost + insuranceCost

    // example 3
    val atmosphericPressure: String? = "34.6"
    val attentionMessage = "Attention, pressure is lost"
    val pressureForLab = atmosphericPressure ?: attentionMessage
}