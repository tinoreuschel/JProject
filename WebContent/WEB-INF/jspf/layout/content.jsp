<%-- 
    Document   : content
    Created on : 08.06.2011, 13:42:25
    Author     : MacYser
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%//Wenn nicht eingeloggt => Startseite%>
<c:choose>

	<c:when test="${sessionScope.aktUser != null}">
		<%//Wenn kein ContentFile => Projectuebersicht%>
		<c:choose>
			<c:when test="${contentFile != null}">
				<jsp:include page='<%= "../content/"+(String)request.getAttribute("contentFile") %>' />
			</c:when>
			<c:otherwise>
				<jsp:include page='../content/overview.jsp' />
			</c:otherwise>
		</c:choose>

	</c:when>
	<c:when test="${triedLogin == true}">
		<%//Wenn kein ContentFile => Projectuebersicht%>
		<jsp:include page='../content/error.jsp' />

	</c:when>
	<c:otherwise>
		<jsp:include page='../content/welcome.jsp' />
	</c:otherwise>
</c:choose>