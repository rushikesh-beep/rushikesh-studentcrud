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
        .otherwise({
            redirectTo: "/home"
        });
});
