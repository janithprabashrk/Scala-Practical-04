object Inventory_Management {

  var itemNames: Array[String] = Array("Apple", "Banana", "Orange", "Pineapple")
  var itemQuantities: Array[Int] = Array(10, 20, 15, 20)

  //Function for display inventory
  def displayInventory(): Unit = {
    println("------- Inventory ------")
    for (i <- itemNames.indices) {
      println(itemNames(i) + " : " + itemQuantities(i))
    }
  }

  //Function for restock
  def restockItem(itemName: String, quantity: Int): Unit = {
    val index = itemNames.indexOf(itemName)
    if (index != -1) {
      itemQuantities(index) += quantity
      println("Restocked " + quantity + " of " + itemName + " ==>> New quantity: "+ itemQuantities(index))
    } else {
      println("The item does not exist in the inventory...!")
    }
  }

  def sellItem(itemName: String, quantity: Int): Unit = {
    val index = itemNames.indexOf(itemName)
    if (index != -1) {
      if (itemQuantities(index) >= quantity) {
        itemQuantities(index) -= quantity
        println("Sold " + quantity + " of "  + itemName + " ==>> Remaining quantity : " + itemQuantities(index))
      } else {
        println("Not enough " + itemName + " Stocks Available.....!!")
      }
    } else {
      println("The item does not exist in the inventory...! ")
    }
  }

  def main(args: Array[String]): Unit = {
    displayInventory()
    restockItem("Apple", 5)
    sellItem("Banana", 10)
    sellItem("Orange", 20)
    displayInventory()
  }
}
