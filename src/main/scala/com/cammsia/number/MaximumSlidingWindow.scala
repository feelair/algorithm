package com.cammsia.number
/**
给出一个可能包含重复数据的整数数组，和一个大小为k的滑动窗口
。从左到右在数组中滑动这个窗口，写一个函数找出数组中每个窗口的最大值

ex：
num = [1, 2, 7, 7, 8]
k = 3
输出：
[7, 7, 8]

直观思路：暴力测试，每次从一个窗口选出最大值，时间复杂度O(k*n); 
改进思路： 
我们可以发现，窗口是滑动形成的，最大值可能是以前窗口中的最大值，或者是新值。
因此我们只要保存着以前窗口的最大值。 
我们使用双端队列容器存储最大值在数组中的索引。队列头部是以前窗口中最大值的最大值。

当以前窗口的最大值被滑出窗口时，需要从队列头部删除。
当新值大于队列中数字最大的数字时，删除队列中的所有数字，存储新值到队列头。（新值索引靠后，老值已经没有可能成为新窗口的最大值）
当新值不大于原有最大值时，当滑动新窗口时，仍有可能成为最大值，首先从队列尾依次删除比新值小的数字，然后存储到新值队列尾。
**/

object MaximumSlidingWindow extends App {
  val num = [1, 2, 7, 7, 8]
  val k = 3
}