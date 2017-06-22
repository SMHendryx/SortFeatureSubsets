cd ~/githublocal/reach

# first argument to Scala application is input directory (of .ser files), 
#   second is score type to extract (of either 'F1', 'Precision', or 'Recall'),
#   and third is output (where to save sorted output in txt)
sbt "runMain SortByScore /Users/seanmhendryx/Research/context/feature_family_tests F1 /Users/seanmhendryx/Research/context/sorted_feature_families"