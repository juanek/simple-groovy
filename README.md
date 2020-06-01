**simple-groovy**

Maven Groovy and Java integration project

##### Excecute the java main class.
 mvn -q exec:java
 
 or
 
 mvn -q exec:java -DmainClass="ar.com.jekipes.app.Main"
 
 ##### Excecute the groovy class.
 
 mvn -q exec:java -DmainClass="ar.com.jekipes.app.Util"
 
 
  ##### Excecute the java test class.
  
  mvn -Dtest=ar.com.jekipes.app.MainTest test

  
  ##### Excecute the groovy test class.
 
 mvn -Dtest=ar.com.jekipes.app.UtilTest test
