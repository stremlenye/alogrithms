import com.stremlenye.sort.Sort
import org.specs2.Specification

class SortSpec extends Specification {
  def is =
    s2"""

Quick sort

  sort sorted list ${Quick.sortSorted}
  sort reversed list ${Quick.sortReversed}
  sort randomed list ${Quick.sortRandomed}
  sort empty list ${Quick.sortEmpty}
  sort single-item list ${Quick.sortSingle}
  sort equal items list ${Quick.sortEqTuple}
      """

  val sorted = List(6,5,4,3,2,1)
  val reversed = sorted.reverse
  val randomed = List(3,4,5,2,1,6)
  val empty = List.empty[Int]
  val single = List(1)
  val eqTuple = List(1,1)
  val huge = (1 to 10000).toList
  val hugeSorted = huge.reverse

  object Quick {
    def sortSorted = Sort.quick(sorted) mustEqual sorted

    def sortReversed = Sort.quick(reversed) mustEqual sorted

    def sortRandomed = Sort.quick(randomed) mustEqual sorted

    def sortEmpty = Sort.quick(empty) mustEqual empty

    def sortSingle = Sort.quick(single) mustEqual single

    def sortEqTuple = Sort.quick(eqTuple) mustEqual eqTuple

    def sortHuge = Sort.quick(huge) mustEqual hugeSorted
  }
}