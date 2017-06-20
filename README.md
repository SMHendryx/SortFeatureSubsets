# SortFeatureSubsets
Scala application that generates the power set of a set of strings and writes to application.conf files and sorts the subsets of features by a specified type of value (such as F1, precision, or recall in IR).  Useful for machine learning feature selection.

Run with Scala Build Tool.

To generate power set of config files: 
<br />   
sbt "runMain GenConfigFiles /path/to/complete/set/application.conf /path/to/write/output/of/config/files"

To sort the sets of features by a specified IR score:
<br />  
sbt "runMain SortByScore /path/to/dir/containing/serialized/input [Score type, e.g. F2] /where/to/save/output"

