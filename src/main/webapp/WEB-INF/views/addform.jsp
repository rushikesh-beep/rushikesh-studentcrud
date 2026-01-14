<html>
	<head>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
			          rel="stylesheet"></head>
					  <body> 
						
						<div class="card" style="width: 18rem;">
						  <div class="card-body">
						    <h5 class="card-title">Registration Form</h5>
							<form action="${pageContext.request.contextPath}/savestudent"method="post">
							  <div class="mb-3">
							    <label for="text" class="form-label">Name</label>
							    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"  name="name"   value="${student.name}">
							   
							  </div>
							  <div class="mb-3">
							  						    <label for="exampleInputEmail1" class="form-label">City</label>
							  						    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"  name="cit"   value="${student.cit}">
							  						   
							  						  </div>
													  <div class="mb-3">
													  						    <label for="exampleInputEmail1" class="form-label">Course</label>
													  						    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"   name="course"  value="${student.course}">
													  						   
													  						  </div>
							  <div class="mb-3">
							    <label for="exampleInputPassword1" class="form-label">Fees</label>
							    <input type="text" class="form-control" id="exampleInputPassword1"   name="fees"    value="${student.fees}">
							  </div>
							  <div class="mb-3 form-check">
							    
							  
							  </div>
							  <button type="submit" class="btn btn-primary">Submit</button>
							</form>
						  </div>
						</div>
						
						
					  </body>
					  </html>