object PatternMatchingExample {

  def main(args: Array[String]): Unit = {
    if (args.length != 1) {
      println("Please provide exactly one integer as input.")
      System.exit(1)
    }

    val input = try {
      args(0).toInt
    } catch {
      case e: NumberFormatException =>
        println("Please provide a valid integer.")
        System.exit(1)
        0 // Default value to satisfy compiler, will never reach here
    }

    val result = input match {
      case x if x <= 0 => "Negative/Zero is input"
      case x if x % 2 == 0 => "Even number is given"
      case _ => "Odd number is given"
    }

    println(result)
  }
}
