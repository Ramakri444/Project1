package pack

import org.apache.spark._

object obj {
  
  def main(args:Array[String]):Unit={
  
    
    println("====raw list====")
    val liststr = List("zeyo~analytics","bigdata~spark","hive~sqoop")
    
    liststr.foreach(println)
    
    println("====flattening====")
    
    val flatdata = liststr.flatMap(x=>x.split("~"))
    
    flatdata.foreach(println)
    
    
    
  }
}