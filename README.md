# An Example of STOMP

Project created to learn the STOMP technology. To start the project visit [https://start.spring.io/](https://start.spring.io/) and make the following selections:
 * Project: Maven.
 * Languaje: Java.
 * Spring Boot: 3.0.1.
 * Project Metadata:
     * Group: com.stomp.example
     * Artifact: demo
     * Name: demo
     * Package name: com.stomp.example.demo
 * Packaging: jar.
 * Java: 8.
 * Dependencies: 
     * WebSocket
     * SpringWeb
 
Follow this link to use the above setting automatically: [Sprint Initializr Customized](https://start.spring.io/#!type=maven-project&language=java&platformVersion=3.0.1&packaging=jar&jvmVersion=1.8&groupId=com.stomp.example&artifactId=demo&name=demo&description=Demo%20project%20for%20Stomp&packageName=com.stomp.example.demo&dependencies=websocket,web)

Study the code along with the following videos and reference #3:
1. [Websocket push messages with Spring Boot - STOMP - Part 1](https://www.youtube.com/watch?v=XY5CUuE6VOk&ab_channel=LiliumCode)
2. [Websocket push messages with Spring Boot - STOMP - Part 2](https://www.youtube.com/watch?v=dFwBJKwkxZE&ab_channel=LiliumCode)

Additional sample source code can be found at [liliumbosniacum GitHub](https://github.com/liliumbosniacum/websocket)

## Configure Eclipse for Git

Setup a development token extracted from [1,2]
Creating a personal access token
1. In the upper-right corner of any page, click your profile photo, then click Settings.
2. In the left sidebar, click Developer settings.
3. In the left sidebar, click Personal access tokens.
4. Click Generate new token.
5. Give your token a descriptive name.
6. To give your token an expiration, select the Expiration drop-down menu, then click a default or use the calendar picker.
7. Select the scopes you'd like to grant this token. To use your token to access repositories from the command line, select repo. A token with no assigned scopes can only access public information. For more information, see "Available scopes".
8. Click Generate token.

## Execution Environment Considerations
This project requires the web browser to load JavaScript code. If there is any browser extension that disables them, please make sure to configure that extension to allow it load the JavaScript code.

## Execute Test

1. To compile, make right click on "pom.xml", then "Run as -> Maven Build...". In the execution dialog that shows up set Goals to "clean package".
1. To execute, make right click on "pom.xml", then "Run as -> Maven Build...". In the execution dialog that shows up set Goals to "spring-boot:run".

# References

1. Suresh SDET Automation, [How to Push Eclipse Project into GitHub | Eclipse + Git errors not authorized](https://www.youtube.com/watch?v=gO20QGT6aW8&ab_channel=SureshSDETAutomation), YouTube, accessed on 2022/01/08
2. GitHub Docs, [Creating a personal access token](https://docs.github.com/en/enterprise-server@3.4/authentication/keeping-your-account-and-data-secure/creating-a-personal-access-token), GitHub, accessed on 2022/01/08
3. Spring, [Using WebSocket to build an interactive web application](https://spring.io/guides/gs/messaging-stomp-websocket/), Spring, accessed on 2022/01/08