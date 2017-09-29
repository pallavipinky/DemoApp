function login_memberData ()
{
	this.m_strLoginId = "";
	this.m_nUserId = -1;
	this.m_oLoginData;
}

var m_oLoginMemberData = new login_memberData ();
var oLoginData = new LoginData(); 

function check()
{
	oLoginData.m_strUserName = $('#login_input_userName').val();
	oLoginData.m_strPassword = $('#login_input_password').val();
	return oLoginData;
	
	/*if(strUserName == '')
	{
			alert("LOGIN FAILURE");
	}
	else
	{
		alert("LOGIN SUCESSS");
	}*/
}

function validate()
{
	m_oLoginMemberData.m_oLoginData = check();
	if(oLoginData.m_strUserName == "" || oLoginData.m_strPassword == "")
		alert("Please enter username and password");
	else
		LoginDataProcessor.get(m_oLoginMemberData.m_oLoginData, login_gotData);
}

function login_gotData (oLoginManagerResponse)
{
	alert("Sucess");
}

function clear()
{
	
}

