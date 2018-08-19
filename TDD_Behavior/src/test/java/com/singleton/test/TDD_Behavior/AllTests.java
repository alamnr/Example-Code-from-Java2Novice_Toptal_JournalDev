package com.singleton.test.TDD_Behavior;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AppTest.class, ParameterizedTestFields.class, ParameterizedTestUsingConstructor.class,
		SingletonTest.class })
public class AllTests {

}
