	angular.module("studentModule")
	.service("studentService", function ($http,$window) {
	
	    var baseUrl = "/student-api";
		
		
		this.getStudents = function () {
		    var token = $window.sessionStorage.getItem("jwtToken"); // match storeToken
		    if (!token) {
		        console.error("JWT token missing in sessionStorage");
		        return;
		    }
	
		    return $http.get(baseUrl + "/user/getstudent", {
		        headers: { Authorization: "Bearer " + token }
		    });
		};
	
		this.updatestudent=function(student){
			var token = $window.sessionStorage.getItem("jwtToken"); // match storeToken
				    if (!token) {
				        console.error("JWT token missing in sessionStorage");
				        return;
				    }
	
			return $http.put(baseUrl +"/user/update/"+ student.id,student,{ headers: { Authorization: "Bearer " + token }})
		}
		
		this.insertStudent = function (student) {
		      return $http.post(baseUrl + "/auth/register", student);
		  };
	
		  this.DeleteStudent = function(id) {
			var token = $window.sessionStorage.getItem("jwtToken"); // match storeToken
		      return $http.delete(baseUrl + "/user/delete/" + id,{ headers: { Authorization: "Bearer " + token }});
		  };
		     
	this.loginStudent=function(user)
	{
		return $http.post(baseUrl + "/auth/login",user)
	}
	
	 //StoreToken**
	 
	this.storeToken = function(token) {
	       $window.sessionStorage.setItem("jwtToken", token);
	   };
	   
	   this.isAdmin = function () {
	       var token = $window.sessionStorage.getItem("jwtToken");
	       if (!token) return false;
	
	       var payload = JSON.parse(atob(token.split(".")[1]));
	       return payload.role === "ROLE_ADMIN";
	   };
	
	   this.getRole = function () {	
	       var token = sessionStorage.getItem("jwtToken");
	       if (!token) return null;
	
	       var payload = JSON.parse(atob(token.split(".")[1]));
	       return payload.role; // ROLE_ADMIN / ROLE_USER
	   };
	
	   
	   this.AdminRegister=function(Admin){
		return $http.post(baseUrl +"/auth/register-admin",Admin)
	   }
	   
	   
	   this.viewProfiles=function(id)
	   {
		return $http.get(baseUrl +"/auth/getbyid/"+id)
	   } 
	   
	   
	   var token = localStorage.getItem('token');
	      if (token) {
	          var decoded = jwt_decode(token);  // jwt_decode comes from the library
	          var userId = decoded.id;           // assuming your JWT has 'id' claim
	          console.log("User ID:", userId);
	      }
		  
		  
		  this.getUserId=function()
		  {
						var token = $window.sessionStorage.getItem("jwtToken"); // match storeToken
						if(!token){return null}
						var decoded = jwt_decode(token);
						       return decoded.id;
		  }
		
		  this.logout = function() {
		         $window.sessionStorage.removeItem('jwtToken');
		     };    
			 
			 this.complaints = function(complaint){
			  	var token = $window.sessionStorage.getItem("jwtToken"); // match storeTokenx	
			     return $http.post(baseUrl + "/complaintbox/complaint", complaint, {
			         headers: {
			             'Authorization': 'Bearer ' + token,
			             'Content-Type': 'application/json'
			         }
			     });
			 }
			 this.getcommplaint = function() {
			     var token = $window.sessionStorage.getItem("jwtToken");
			     return $http.get(baseUrl + "/complaintbox/getcomplaint", {
			         headers: {
			             'Authorization': 'Bearer ' + token,
			             'Content-Type': 'application/json'
			         }
			     });
			 };
			 this.UpdateComplaint = function (id, complaintvalue) {
			     var token = $window.sessionStorage.getItem("jwtToken");
			     return $http.put(
			         baseUrl + "/complaintbox/updatestatus/" + id,
			         complaintvalue, // this is the data being sent
			         {
			             headers: {
			                 'Authorization': 'Bearer ' + token,
			                 'Content-Type': 'application/json'
			             }
			         }
			     );
			 };

this.deleteComplaint=function(id)
{
	return $http.delete(baseUrl+"/complaintbox/delete"+id)
}
		 
			 
			 
	});
