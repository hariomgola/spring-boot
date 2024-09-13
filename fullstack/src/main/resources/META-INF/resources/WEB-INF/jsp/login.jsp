<%@ include file="common/header.jsp"%>

<div class="container">
	<h1>Welcome to the Login Page</h1>
	<pre>${loginError}</pre>
	<form method="post">
		<div data-mdb-input-init class="form-outline mb-4">
			Username: <input type="text" name="name" class="form-control">
		</div>
		<div>
			Password:<input type="password" name="password" class="form-control">
		</div>
		<br> <input class="btn btn-primary" type="Submit" value="Login">
	</form>
</div>

<%@ include file="common/footer.jsp"%>