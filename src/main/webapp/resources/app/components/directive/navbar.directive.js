angular.module('studentModule').directive('navbar', function () {
    return {
        restrict: 'E',   // <navbar></navbar>
        template: `
            <nav class="navbar navbar-expand-lg navbar-dark px-3">
			<nav class="navbar navbar-expand-lg navbar-light bg-light">
			  <div class="container-fluid">
			    <a class="navbar-brand" href="#">Navbar</a>
			    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
			      <span class="navbar-toggler-icon"></span>
			    </button>
			    <div class="collapse navbar-collapse" id="navbarNavDropdown">
			      <ul class="navbar-nav">
			        <li class="nav-item">
			          <a class="nav-link active" aria-current="page" href="#">Home</a>
			        </li>
			        <li class="nav-item">
			          <a class="nav-link" href="#">Features</a>
			        </li>
			        <li class="nav-item">
			          <a class="nav-link" href="#">Pricing</a>
			        </li>
					
					<li class="nav-item">
					<a class="nav-link" href="#!/complaint">View Complaint</a>

								        </li>
			        <li class="nav-item dropdown">
			          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false">
			            Compliant Box
			          </a>
			          <ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
			            <li><a class="dropdown-item" data-bs-toggle="modal" data-bs-target="#exampleModal22">Add Complaint</a></li>
			            <li><a class="dropdown-item" href="#">Another action</a></li>
			            <li><a class="dropdown-item" href="#">Something else here</a></li>
			          </ul>
			        </li>
			      </ul>
			    </div>
			  </div>
			</nav>
            </nav>
        `,
        replace: true
    };
});
