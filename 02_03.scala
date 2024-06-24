object SalaryCalculator {
  var normalRate = 250
  var OTrate = 85

  def totalSalary(normalHours: Double, otHours: Double): Double = {
    (normalRate * normalHours + OTrate * otHours) * 4
  }

  def tax(rate: Double, salary: Double): Double = {
    rate * salary
  }
}

object MainApp {
  def main(args: Array[String]): Unit = {
    var normalHours = 40
    var otHours = 30
    val totalSalary = SalaryCalculator.totalSalary(normalHours, otHours)
    val taxAmount = SalaryCalculator.tax(0.12, totalSalary)
    val takeHomeSalary = totalSalary - taxAmount
    println(takeHomeSalary)
  }
}
