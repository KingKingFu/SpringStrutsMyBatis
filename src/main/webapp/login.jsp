<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<form action="user/login" method="post">--%>
    <%--<input type="text" name="uname">--%>
    <%--<input type="text" name="upass"><br>--%>
    <%--<input type="submit">--%>
<%--</form>--%>

<s:form namespace="user" action="login!fun1.action">
    <s:textfield name="uname"></s:textfield>
    <s:password name="upass"></s:password>
    <s:submit value="sss"/>
</s:form>

</body>
</html>
