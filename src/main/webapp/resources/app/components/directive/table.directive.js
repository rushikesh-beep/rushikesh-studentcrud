angular.module("studentModule")
.directive("studentTable", function () {
    return {
        restrict: "E",   // use as <student-table>
        scope: {
            students: "=",
            isAdmin: "=",
            editStudent: "&",
            deleteStudent: "&",
            viewstudent: "&"
        },
        template: `
        <table class="table table-bordered table-striped table-hover">
            <thead class="table-dark">
                <tr>
                    <th>Name</th>
                    <th>City</th>
                    <th>Course</th>
                    <th>Fees</th>

                    <th ng-if="isAdmin">Edit</th>
                    <th ng-if="isAdmin">Delete</th>
                    <th ng-if="isAdmin">View Profile</th>
                </tr>
            </thead>

            <tbody>
                <tr ng-repeat="s in students">
                    <td>{{s.name}}</td>
                    <td>{{s.city}}</td>
                    <td>{{s.course}}</td>
                    <td>{{s.fees}}</td>

                    <td ng-if="isAdmin">
                        <button class="btn btn-warning btn-sm"
                                ng-click="editStudent({s:s})"
                                data-bs-toggle="modal"
                                data-bs-target="#editModal">
                            Edit
                        </button>
                    </td>

                    <td ng-if="isAdmin">
                        <button class="btn btn-danger btn-sm"
                                ng-click="deleteStudent({id:s.id})">
                            Delete
                        </button>
                    </td>

                    <td ng-if="isAdmin">
                        <button class="btn btn-primary btn-sm"
                                data-bs-toggle="offcanvas"
                                data-bs-target="#offcanvasRight"
                                ng-click="viewstudent({s:s})">
                            View Profile
                        </button>
                    </td>
                </tr>
            </tbody>
        </table>
        `
    };
});
