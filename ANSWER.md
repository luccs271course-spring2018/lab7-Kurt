# Lab 7 Answers
 ### What is the purpose of the various auxiliary methods populateList, populateFifoList, and ReverseLines.printReverse?
 They exist to limit what is run on each recursion. The auxiliary methods can call themselves to retrieve all of the data without having spend time to use it like the surrounding method.
 
 ### Why do these methods need to have arguments, and how does the argument change from one recursive call to the next?
 The argument allows each recursion to move on to the next piece of data. For example each time populateList is called again it uses a different node.

### What are the time and space complexity of each of the populateList populateFifoList methods, as well as ReverseLines.printReverse?
All are various kinds of O(n). Each method runs it's operations once for every item.

### Which of these methods can be implemented using while loops?
All of them. The way recursion is used here is just continuing a series of operations until a certain condition is met. That is what a while loop does.