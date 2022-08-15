To create the jar to upload to Lambda
	mvn clean package shade:shade 

Example to set in Runtime settings of Handler fn
churchMembers.LambdaMethodHandler -> package.className

 
git push --set-upstream origin master we added after git remote add origin <git-path> since the current branch master has no upstream branch. To push the current branch and set the remote as upstream

Helpful links to refer to get started
https://www.baeldung.com/aws-lambda-dynamodb-java
https://www.baeldung.com/java-aws-lambda

To create functional URL for Lambda
	select Lambda fn -> Configuration -> function URL

To calculate size of an item in DynamoDB and design RCU and WCU
	https://dynobase.dev/dynamodb-capacity-and-item-size-calculator/

Initial schema planned
MemberId -> is the membership number
Name -> name in the membership
HarvestTokenReturnedCount -> number
HarvestTokenBoughtCount -> number
HarvestTokenBoughtFlag -> Boolean set this to true when HarvestTokenBoughtCount has value equal to or more than 1
HarvestTokenReturnedFlag -> "yes" if HarvestTokenBoughtCount == HarvestTokenReturnedCount, "partial" if  HarvestTokenReturnedCount <= HarvestTokenBoughtCount



