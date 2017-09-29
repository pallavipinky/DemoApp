var LoginDataProcessor = (function __LoginDataProcessor ()
{
	function get(oData,callback)
	{
		$.ajax({
			type: "POST",
			url: "http://localhost:8080/DemoApp" +"/loginManagerGet",
		    data: JSON.stringify(oData),
		    contentType: "application/json;charset=utf-8",
		    timeout : 100000,
		    Accept: "application/json",
		    asyc: false,
		    success: function(oResponse)
		    {
		    	fn = eval(callback);
				fn(oResponse);
		    },
		    error: function(response)
		    {
		        console.log(response.status + " " + response.statusText);
		    }
		   });
		}
		
	return { 
		get : get
	};
})();
