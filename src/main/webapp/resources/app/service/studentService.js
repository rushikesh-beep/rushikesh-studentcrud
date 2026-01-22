angular.module("studentModule")
.service("studentService", function ($http) {

    var baseUrl = "/Springmvc_Mongo";

	this.getStudents = function () {
	    return $http.get(baseUrl + "/user/getstudent");
	};
	this.updatestudent=function(student){
		return $http.put(baseUrl +"/user/update/"+ student.id,student)
	}
	
	this.insertStudent=function(student)
	{
		return $http.post(baseUrl + "/auth/register"+student)
	}
	
	
});
