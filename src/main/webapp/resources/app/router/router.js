angular.module("myApp")
.config(function ($routeProvider) {

    $routeProvider
        .when("/home", {
            templateUrl: "resources/app/components/homeComponent/partials/home.html",
            controller: "HomeController"
        })
		.when("/student", {
		            templateUrl: "resources/app/components/studentComponent/partials/student.html",
		            controller: "studentController"
		        })
				.when("/complaint", {
						            templateUrl: "resources/app/components/Complaint/partials/complaint.html",
						            controller: "complaintController"
						        })
				
				
				
        .otherwise({
            redirectTo: "/home"
        });
});
