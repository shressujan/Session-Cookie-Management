<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8" />
  <title>HTML5 Doctor | Element Index</title>
  <link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css" />
</head>
<body id="cookieDemo">
  <form method="post">
    <div class="container">
      <div class="form-row">
        <div class="form-group col-md-6">
          <label for="inputEmail">Email</label>
          <input type="email" id="inputEmail" class="form-control" name="email" placeholder="${email}">
        </div>
        <div class="form-group col-md-6">
          <label for="inputPassword4">Password</label>
          <input type="password" name="password" class="form-control" id="inputPassword4" placeholder="Password">
        </div>
      </div>
      <div class="form-group">
        <label for="inputAddress">Address</label>
        <input type="text" name="address1" class="form-control" id="inputAddress" placeholder="${address1}">
      </div>
      <div class="form-group">
        <label for="inputAddress2">Address 2</label>
        <input type="text" name="address2" class="form-control" id="inputAddress2" placeholder="${address2}">
      </div>
      <div class="form-row">
        <div class="form-group col-md-6">
          <label for="inputCity">City</label>
          <input type="text" name="city" class="form-control" id="inputCity" placeholder="${city}">
        </div>
        <div class="form-group col-md-4">
          <label for="inputState">State</label>
          <select id="inputState" type="text" class="form-control" name="state">
            <c:choose>
              <c:when test="${state == null}">
                <option>...</option>
              </c:when>
              <c:otherwise>
                <option selected>${state}</option>
                <option>...</option>
              </c:otherwise>
            </c:choose>
            <option>Nebraska</option>
            <option>Tennessee</option>
            <option>Iowa</option>
            <option>Texas</option>
            <option>...</option>
          </select>
        </div>
        <div class="form-group col-md-2">
          <label for="inputZip">Zip</label>
          <input type="text" class="form-control" name="zip" id="inputZip" placeholder="${zip}">
        </div>
      </div>
      <div class="form-group">
        <div class="form-check">
          <input class="form-check-input" type="checkbox" name="checkbox" id="gridCheck">
          <label class="form-check-label" for="gridCheck">
            Check me out
          </label>
        </div>
      </div>
      <button type="submit" class="btn btn-primary">Sign in</button>
    </div>
  </form>
</body>
</html>