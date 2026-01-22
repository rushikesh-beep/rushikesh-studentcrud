angular.module("homeModule")
.controller("HomeController", function ($scope, $location) {
    $scope.goStudent = function () {
        $location.path("/student");
    };
});
