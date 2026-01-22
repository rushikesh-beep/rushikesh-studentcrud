angular.module("studentModule")
.controller("studentController", function ($scope, studentService) {

    $scope.students = [];
    $scope.selectedStudent = {};

	$scope.student = {}; 

    function loadStudents() {
        studentService.getStudents().then(function (res) {
            $scope.students = res.data;
        });
    }

    loadStudents();

    // CLICK EDIT
    $scope.editStudent = function (student) {
        // copy prevents instant update in table
        $scope.selectedStudent = angular.copy(student);
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

	

});
