package demo04_exercise

import java.io.{BufferedWriter, FileWriter}
import scala.io.Source

object 列表去重排序 {

  def main(args: Array[String]): Unit = {
    val source = Source.fromFile("./data/1.txt")
    val list: List[String] = source.mkString.split("\\s+").toList
    // 将列表中的字符串类型元素转换为整型
    val list1: List[Int] = list.map(_.toInt)
    // 通过将List转换为Set实现去重
    val set: Set[Int] = list1.toSet
    // 将去重后的Set再转换为List，并实现升序排序
    val list2: List[Int] = set.toList.sorted
    // 将排序后的列表写入到文件中
    val writer = new BufferedWriter(new FileWriter("./data/2.txt"))
    for (i <- list2) {
      writer.write(i.toString)
      writer.newLine()
    }
    // 释放资源
    source.close()
    writer.close()
  }

}
