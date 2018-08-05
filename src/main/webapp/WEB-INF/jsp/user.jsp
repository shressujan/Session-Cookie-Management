<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <title>HTML5 Doctor | Element Index</title>
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css" />
  </head>
  <body id="user">
  <div class="container">
    <ul class="list-group">
      <c:forEach items="${userList}" var="user">
        <li class="list-group-item">${user}</li>
      </c:forEach>
    </ul>
    <button type="button" onclick="history.back()" class="btn btn-primary btn-lg">Back</button>
  </div>
  </body>
</html>