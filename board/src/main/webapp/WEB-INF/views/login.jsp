<%@ include file="../common/header.jspf" %>
<%@ include file="../common/navigation.jspf" %>

<div class="container">
	<h1>Login</h1>
	<form action="/login.do" method="post">
		Name: <input type="text" name="name" />
		Password: <input type="password" name="password" />
		<input type="submit" value="login"/>
	</form>
	<p>
		<font color="red">${errorMessage }</font>
	</p>
</div>

<%@ include file="../common/footer.jspf" %>


