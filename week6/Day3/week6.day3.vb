POM with Cucumber
-----------------

1)create a project-->pom-cucumber-->add the feature package--->remove the utils package
2)remove the dataprovider in PSM and remove the constructor in all the pages.
3)Go map the teststeps of the feature file with the stepdefinition class and annaotate it.
4)add the runnerclass for exection so copy that and paste in the testcases package,runner extends PSM,and PSM extends AbstractTestngTests

    FOR TestNG-POM:
	1)driver should be static--->sequential exection but not possible for parallel execution.
	2)to have both seq and parallel execution,constructor configuratin is made.
	FOR Cucumber-Pom:
	1)driver should be static-->seq execution
	2)cucumber will not support constructor declaration so parallel execution cannnot be done with that.


	 features ->
	 steps -->pages
	 runner
	 
	 Cucumber config -->driver to be static
					 -->doesnot allow constructor config					 	
						class pages.LoginPage does not have a public zero-argument constructor.
	 Testng Config --doesnot allow static for parallel execution
	 
	 ---------------	 
	 Encapsulation -->make the thread safe-->to hold driver variable

	 Threadlocal implementation-POM:
	 -------------------------------
	 step1:
	 private--->variable can be acceseed within the class.
	 static--->shared among all the instances of the classes.
	 final---->variable once iniyialized it cannot be changed
	 static+final---->constant
	 threadlocal--->thread has its own instance..

	 step2:
	 use the getter and setter methods
	 1)in base class create setDriver method.
	    create get driverMethod and return the value.
		we the intialize the driver in precondition using setDriver

	 2)Replace driver with the getDriver();

