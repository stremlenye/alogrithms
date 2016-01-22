/**
  * Created by stremlenye on 21/01/16.
  */
object Sort {
  def bubble[T](list: List[T])(implicit ord: Ordering[T]): List[T] = {
    for(
      i ← list;
      j ← list
    ) yield ord.max(i,j)
  }
}
