<%@ tag body-content="scriptless" pageEncoding="euc-kr"%>
<%@ tag trimDirectiveWhitespaces="true"%>
<%
	HttpSession httpSession = request.getSession(false);
	if(httpSession !=null && httpSession.getAttribute("authUser")!=null){
		%><jsp:doBody/><%
	}
%>