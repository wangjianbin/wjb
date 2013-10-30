<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@ page import="java.util.Map,java.util.TreeMap" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
    Map checkState=new TreeMap();
    checkState.put("1","已审核");
    checkState.put("0","未审核");
    checkState.put("all","全部");
    Map payforState=new TreeMap();
    payforState.put("1","已付费");
    payforState.put("0","未付费"); 
    payforState.put("all","全部");
    request.setAttribute("checkState",checkState);
    request.setAttribute("payforState",payforState);
%>
<html>
<head><title>后台-侧栏</title></head>
<body background="images/back.gif">
    <center>
        <table border="0" width="220" height="100%" cellspacing="0" cellpadding="0" style="margin-top:7">
            <!-- 显示方式 -->
            <tr height="30" bgcolor="#F0F0F0"><td style="text-indent:5;border:1 solid"><font color="#004790"><b>■显示方式</b></font></td></tr>
            <tr height="1"><td></td></tr>
            <s:form action="adminListInfo.action" theme="simple">
            <tr>
                <td align="center" valign="top" style="border:1 solid">
                    <table border="0" width="220" height="150" rules="all" cellspacing="0">
                        <tr>
                            <td align="center" colspan="2">
                                <fieldset style="height:60;width:210">
                                  <legend>★付费状态</legend>
                                  <br>
                                  <s:radio list="#request.payforState" name="infopayfor" value="%{info.infopayfor}"/>
                                </fieldset>
                                <fieldset style="height:60;width:210">
                                  <legend>★审核状态</legend>
                                  <br>
                                  <s:radio list="#request.checkState" name="infostate" value="%{info.infostate}"/>
                                </fieldset>
                            </td>
                        </tr>
                        <tr align="center" height="30" bgcolor="lightgrey">
                            <td>
                               信息类别：
                               <s:select
                                   emptyOption="true"
                                   list="#session.treeMap"                           
                                   name="typeId"/>
                               <s:submit value="显示"/>
                            </td>
                        </tr>
                        
                    </table>
                </td>
            </tr>
            </s:form>
            <tr height="5"><td></td></tr>
            <!-- 设置已付费信息 -->            
            <tr height="30" bgcolor="#F0F0F0"><td style="text-indent:5" style="border:1 solid"><font color="#004790"><b>■付费设置</b></font></td></tr>
            <tr height="1"><td></td></tr>
            <s:form action="adminMoney.action" theme="simple">
            <tr>
                <td align="center" valign="top" style="border:1 solid">
                    <table border="0" width="220" height="80" cellspacing="0" rules="none">
                        <tr height="25"><td align="center" valign="bottom">请输入要设为已付费状态的信息ID：</td></tr>
                        <tr height="40">
                            <td align="center">
                                <s:textfield name="MoneyId" size="24"></s:textfield>
                                <s:submit value="查询"></s:submit>
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
            </s:form>
            <tr height="5"><td></td></tr>
            <tr height="30" bgcolor="#F0F0F0"><td style="text-indent:5;border:1 solid"><font color="#004790"><b>■日历</b></font></td></tr>
            <tr height="1"><td></td></tr>
            <!-- 日历 -->            
            <tr height="130">
                <td valign="top" style="border:1 solid"><jsp:include page="/pages/calendar.jsp"/></td>
            </tr>
        </table>        
    </center>
</body>
</html>