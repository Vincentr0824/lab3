# Lab Report 2

For this lab report, I had changed the code that we were previously given to run a server in order for it to keep track of strings instead.
![Image](Screen Shot 2023-04-24 at 9.30.47 PM.png)
The image above is the previously used NumberServers.java file, but with drastic changes to the Handler class.

![Image](Screen Shot 2023-04-24 at 9.34.20 PM.png)
This is a screenshot of the Server.java code that was used. This code was untouched. There are a few imports not shown above the screenshot of the code as they weren't able to fit in the image.

![Image](Screen Shot 2023-04-24 at 9.27.29 PM.png)
This is the first screenshot of using "/add-message" in the URL. No methods from Server.java are used as those methods are involved with the actual creation of the server. The ```handleRequest``` method is being used here. The method splits the URL where there is an "=" if the URL contains "/add". It then takes the string that comes after the "=" and adds it onto the currently empty string which is returned. 

![Image](Screen Shot 2023-04-24 at 9.27.42 PM.png)
This is the second screenshot of using "/add-message" in the URL. No methods are also used from the Server.java file here. The same exact ```handleRequest``` method is being used here. The only difference is that instead of an empty string being added to, the string is no longer empty and still contains the text that was previously returned. Therefore, it returns the previously returned string and the new string added on through "/add-message"
