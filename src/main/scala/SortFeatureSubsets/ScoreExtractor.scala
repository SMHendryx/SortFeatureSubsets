/* Extracts scores from .ser files in a directory */

//package org.clulab.context.ml

import com.typesafe.config.ConfigFactory
//import utils.Serializer
import org.clulab.utils.Serializer
import java.io.File
import scala.math.BigDecimal

object ScoreExtractor{
  def getScores(arguments:Array[String]) = {
    //:Map[String, BigDecimal]
    // Gets the scores of specified type.  Function currently readys in args
    // Get the input directory containing the .ser files:
    val inputDirectory = arguments(0)
    // Get the Score type, of either 'F1', 'Precision', or 'Recall':
    val scoreType = arguments(1)
    // Set the output directory in which to save sorted output (in .txt):
    val outputDirectory = arguments(2)
    
    println(s"Extracting ${scoreType} scores.")

    // Get list of files:
    val files = (new File(inputDirectory)).listFiles

    println("Found Files:")
    files.foreach {
      file => println(file.toString)
    }
    //println(files.mkString)
  }
}