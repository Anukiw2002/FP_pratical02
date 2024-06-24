object MovieTheater {

  // Function to calculate the number of attendees based on ticket price
  def attendees(price: Double): Int = {
    (120 + (15 - price) / 5 * 20).toInt
  }

  // Function to calculate revenue based on ticket price
  def revenue(price: Double): Double = {
    attendees(price) * price
  }

  // Function to calculate cost based on ticket price
  def cost(price: Double): Double = {
    500 + 3 * attendees(price)
  }

  // Function to calculate profit based on ticket price
  def profit(price: Double): Double = {
    revenue(price) - cost(price)
  }

  def main(args: Array[String]): Unit = {
    // Calculate and print profits for different ticket prices
    println(s"Profit at price 5: ${profit(5)}")
    println(s"Profit at price 10: ${profit(10)}")
    println(s"Profit at price 15: ${profit(15)}")
    println(s"Profit at price 20: ${profit(20)}")
    println(s"Profit at price 25: ${profit(25)}")
    println(s"Profit at price 30: ${profit(30)}")
    println(s"Profit at price 35: ${profit(35)}")
    println(s"Profit at price 40: ${profit(40)}")
  }
}
