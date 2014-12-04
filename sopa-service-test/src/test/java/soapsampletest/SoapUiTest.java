package soapsampletest;

import org.junit.Test;

import com.eviware.soapui.tools.SoapUITestCaseRunner;

public class SoapUiTest {
	
	@Test
	public void testRunner() throws Exception 
	{
	  SoapUITestCaseRunner runner = new SoapUITestCaseRunner(); 
	  runner.setProjectFile( "src/dist/sample-soapui-project.xml" );
	  runner.run(); 
	}
}
