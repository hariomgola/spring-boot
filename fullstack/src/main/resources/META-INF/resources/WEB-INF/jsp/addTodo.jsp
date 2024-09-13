<%@ include file="common/header.jsp"%>
<%@ include file="common/navigation.jsp"%>

<div class="container">
	<h4>Enter Todo details</h4>
	<hr>
	<form:form method="post" modelAttribute="todo">

		<!-- Description Field -->
		<fieldset class="mb-3">
			<form:label path="description">Description:</form:label>
			<form:input type="text" name="description" path="description"
				required="required" />
			<br>
			<form:errors path="description" cssClass="text-warning" />
		</fieldset>
		<!-- Description Field -->

		<fieldset class="mb-3">
			<form:label path="targetDate">Target Date:</form:label>
			<form:input type="text" name="targetDate" path="targetDate"
				required="required" />
			<br>
			<form:errors path="targetDate" cssClass="text-warning" />
		</fieldset>

		<form:input type="hidden" path="id" />
		<form:input type="hidden" path="targetDate" />
		<form:input type="hidden" path="done" />
		<input type="submit" class="btn btn-success" />

		<!-- Error Validation -->
	</form:form>
</div>

<%@ include file="common/footer.jsp"%>
<script type="text/javascript">
	$('#targetDate').datepicker({
		format : 'yyyy-mm-dd'
	});
</script>