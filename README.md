# Jenkins-Closing-Task

 fursa jenkins closing task
 
 ## About ##
 Maven project that repressent Breaking
News  in : https://www.ynet.co.il

 the mean idea to take Ynet xml(http://www.ynet.co.il/Integration/StoryRss2.xml) , and build a new Java Aplication(Managed by Maven) that Presents the Breaking
News XML in an HTML Table Format.

##RUN Localy##

```
git clone https://github.com/nadeemjazmawe/Jenkins-Closing-Task.git
cd Jenkins-Closing-Task/
./mvnw package
java -jar target/*.jar
```

You can then access petclinic here: http://localhost:8081/

![webpage](https://user-images.githubusercontent.com/44744877/176642904-921fe1c1-2b31-45d1-afb8-23285a30ccb1.png)



## jenkins pipeline job ##

![jenkings](https://user-images.githubusercontent.com/44744877/176642807-7a390391-dfa4-44bd-80e1-21f01e2e86de.png)


After the build finish Jenkins send Slack notification (Build Success/Failed)

![slack](https://user-images.githubusercontent.com/44744877/176642835-773afef2-42df-43af-aaae-b42a5c4c21b8.png)
