# Runs Context Cross Validation Scala application
# Authored by Sean Hendryx

#cd to scala app:
cd /Users/seanmhendryx/reach

# use sbt (Scala Build Tool) to run:
# First argument specifies directory to papers, second to config file, and third to output (where to save serialized, cross val results)
sbt "project main" "runMain org.clulab.context.ml.CrossValidation /Users/seanmhendryx/Research/context/corpus/papers /Users/seanmhendryx/Research/context/configFiles/out/application_Tails_NegationProperty_POS_Phi_Positional_Dependency.conf /Users/seanmhendryx/Research/context/feature_family_tests"

cd /Users/seanmhendryx/reach
sbt "project main" "runMain org.clulab.context.ml.CrossValidation /Users/seanmhendryx/Research/context/corpus/papers /Users/seanmhendryx/Research/context/configFiles/out/application_Tails_NegationProperty_POS_Phi_Dependency.conf /Users/seanmhendryx/Research/context/feature_family_tests"

sbt "project main" "runMain org.clulab.context.ml.CrossValidation /Users/seanmhendryx/Research/context/corpus/papers /Users/seanmhendryx/Research/context/configFiles/out/application_POS_Dependency.conf /Users/seanmhendryx/Research/context/feature_family_tests"
