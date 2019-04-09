<%--
  Created by IntelliJ IDEA.
  User: lei02
  Date: 2019/4/9
  Time: 17:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="seriesBean" type="mybean.data.Bean" scope="request" />
<html>
<head>
    <title>showResult</title>
    <style type="text/css">
        body{
            color:#EEFFBB;
        }
        table{
            border:1px;
        }
    </style>
</head>
<body>
    <table>
        <tr>
            <th>数据的首项</th>
            <th><jsp:getProperty name="seriesBean" property="name" /></th>
            <th>所求项数</th>
            <th>求和结果</th>
        </tr>
        <tr>
            <td><jsp:getProperty name="seriesBean" property="firstItem" /></td>
            <td><jsp:getProperty name="seriesBean" property="var" /></td>
            <td><jsp:getProperty name="seriesBean" property="number" /></td>
            <td><jsp:getProperty name="seriesBean" property="sum" /></td>
        </tr>
    </table>
</body>
</html>
