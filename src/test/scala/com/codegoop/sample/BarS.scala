package com.codegoop.sample

import org.scalatest.testng.TestNGSuite
import org.testng.annotations.Test
import org.scalatest.matchers.ShouldMatchers

class BarS extends TestNGSuite with ShouldMatchers {
  @Test def testFooData {
    val data = new FooJ().getData
    data should be ('empty)
    intercept[IndexOutOfBoundsException] {
      data.get(1)
    }
  }
}