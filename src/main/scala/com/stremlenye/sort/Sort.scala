package com.stremlenye.sort

import scala.annotation.tailrec

/**
  * Created by stremlenye on 21/01/16.
  */
object Sort {
  def quick[A](a: Seq[A])(implicit o: A => Ordered[A]): Seq[A] = a match {
    case Seq() => Seq()
    case x :: xs => quick(xs.filter(x <= _)) ++ Seq(x) ++ quick(xs.filter(x > _))
  }
}
