<%@ page language="java" contentType="text/html; charset=gb2312"%>
<%@ page import="java.util.TreeMap" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
  TreeMap searchType=new TreeMap();
  searchType.put("like","模糊搜索");
  searchType.put("all","全字匹配");
  request.setAttribute("searchType",searchType);
%>

<html>
<head>
  <title>侧栏</title>
</head>
<body>
    <center>
        <table border="0" width="225" height="100%" cellspacing="0" cellpadding="0">
            <tr height="30"><td style="text-indent:5" valign="bottom"><font color="#004790"><b>■日历</b></font></td></tr>            
            <tr height="1"><td></td></tr>
            <tr height="215">
                <td valign="top" background="images/leftD.jpg"><jsp:include page="/pages/calendar.jsp"/></td>
            </tr>
            <tr height="1"><td></td></tr>
            <tr height="30"><td style="text-indent:5" valign="bottom"><font color="#004790"><b>■信息快速搜索</b></font></td></tr>
            <tr height="1"><td></td></tr>
            <tr height="103">
                <td align="center" valign="top" background="images/leftS.jpg">
                    <table border="0" width="99%" height="100%" cellspacing="0">
                    <s:form action="searchInfo.action" theme="simple">                        
                        <tr height="10"><td colspan="3"></td></tr>
                        <tr>
                            <td align="right" width="100">关键字：</td>
                            <td colspan="2" width="200"><s:textfield name="searchInfo.gjz" value="%{searchInfo.gjz}" size="21"/></td>
                        </tr>
                        <tr>
                            <td align="right">条&nbsp;&nbsp;件：</td>
                            <td>
                                <s:select
                                    emptyOption="true"
                                    list="#session.map"
                                    listKey="value"
                                    listValue="key"                             
                                    name="searchInfo.tj"/>
                            </td>
                            <td align="center" width="30"><s:submit value="搜索"/></td>
                        </tr>
                        <tr>
                            <td align="right">搜索类型:</td>
                            <td>
                                <s:radio 
                                    list="#request.searchType"
                                    value="%{'like'}"
                                    name="searchInfo.lx"/>                                
                            </td>
                        </tr>
                        <tr height="10"><td colspan="3"></td></tr>
                    </s:form>
                    </table>
                </td>
            </tr>
            <tr><td></td></tr>
        </table>                
    </center>
</body>
</html>