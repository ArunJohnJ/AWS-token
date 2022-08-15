To create the jar to upload to Lambda
	mvn clean package shade:shade 

Example to set in Runtime settings of Handler fn
churchMembers.LambdaMethodHandler -> package.className

 
git push --set-upstream origin master we added after git remote add origin <git-path> since the current branch master has no upstream branch. To push the current branch and set the remote as upstream


Initial schema planned
Id -> is the membership number
Name -> name in the membership
HarvestTokenReturnedCount -> number
HarvestTokenBoughtCount -> number
HarvestTokenBoughtFlag -> Boolean set this to true when HarvestTokenBoughtCount has value equal to or more than 1
HarvestTokenReturnedFlag -> "yes" if HarvestTokenBoughtCount == HarvestTokenReturnedCount, "partial" if  HarvestTokenReturnedCount <= HarvestTokenBoughtCount



