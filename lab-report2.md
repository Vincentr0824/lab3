# Lab Report 2

For this lab report, I had changed the code that we were previously given to run a server in order for it to keep track of strings instead.
![Image](Screen Shot 2023-04-24 at 9.30.47 PM.png)
The image above is the previously used NumberServers.java file, but with drastic changes to the Handler class.

![Image](Screen Shot 2023-04-24 at 9.34.20 PM.png)
This is a screenshot of the Server.java code that was used. This code was untouched. There are a few imports not shown above the screenshot of the code as they weren't able to fit in the image.

![Image](Screen Shot 2023-04-24 at 9.27.29 PM.png)
This is the first screenshot of using "/add-message" in the URL. No methods from Server.java are used as those methods are involved with the actual creation of the server. The ```handleRequest``` method is being used here. The method splits the URL where there is an "=" if the URL contains "/add". The argument of the method is the entire URL, which is then split and put into String[] parameters. It then takes the string that comes after the "=", which is parameters[1] and adds it onto the field '''ArrayList<String> str''' which is returned. In this case, parameters[0] is "test1". In this case, parameters[0] is everything before the "=" in the query, and str = [test1]. 

![Image](Screen Shot 2023-04-24 at 9.27.42 PM.png)
This is the second screenshot of using "/add-message" in the URL. No methods are also used from the Server.java file here. The same exact ```handleRequest``` method is being used here. The only difference is that instead of an empty string being added to, the string is no longer empty and still contains the text that was previously returned. Therefore, it returns the previously returned string and the new string added on through "/add-message". Once again, the argument in this example is the entire URL that is given to the '''handleRequest''' method, and the field that is returned is '''ArrayList<String> str''' which has had parameters[1] added on to it. It keeps the previous String which was added onto it. In this case, parameters[1] = test2, and str = [test1, test2]. 

Part 2

![Image](Screen Shot 2023-04-24 at 9.57.56 PM.png)
   
```
   @Test
   
   public void testAverageWithoutLowest4() {
   
     double[] test = {1.0, 1.0, 1.0};
   
     boolean result = 1.0 == ArrayExamples.averageWithoutLowest(test);
   
     assertEquals(true, result);
   
   }
   ```
   
The screenshot/code above is of a JUnit test written for the method ```averageWithoutLowest```. It is a failure inducing input, because the code ignores the lowest number, however, every number in this test is equal to each other. The symptom of using the input ```double[] test = {1.0, 1.0, 1.0}``` can be seen at the bottom of the screenshot, through the 1 failed test. 

![Image](Screen Shot 2023-04-24 at 9.58.35 PM.png)
The screenshot above is of the ```averageWithoutLowest``` method. It can be seen that it simply does nothing if the number is equal to the lowest, which is where our problem originates.

![Image](Screen Shot 2023-04-24 at 10.06.19 PM.png)
```
  @Test
   
  public void testAverageWithoutLowest() {
   
    double[] test = {1.0, 2.0, 3.0, 4.0};
   
    boolean result = 3.0 == ArrayExamples.averageWithoutLowest(test);
   
    assertEquals(true, result);
   
  }
   ```
The screenshot/code above is of a JUnit test written for the method ```averageWithoutLowest```. It is an input that doesn't induce a failure. Once again, the symptom of only the previously mentioned test failing can be seen at the bottom of the screenshot. The test using ```double[] test = {1.0, 2.0, 3.0, 4.0}``` is part of the 8 tests which were run, but didn't fail. 

![Image](Screen Shot 2023-04-24 at 10.30.56 PM.png)
The screenshot above is of the code after it was fixed.

***Before:***
```
  static double averageWithoutLowest(double[] arr) {

    if(arr.length < 2) { return 0.0; }
      
    double lowest = arr[0];
      
    for(double num: arr) {
      
    if(num < lowest) { lowest = num; }
   
    }
    
    double sum = 0;
    
    for(double num: arr) {
    
      if(num != lowest) { sum += num; }
      
      index += 1;
    
    }
    
    return sum / (arr.length - 1);
  
  }
   ```
***After:***
```
  static double averageWithoutLowest(double[] arr) {

    if(arr.length < 2) { return 0.0; }
      
    double lowest = arr[0];
      
    for(double num: arr) {
      
    if(num < lowest) { lowest = num; }
   
    }
    
    double sum = 0;
    
    int index = 0;
    
    for(double num: arr) {
      
      if( index != 0 && num == lowest) { sum += num; }
      
      if(num != lowest) { sum += num; }
      
      index += 1;
    
    }
    
    return sum / (arr.length - 1);
  
  }
   ```
The fix was adding ```int index = 0;``` to keep track of the index to make sure the initial lowest number isn't added again if all the numbers are the same. It is used in the also added line ```if( index != 0 && num == lowest) { sum += num; }``` which makes sure that if all the numbers are the same, then it will still add the other numbers, but not the first index, as it would be considered the lowest. 

Part 3

Something that I have learned from these past 2 labs is how to set up a server in order to view my code through a website format. It is very interesting to me and I didn't know it was possible to simply set up a local server using VS Code. I thought the process would be a lot more complicated, and in a way ti really is as we were not the ones who wrote the Server.java file which actually does look a little complicated, but this is at least a step toward the right direction. 
