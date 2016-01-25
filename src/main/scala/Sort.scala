import scala.annotation.tailrec

/**
  * Created by stremlenye on 21/01/16.
  */
object Sort {
  @tailrec
  def bubble[T](list: List[T])(implicit ord: Ordering[T]): List[T] = {
    type BeenSorted = Boolean
    def go(list: List[T]): (List[T], BeenSorted) = list match {
      case h1 :: h2 :: tail if ord.gteq(h1, h2) ⇒ go(h2 :: tail) match {
        case (xs, r) ⇒ (h1 :: xs, r)
      }
      case h1 :: h2 :: tail if ord.lt(h1, h2) ⇒ (h2 :: go(h1 :: tail)._1, true)
      case head :: Nil ⇒ (head :: Nil, false)
      case Nil ⇒ (Nil, false)
    }
    go(list) match {
      case (ls, true) ⇒ bubble(ls)
      case (ls, false) ⇒ ls
    }
  }
}
