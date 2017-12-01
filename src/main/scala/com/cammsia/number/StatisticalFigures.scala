package com.cammsia.number

import scala.collection.mutable.ListBuffer

/**
  *
  * 写一个函数计算数字 k 在 0 到 n 中的出现的次数，k 可能是 0 ~ 9 的一个值。
 **
 格式：
 **
 输入依次输入一个数字 n，和一个数字 k，最后计算出数字 k 在 0 到 n 中出现的次数。
 **
 样例输入
 **
 n=12
*k=1
 **
 样例输出
 **
 5
 *
 */
class StatisticalFigures(val k: Int, val n: Int) {
  def getCount(): Int = {
    (0 to n).map(i => numberToList(i)).flatten.count(i => i == k)
  }

  /**
    * 把数字素偶有位置上的数合并成一个数组
    *
    */
  def numberToList(i: Int): Seq[Int] = {
    var result = new ListBuffer[Int]()
    var num: Int = i
    while (num > 0) {
      result += num%10
      num = num / 10
    }
    return result
  }
}

object StatisticalFigures extends App {

  val statisticalFigures = new StatisticalFigures(1, 12)
  println(statisticalFigures.getCount())
}
