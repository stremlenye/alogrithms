import org.specs2.Specification

class SortSpec extends Specification {
  def is =
    s2"""
         
Bubble sort

  sort sorted list ${Bubble.sortSorted}
  sort reversed list ${Bubble.sortReversed}
  sort randomed list ${Bubble.sortRandomed}
  sort empty list ${Bubble.sortEmpty}
  sort single-item list ${Bubble.sortSingle}
  sort equal items list ${Bubble.sortEqTuple}
      """

  val sorted = List(6,5,4,3,2,1)
  val reversed = sorted.reverse
  val randomed = List(3,4,5,2,1,6)
  val empty = List.empty[Int]
  val single = List(1)
  val eqTuple = List(1,1)

  object Bubble {
    def sortSorted = Sort.bubble(sorted) mustEqual (sorted)

    def sortReversed = Sort.bubble(reversed) mustEqual (sorted)

    def sortRandomed = Sort.bubble(randomed) mustEqual (sorted)

    def sortEmpty = Sort.bubble(empty) mustEqual (empty)

    def sortSingle = Sort.bubble(single) mustEqual (single)

    def sortEqTuple = Sort.bubble(eqTuple) mustEqual (eqTuple)
  }
}