<%@ include file="includes/header.jspf" %>
<%@ include file="includes/navigation.jspf" %>


<div class="container">
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Description</th>
            <th>Target Date</th>
            <th>Is it Done?</th>
            <th></th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${todos}" var="todo">
            <tr>
                <td>${todo.desc}</td>
                <td><fmt:formatDate value="${todo.targetDate}" pattern="dd-MM-yyyy HH:mm"/></td>
                <td>${todo.done}</td>
                <td><a class="btn btn-success btn-sm" href="/update-todo?id=${todo.id}">Update</a></td>
                <td><a class="btn btn-warning btn-sm" href="/delete-todo?id=${todo.id}">Delete</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <div> <a class="btn btn-primary"  href="/add-todo">Add a Todo</a></div>
</div>
<%@ include file="includes/footer.jspf" %>