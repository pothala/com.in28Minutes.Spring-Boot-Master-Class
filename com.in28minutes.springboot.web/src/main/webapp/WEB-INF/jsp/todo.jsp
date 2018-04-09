<%@ include file="includes/header.jspf" %>
<%@ include file="includes/navigation.jspf" %>

<div class="container">
    <div class="jumbotron">
        <form:form method="post" modelAttribute="todo">
            <form:hidden path="id" />
            <div class="form-group">
                <form:input path="desc" type="text" class="form-control" required="required" placeholder="Enter description"/>
                <form:errors path="desc" cssClass="text-warning"/>
            </div>
            <div class="form-group">
                <form:input path="targetDate" type="text" class="form-control" required="required"  width="276"/>
                <form:errors path="targetDate" cssClass="text-warning" />
            </div>
            <button type="submit" class="btn btn-success">Save</button>
        </form:form>
    </div>
</div>
<%@ include file="includes/footer.jspf" %>