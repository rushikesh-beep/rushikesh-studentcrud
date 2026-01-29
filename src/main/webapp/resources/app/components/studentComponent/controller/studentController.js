angular.module("studentModule")
.controller("studentController", function ($scope, studentService,$location) {

    $scope.students = [];
$scope.seecomplains=[]
    $scope.selectedStudent = {};
	var role = studentService.getRole();
	$scope.student = {}; 
	$scope.user = {}; 
	$scope.Admin={};
	$scope.viewProfile = {};
	$scope.profile = {};
	
	$scope.complaint={};
	 $scope.userid= studentService.getUserId()
	  console.log("Logged-in user ID:",  $scope.userid);
	
    function loadStudents() {
        studentService.getStudents().then(function (res) {
			if (role === "ROLE_ADMIN") {
			     
			          $scope.students = res.data;
			      } else {
			       
			          $scope.students = res.data.filter(function (s) {
			              return s.role === "ROLE_USER";
			          });
			      }
        });
    }

    loadStudents();

    // CLICK EDIT
    $scope.editStudent = function (student) {
        // copy prevents instant update in table
        $scope.selectedStudent = angular.copy(student);
    };
	$scope.viewstudent = function (student) {
	      // copy prevents instant update in table
	      $scope.viewProfile = angular.copy(student);
	  };

   
    $scope.updateStudent = function () {

        if (!$scope.selectedStudent.id) {
            alert("ID missing");
            return;
        }

        studentService.updatestudent($scope.selectedStudent)
            .then(function () {
                alert("Student updated successfully");
                loadStudents();
                $scope.selectedStudent = {};
            })
            .catch(function () {
                alert("Update failed");
            });
    };
	
	// save student
	  $scope.saveStudent = function () {
	      studentService.insertStudent($scope.student).then(function () {
	          alert("Student saved successfully");
	          $scope.student = {}; // clear form
	          $scope.loadStudents();
	      });
	  };
	  $scope.deleteStudent = function(id) {
	      if (confirm("Are you sure you want to delete this student?")) {

	          studentService.DeleteStudent(id)
	              .then(function() {
	                  alert("Student deleted successfully");
	                  $scope.loadStudents();  // refresh table
	              });

	          $scope.loadStudents(); 
	      }
	  };


	  $scope.isAdmin = studentService.isAdmin();
	  

	  $scope.AdminLogin=function()
	  {
	  studentService.AdminRegister($scope.Admin).then(function(){
	  	
	  	$scope.loadStudents();
	  	
	  })
	  }
	  $scope.visitPfofile=function()
	  {
		studentService.viewProfiles($scope.userid).then(function(res){
			
			$scope.profile=res.data;
			
		})
	  }
	  
	  
	  $scope.visitPfofile()
	  
	  $scope.logout = function() {
	         studentService.logout();
	         alert("Logged out successfully!");
			 $location.path("/home");
	     };
	  
		 $scope.addcomplaint=function()
		 { $scope.complaint.userId=$scope.userid;
			studentService.complaints($scope.complaint).then(function(){
				
				
				
			})
		 }
	
		
			
			
			
			$scope.ViewComplaintById=function()
			  {
				studentService.UserComplaint($scope.userid).then(function(res){
					
					$scope.seecomplains=res.data;
					
				})
			  }
			  
			  $scope.ViewComplaintById();

});
