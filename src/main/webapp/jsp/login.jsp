<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<body>
<h2>Hello World!</h2>

<form action="login321/login!fun1" method="post">
    <input type="text" name="uname">
    <input type="text" name="upass">
    <input type="submit">
</form>

<s:debug></s:debug>

<s:form namespace="login321" action="login!fun1.action">
    <s:textfield name="uname"></s:textfield>
    <s:password name="upass"></s:password>
    <s:submit value="sss"/>
</s:form>

</body>
</html>
