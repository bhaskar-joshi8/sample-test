Author: Bhaskar

Assignment: To setup selenium based automation framework with respect to shared code.

Issue: I tried to import shared code it gave me error-> Problems were encountered during import:
  Could not read from source when writing file 'D:\POC\qa-test-assessment-master\qa-test-assessment-master\.metadata\.lock'
  The process cannot access the file because another process has locked a portion of the file

  
Solution: Created new seperate basic project 

	Steps Done:
		1. Create new Maven Project in Eclipse.
		2. Added require dependencies in pom.xml file.
			a. selenium-java
			b. cucumber-java
			c. cucumber-core
			d. cucumber-junit
			e. junit
			f. rest-assured
			g. json-path
			h. testng
		3. In src/test/resources, create feature folder which will have all feature files and created a poctest.feature file.
		4. In src/test/java, create stepDefinition package which include Steps.java file for step definition glue code.
		5. In src/test/java, create testrunners package which include runner.java file for running feature file code as JUnit.
