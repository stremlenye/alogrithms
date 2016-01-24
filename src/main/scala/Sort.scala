/**
  * Created by stremlenye on 21/01/16.
  */
object Sort {
  def bubble[T](list: List[T])(implicit ord: Ordering[T]): List[T] = {
    def go(list: List[T]): (List[T], Boolean) = list match {
      case it1 :: it2 :: tail if ord.lt(it1, it2) ⇒ (it2 :: go((it1 :: tail))._1, true)
      case it1 :: it2 :: tail if ord.gt(it1, it2) ⇒ (it1 :: go((it2 :: tail))._1, false)
      case head :: Nil ⇒ (head :: Nil, false)
    }
    go(list) match {
      case (ls, true) ⇒ go(ls)._1
      case (ls, false) ⇒ ls
    }
  }
}
