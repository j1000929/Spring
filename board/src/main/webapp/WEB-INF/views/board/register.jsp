
<%@page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>
<h1>게시물 등록</h1>

<form method="post">
	<div class="box-body">
		<div class="form-group">
		<label for="">Title</label>
		<input type="text" name="title" class="form-control" placeholder="Enter Title" />
		</div>

	
		<div class="form-group">
		<label for="">Content</label>
		<textarea name="content" rows="3" class="form-control" placeholder="Enter..." /></textarea>
		</div>
		
		<div class="form-group">
		<label for="">Writer</label>
		<input type="text" name="writer" class="form-control" placeholder="Enter Writer" />
		</div>
		
		<div class="form-group">
		<button type="submit" class="btn btn-primary">Submit</button>
		</div>
	</div>	
</form>

<%@ include file="../common/footer.jspf"%>


