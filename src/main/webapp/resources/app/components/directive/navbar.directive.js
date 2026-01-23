angular.module('studentModule').directive('navbar', function () {
    return {
        restrict: 'E',   // <navbar></navbar>
        template: `
            <nav class="navbar navbar-expand-lg navbar-dark bg-primary px-3">
                <a class="navbar-brand" href="#">Student App</a>

                <div class="collapse navbar-collapse">
                    <ul class="navbar-nav ms-auto">
                        <li class="nav-item">
                            <a class="nav-link" href="#!/home">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#!/students">Students</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#!/about">About</a>
                        </li>
                    </ul>
                </div>
            </nav>
        `,
        replace: true
    };
});
