<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@ page import="java.util.Map,java.util.TreeMap" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
    Map checkState=new TreeMap();
    checkState.put("1","�����");
    checkState.put("0","δ���");
    checkState.put("all","ȫ��");
    Map payforState=new TreeMap();
    payforState.put("1","�Ѹ���");
    payforState.put("0","δ����"); 
    payforState.put("all","ȫ��");
    request.setAttribute("checkState",checkState);
    request.setAttribute("payforState",payforState);
%>
<html>
<head><title>��̨-����</title></head>
<body background="images/back.gif">
    <center>
        <table border="0" width="220" height="100%" cellspacing="0" cellpadding="0" style="margin-top:7">
            <!-- ��ʾ��ʽ -->
            <tr height="30" bgcolor="#F0F0F0"><td style="text-indent:5;border:1 solid"><font color="#004790"><b>����ʾ��ʽ</b></font></td></tr>
            <tr height="1"><td></td></tr>
            <s:form action="adminListInfo.action" theme="simple">
            <tr>
                <td align="center" valign="top" style="border:1 solid">
                    <table border="0" width="220" height="150" rules="all" cellspacing="0">
                        <tr>
                            <td align="center" colspan="2">
                                <fieldset style="height:60;width:210">
                                  <legend>�︶��״̬</legend>
                                  <br>
                                  <s:radio list="#request.payforState" name="infopayfor" value="%{info.infopayfor}"/>
                                </fieldset>
                                <fieldset style="height:60;width:210">
                                  <legend>�����״̬</legend>
                                  <br>
                                  <s:radio list="#request.checkState" name="infostate" value="%{info.infostate}"/>
                                </fieldset>
                            </td>
                        </tr>
                        <tr align="center" height="30" bgcolor="lightgrey">
                            <td>
                               ��Ϣ���
                               <s:select
                                   emptyOption="true"
                                   list="#session.treeMap"                           
                                   name="typeId"/>
                               <s:submit value="��ʾ"/>
                            </td>
                        </tr>
                        
                    </table>
                </td>
            </tr>
            </s:form>
            <tr height="5"><td></td></tr>
            <!-- �����Ѹ�����Ϣ -->            
            <tr height="30" bgcolor="#F0F0F0"><td style="text-indent:5" style="border:1 solid"><font color="#004790"><b>����������</b></font></td></tr>
            <tr height="1"><td></td></tr>
            <s:form action="adminMoney.action" theme="simple">
            <tr>
                <td align="center" valign="top" style="border:1 solid">
                    <table border="0" width="220" height="80" cellspacing="0" rules="none">
                        <tr height="25"><td align="center" valign="bottom">������Ҫ��Ϊ�Ѹ���״̬����ϢID��</td></tr>
                        <tr height="40">
                            <td align="center">
                                <s:textfield name="MoneyId" size="24"></s:textfield>
                                <s:submit value="��ѯ"></s:submit>
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
            </s:form>
            <tr height="5"><td></td></tr>
            <tr height="30" bgcolor="#F0F0F0"><td style="text-indent:5;border:1 solid"><font color="#004790"><b>������</b></font></td></tr>
            <tr height="1"><td></td></tr>
            <!-- ���� -->            
            <tr height="130">
                <td valign="top" style="border:1 solid"><jsp:include page="/pages/calendar.jsp"/></td>
            </tr>
        </table>        
    </center>
</body>
</html>