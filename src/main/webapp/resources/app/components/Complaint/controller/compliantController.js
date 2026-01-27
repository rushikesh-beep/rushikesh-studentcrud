angular.module("complaintModule")
.controller("complaintController", function($scope, $location, studentService) {
   	$scope.seecomplains = [];
$scope.updatestatus={};
 $scope.statusOptions = [
        
        "IN PROGRESS",
        "RESOLVED",
        "DECLINE"
    ];
 $scope.Viewcomplaint=function()
		 	 {
		 		studentService.getcommplaint().then(function(res){
		 			
					$scope.seecomplains=res.data;
		 			
		 		})
		 	 }
 
$scope.Viewcomplaint();
$scope.updatecomplaints=function(id)
{

studentService.UpdateComplaint(id, $scope.updatestatus)
    .then(function (res) {
    
        console.log("Complaint updated successfully", res.data);

        // optional: show message
        alert("Status updated");

        // optional: reload list
        // loadComplaints();
    })
    .catch(function (err) {
        console.error("Error updating complaint", err);
        alert("Update failed");
    });

}

});
