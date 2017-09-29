package demo.logindata;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class LoginDataProcessor 
{
		private static EntityManager em;
	//	Logger m_oLogger = Logger.getLogger (LoginDataProcessor.class);
		@ResponseBody
		@RequestMapping(value="/loginManagerGet", method = RequestMethod.POST, headers = {"Content-type=application/json;charset=utf-8"})
		public LoginManagerResponse get (@RequestBody LoginData oData)
		{
			LoginManagerResponse oLoginManagerResponse = getData(oData);
			return oLoginManagerResponse;
		}
		public LoginManagerResponse getData(LoginData oData)
		{
			/*m_oLogger.info("getData");
			m_oLogger.debug("LoginData - oData.m_strUserName [IN] : " + oData.m_strUserName);*/
			boolean b_userexists = check_username_exists(oData.getM_strUserName());
			LoginManagerResponse oLoginManagerResponse = new LoginManagerResponse ();
			oLoginManagerResponse.m_strUser = oData.getM_strUserName();
			oLoginManagerResponse.m_strPassWord = oData.getM_strPassword();
			try
			{
				if(oData.getM_strUserName().startsWith("a"))
				{
					EntityManagerFactory emf = Persistence
			                .createEntityManagerFactory("Login");
			        em = emf.createEntityManager();
			        em.getTransaction().begin();
			        em.persist(oData);
			        em.getTransaction().commit();
					/*oLoginManagerResponse.m_strUser = oData.m_strUserName;
					oLoginManagerResponse.m_strPassWord = oData.m_strPassword;*/
				}
					
			}
			catch (Exception oException) 
			{
			//	m_oLogger.debug("LoginData - oException [IN] : " + oException.toString());
			} 
			return oLoginManagerResponse;
		}
		private boolean check_username_exists(String m_strUserName)
		{
			return false;
		}
}

