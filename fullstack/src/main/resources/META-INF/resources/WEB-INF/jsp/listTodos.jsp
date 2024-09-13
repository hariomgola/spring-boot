<%@ include file="common/header.jsp"%>
<%@ include file="common/navigation.jsp"%>

<div class="container">
	<h4>Welcome ${name}</h4>
	<hr>
	<!-- <div>Todos Here ${todos}</div> -->
	<!-- Table Iteration -->
	<table class="table">
		<thead>
			<tr>
				<th>ID</th>
				<th>Description</th>
				<th>Target Date</th>
				<th>Completion Status</th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${todos}" var="todo">
				<tr>
					<td>${todo.id}</td>
					<td>${todo.description}</td>
					<td>${todo.targetDate}</td>
					<td>${todo.done}</td>
					<td><a href="updateTodo?id=${todo.id}"
						class="btn btn-Secondary">Update</a></td>
					<td><a href="deleteTodo?id=${todo.id}" class="btn btn-primary">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="addTodo" class="btn btn-success">Add Todo</a>
</div>

<%@ include file="common/footer.jsp"%>