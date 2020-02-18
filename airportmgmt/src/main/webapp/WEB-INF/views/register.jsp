<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Airport Management</title>
<style type="text/css">
              body {
                     font-family: verdana;
                     font-size: 12px;
                     margin: 40px;
              }
              .customerTable, .customerTable td {
                     border-collapse: collapse;
                     border: 1px solid #aaa;
                     margin: 2px;
                     padding: 2px 2px 2px 10px;
                     font-size: 12px;
              }
              .CustomerTable th {
                     font-weight: bold;
                     font-size: 12px;
                     background-color: #5C82FF;
                     color: white;
              }
              .CustomerLabel {
                     font-family: verdana;
                     font-size: 12px;
                     font-weight: bold;
              }
              a, a:AFTER {
                     color: blue;
              }
              
  			.error {
      			color: red;
      			font-style: italic;
  			}
</style>
<!-- <script type="text/javascript">
	function deleteUser(userId)
	{
		if(confirm('Do you want to delete this user ?'))
		{
			var url='/user/delete/'+planeId;
			window.location.href=url;
		}
	}
</script> -->
</head>
<body>
<h2 align="center">User Registeration</h2>
<c:url var="action" value="add"></c:url>
<form:form method="post" action="${action}" commandName="userRegister" cssClass="customerForm">
	<table>
			<tr>
				<td>
					User id
				</td>
				<td>
					<input type="text" name="id" readonly="true" size="8" disabled="true"/>
				</td>
			</tr>
			<tr>
			<td>
				User Type
			</td>
			<td>
				<input type="text" name="userType"/>
			</td>
		</tr>
		<tr>
				<td>
					User Name
				</td>
				<td>
					<input type="text" name="userName"/>
				</td>
			</tr>
		<tr>
				<td>
					Password
				</td>
				<td>
					<input name="password" type="password"/>
					
				</td>
			</tr>
		<tr>
		<tr>
			<td>
				First Name
			</td>
			<td>
				<input type="text" name="firstName">
		</tr>
		<tr>
			<td>
				Last Name
			</td>
			<td>
				<input name="lastName" type="text">
			</td>
		</tr>
		<tr>
		<td>
			Contact Number
			</td>
			<td>
				<input name="contactNumber" type="text">
			</td>
		</tr>
		<tr>
			<td>
				Email
			</td>
			<td>
				<input name="email" type="text">
			</td>
		</tr>
		<tr>
	
			<td>
				Age
			</td>
			<td>
				<input name="age" type="text">
			</td>
		</tr>
		<tr>
			<td>
				Gender
			</td>
			<td>
				<input name="gender" type="text">
			</td>
		</tr>
				<tr>
			<td>
			
			</td>
			<td>
				<input name="approval" type="text" value="N" hidden="true">
			</td>
		</tr>
	
		<tr>
		<td><input type="submit" value="Submit"></td>
		</tr>
		<%-- <tr>
			<td colspan="2">
				<c:if test="${!empty plane.ownerFirstName}">
					<input type="submit" value="<spring:message code="label.editplane"/>"/>
				</c:if>
				<c:if test="${empty plane.ownerFirstName}">
					<input type="submit" value="<spring:message code="label.addplane"/>"/>
				</c:if>
			</td>
		</tr> --%>
		
	</table>
</form:form>
<%-- <h3>List of Customer</h3>
<c:if test="${!empty planeList}">
	<table class="customerTable">
		<tr>
			<th width="180">First Name</th>
			<th width="160">Last Name</th>
			<th width="60">Contact No</th>
			<th width="80">Email</th>
			<th width="60">Type</th>
			<th width="60">Capacity</th>
		</tr>
		<c:forEach items="${planeList}" var="plane">
			<tr>
				<td><a href="<c:url value='/edit/${plane.id}'/>">${plane.ownerFirstName}</a></td>
				<td>${plane.ownerLastName}</td>
				<td>${plane.ownerContactNumber}</td>
				<td>${plane.ownerEmail}</td>
				<td>${plane.planeType}</td>
				<td>${plane.planeCapacity}</td>
				<td><img src="<c:url value='/images/vcard_delete.png'/>" title="Delete Plane" onclick="javascript:deletePlane(${plane.id})"/>
					<a href="<c:url value='/edit/${plane.id}'/>"><img src="<c:url value='/images/vcard_edit.png'/>" title="Edit Plane"/></a>
				</td>
			</tr> 
		</c:forEach>
	</table>
</c:if> --%>
</body>
</html>
