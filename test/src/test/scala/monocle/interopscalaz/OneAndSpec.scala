package monocle.interopscalaz

import cats.std.int._
import cats.std.list._
import monocle.MonocleSuite
import monocle.law.discipline.function.{Cons1Tests, EachTests, IndexTests}

import scalaz.OneAnd

class OneAndSpec extends MonocleSuite {
  checkAll("each OneAnd", EachTests[OneAnd[List, Int], Int])
  checkAll("index OneAnd", IndexTests.defaultIntIndex[OneAnd[List, Int], Int])
  checkAll("cons1 OneAnd", Cons1Tests[OneAnd[List, Int], Int, List[Int]])
}
