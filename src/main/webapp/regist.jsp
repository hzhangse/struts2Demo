<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<html>

<head>

<title>����������ע����Ϣ</title>
<s:head theme="ajax"/>

</head>


<body>
<H1>����������ע����Ϣ</H1>
<s:form action="regist" theme="ajax" validate="true">
	<s:textfield name="name" label="������"/><br>
	<s:textfield name="pass" label="����"/>
	<s:textfield name="age" label="����"/>
	<s:textfield name="birth" label="����"/>
	<s:submit value="ע��"/>
</s:form>

</body>

</html>