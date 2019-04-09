<%--
  Created by IntelliJ IDEA.
  User: lei02
  Date: 2019/4/6
  Time: 19:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <style type="text/css">
      body{
        color:#FFBBFF;
        font-size:20px;
      }
      input{
        size:4px;
      }
    </style>
  </head>
  <body>
    <form action="computerSum1" method="post">
      等差数列求和：
      <br />
      输入首项：<input type="text" name="firstItem"/>
      输入公差：<input type="text" name="var"/>
      求和项数：<input type="text" name="number" />
      <input type="submit" value="提交"/>
    </form>

    <form action="computerSum2" method="post">
      等比数列求和：
      <br />
      输入首项：<input type="text" name="firstItem"/>
      输入公比：<input type="text" name="var"/>
      求和项数：<input type="text" name="number" />
      <input type="submit" value="提交"/>
    </form>
  </body>
</html>
