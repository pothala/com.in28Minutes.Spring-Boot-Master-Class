<%@ include file="includes/header.jspf" %>
<%@ include file="includes/navigation.jspf" %>

<div class="container">
    <div class="jumbotron">
        <h2>First Web Application</h2>
        <font color="red">${errorMessage}</font>
        <form method="post" class="form-horizontal">
            <div class="form-group">
                <input type="text" class="form-control" name="name"  placeholder="Enter login"/>
            </div>
            <div class="form-group">
                <input type="password"  class="form-control" name="password" placeholder="Enter password"/>
            </div>
            <button type="submit" class="btn btn-primary">Login</button>
        </form>
    </div>
</div>
<%@ include file="includes/footer.jspf" %>