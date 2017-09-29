package demo.servlets;

import java.io.File;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

//import org.apache.log4j.PropertyConfigurator;

public class AutoSetDemoPropertiesServlet extends HttpServlet
{
private static final long serialVersionUID = 1L;
	
	public void init (ServletConfig oServletConfig) throws ServletException
	{
		super.init(oServletConfig);
		try 
		{
			String strContextPath = oServletConfig.getServletContext().getRealPath("/WEB-INF/");
			//PropertyConfigurator.configure (strContextPath + File.separator+"log4jDemo.properties");
			System.out.println ("AutoSetDemoPropertiesServlet : strContextPath : " + strContextPath + File.separator + "log4jDemo.properties");
		} 
		catch (Exception oException) 
		{
			System.out.println ("AutoSetDemoPropertiesServlet : init : " +oException.toString());
		}
	}
}


