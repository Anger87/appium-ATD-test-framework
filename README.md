# Automation for Autodoc mobile app (Java, TestNG, Selenium WebDriver, Appium)

Test assignment:
Using Appium, Java and TestNG: Automate the process of add, edit, delete car on Autodoc mobile app on Android device
Solution: 

Tested on Xiaomi Redmi 4 with Android 6.0.
Appium version 1.7.2 or above.
Installed Android SDK and properly set PATH are required. 
Also you should set emulator or device cabalilities files in \src\test\resources\props
User credentials set in \src\test\resources\props\user.properties

To run test from IDE, use testng.xml configuration file. 
To run test from command line, use 'mvn test -DcapabilityPropperties=emulatorCapability.properties' command.
Check logs: mavenTestRunLog.txt