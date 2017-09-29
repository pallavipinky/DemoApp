function demo_MemberData ()
{
	var m_nUserId = -1;
	var m_nUID = -1;
	var m_nSelectedClientId = -1;
	var m_strLoginId = "";
	var m_nOnlineUserId = -1;
	var m_arrObjects = [];
}

var m_oDemoMemberData = new demo_MemberData ();

var demo_includeDataObjects = 
[
	'login/widget/usermanagement/UserInformation/UserInformationData.js'
];

includeDataObjects (demo_includeDataObjects, "");

function includeDataObjects (arrObjects, callBack)
{
	m_oDemoMemberData.m_arrObjects = arrObjects;
	m_oDemoMemberData.m_nIncludeIndex = 0;
	m_oDemoMemberData.m_strIncludeCallback = callBack;
	navigate ('', arrObjects[0]);
}

function dataObjectLoaded ()
{
	m_oDemoMemberData.m_nIncludeIndex++;
	if (m_oDemoMemberData.m_nIncludeIndex >= m_oDemoMemberData.m_arrObjects.length)
		eval (m_oDemoMemberData.m_strIncludeCallback);
	else
		navigate ('', m_oDemoMemberData.m_arrObjects[m_oDemoMemberData.m_nIncludeIndex]);
}

function navigate (tabName, pageName)
{
	loadWidget(pageName);
}

function loadWidget(widgetName)
{
	var oScript = document.createElement('script')
	oScript.setAttribute("type","text/javascript")
	oScript.setAttribute("LANGUAGE","javascript")
	oScript.setAttribute("src", widgetName)
	document.getElementsByTagName("head")[0].appendChild(oScript)
}
