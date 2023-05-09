class Trade(val id: String, val symbol: String, val quantity: Int, var price: Double){
//  override def toString = s"$id $symbol $quantity $price"

  private var _price = price //price is constructor parameter

  def getPrice: Double = _price //getter method

  def setPrice_=(value: Double): Unit = {    //setter method
    if (value >= 0) _price = value
  }

  def value: Double = getPrice * quantity
}

//object Trade{
//  def apply(): Trade = {
//    new Trade("1002", "WIN", 200, 169.35)
//  }
//
//}




