## TEST AUTOMATION EXAMPLE WITH CUCUMBER SELENIUM AND JAVA
- This is a gradle project that uses Cucumber, Selenium, JUnit, POM and Java to automate a web page.

#### PREREQUISITES:
* Java SDK - 1.8
* Chrome Version 80.0.3987.149 (Official Build) (64-bit) if you are on **Linux**
* Chrome Versión 83.0.4103.61 (Build oficial) (64 bits) if you are on **Mac**

#### GETTING STARTED
1) Clone the project to a folder on your computer: `git clone git@github.com:LerryAlexander/cucumber-selenium-java-example.git` 
2) Open a new Terminal and from inside `cucumber-selenium-java-example/` root folder run these commands: 
  - On Linux
    - `chmod +x gradlew`
    - `chmod +x src/test/resources/chromedriver_linux/chromedriver`
    - `export PATH=$PATH:$(pwd)/src/test/resources/chromedriver_linux/chromedriver`
  - On Mac
    - `chmod +x gradlew`
    - `chmod +x src/test/resources/chromedriver_mac/chromedriver`
    - `export PATH=$PATH:$(pwd)/src/test/resources/chromedriver_mac/chromedriver`
    
#### RUNNING TESTS
- On Linux:
  - `./gradlew test -Dos=linux`
- On Mac:
  - `./gradlew test -Dos=osx`

#### SEE CUCUMBER TEST REPORT:
- Once the test execution has finished go to the folder `target/cucumberOptions` and open the file `index.html` 
