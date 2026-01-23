angular.module("homeModule")
.controller("HomeController", function ($scope, $location,$scope, studentService) {
	
	
    $scope.goStudent = function () {
        $location.path("/student");
    };
	$scope.user = {}; 
	
	$scope.login=function()
	  {
		studentService.loginStudent($scope.user).then(function(response)
		
	{
		$location.path("/student");
		alert("Login successfully");
		var token=response.data.token;
		studentService.storeToken(token);
		console(token);
	})
	
	

	  }
	
});
