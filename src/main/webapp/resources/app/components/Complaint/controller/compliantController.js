angular.module("complaintModule")
.controller("complaintController", function ($scope, studentService) {

    $scope.seecomplains = [];

    $scope.statusOptions = [
        "PROGRESS",
        "RESOLVED",
        "DECLINE"
    ];

    // Load complaints
    $scope.Viewcomplaint = function () {
        studentService.getcommplaint().then(function (res) {
            $scope.seecomplains = res.data;

            // per-row model
            $scope.seecomplains.forEach(function (c) {
                c.updateData = {
                    status: '',
                    adminComment: ''
                };
            });
        });
    };

    $scope.Viewcomplaint();
  $scope.isAdmin = studentService.isAdmin();
    // Update complaint
    $scope.updatecomplaints = function (id, updateData) {

        if (!updateData.status) {
            alert("Please select status");
            return;
        }

        if (updateData.status === 'DECLINE' && !updateData.adminComment) {
            alert("Admin comment required");
            return;
        }

        studentService.UpdateComplaint(id, updateData)
            .then(function () {
                alert("Status updated");
                $scope.Viewcomplaint();
            })
            .catch(function () {
                alert("Update failed");
            });
    };
    
    
    

});
