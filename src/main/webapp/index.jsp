<!DOCTYPE html>
<html ng-app="myApp">
<head>
    <title>Home Test</title>

	    <!-- BOOTSTRAP -->
	    <link rel="stylesheet"
	          href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css">

	    <!-- YOUR CSS -->
	    <link rel="stylesheet"
	          href="resources/app/components/Css/student.css">
			  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

	    <!-- ANGULAR -->
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
	
	<script src="resources/app/components/Complaint/complaint.module.js"></script>
	<script src="resources/app/components/Complaint/controller/compliantController.js"></script>


	
	
	
	<script src="https://cdn.jsdelivr.net/npm/jwt-decode/build/jwt-decode.min.js"></script>
	
	<script src="resources/app/service/studentService.js"></script>
	<!-- Bootstrap Icons CDN -->
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
	<!-- Add this in index.jsp after other component scripts -->
	<script src="resources/app/components/directive/navbar.directive.js"></script>
	<script src="resources/app/components/directive/table.directive.js"></script>



</head>

<body>
    <div ng-view></div>
</body>
</html>
