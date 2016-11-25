
<%@page import="java.util.*,java.sql.*,java.io.*"%>
<%@page import="javax.servlet.*"%>
<%@page
	import="javax.servlet.http.*,com.prem.interview.pojo.*,com.prem.interview.rpc.*,com.prem.interview.util.*"%>


<%
String filePath=request.getParameter("filePath");
String fileddPath=request.getParameter("fileddPath");
%>
	<%
			String sb=DomXmlForFile.getInstance().printAllFolders(filePath, fileddPath);
			out.println(sb);
	%>
