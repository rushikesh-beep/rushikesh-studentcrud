<!DOCTYPE html>
<html ng-app="myApp">
<head>
    <title>Home Test</title>

    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.8.2/angular.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.8.2/angular-route.min.js"></script>

    <!-- CORE -->
    <script src="resources/app/app.js"></script>
    <script src="resources/app/router/router.js"></script>

    <!-- HOME ONLY -->
    <script src="resources/app/components/homeComponent/home.module.js"></script>
    <script src="resources/app/components/homeComponent/controllers/homeController.js"></script>
	
	<!-- Student component -->
	<script src="resources/app/components/studentComponent/student.module.js"></script>
	<script src="resources/app/components/studentComponent/controller/studentController.js"></script>
	
	
	
	<script src="resources/app/service/studentService.js"></script>


</head>

<body>
    <div ng-view></div>
</body>
</html>
