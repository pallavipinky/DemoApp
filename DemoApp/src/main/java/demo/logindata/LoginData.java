package demo.logindata;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMP_DB")
public class LoginData
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int m_nUserId;
	
	@Column(name = "username")
	private String m_strUserName;
	
	@Column(name = "password")
	private String m_strPassword;
	
	public LoginData ()
	{
		m_nUserId = -1;
		m_strUserName = "";
		m_strPassword = "";
	}

	public String getM_strUserName() 
	{
		return m_strUserName;
	}

	public void setM_strUserName(String m_strUserName) 
	{
		this.m_strUserName = m_strUserName;
	}

	public String getM_strPassword() 
	{
		return m_strPassword;
	}

	public void setM_strPassword(String m_strPassword) 
	{
		this.m_strPassword = m_strPassword;
	}
	
	public int getM_nUserId() 
	{
		return m_nUserId;
	}

	public void setM_nUserId(int m_nUserId) 
	{
		this.m_nUserId = m_nUserId;
	}
}
