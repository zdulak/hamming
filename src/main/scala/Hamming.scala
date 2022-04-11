object Hamming {
  def hammingDistance(first: String, second: String): Option[Int] = {
    if (first.length != second.length) None else {
      Some(first.zip(second).foldLeft(0) {
        case (distance, (first, second)) => if (first != second) distance + 1 else distance
      })
    }
  }
}
