<%@ page language="java" contentType="text/html; charset=gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
  <title>������Ϣ��-�鿴��ϸ����</title>
  <base href="<%=basePath%>">
  <link type="text/css" rel="stylesheet" href="<s:url value='css/style.css'/>">
</head>
<body>
    <center>
        <table width="670" border="0" cellspacing="0" cellpadding="0" style="margin-top:5">
            <tr height="30"><td style="text-indent:5" valign="bottom"><font color="#004790"><b>���鿴��ϸ��Ϣ</b></font></td></tr>            
            <tr height="1"><td></td></tr>
            <tr bgcolor="#FAFCF5">
                <td style="border:1 solid">
                    <table border="0" width="100%" cellspacing="0" cellpadding="2">
                        <s:if test="info==null">
                            <tr height="100"><td align="center" colspan="2" style="border:1 solid">���� �鿴��Ϣ��ϸ���ݳ�������</td></tr>
                        </s:if>
                        <s:else>
                            <tr height="40">
                                <td width="20%" style="text-indent:20">��Ϣ���</td>
                                <td><s:property value="#session.treeMap[info.infotype.typesign]"/></td>
                            </tr>
                            <tr height="40">
                                <td style="text-indent:20">����ʱ�䣺</td>
                                <td><s:property value="info.infodate"/></td>
                            </tr>
                            <tr height="40">
                                <td style="text-indent:20">��Ϣ���⣺</td>
                                <td><s:property value="info.infotitle"/></td>
                            </tr>
                            <tr height="40"><td colspan="2" style="text-indent:20">��Ϣ���ݣ�</td></tr>
                            <tr>
                                <td colspan="2" align="center">
                                    <table border="1" width="630" cellspacing="0" cellpadding="10" rules="none" frame="below" style="word-break:break-all" bordercolor="lightgrey" bordercolorlight="lightgrey" bordercolordark="white">
                                        <tr height="200" bgcolor="white"><td colspan="3" valign="top" style="border:1 solid"><s:property value="info.infocount" escape="false"/></td></tr>
                                        <tr height="20" align="center">
                                            <td>��ϵ�绰��<s:property value="info.infophone"/></td>
                                            <td>��ϵ�ˣ�<s:property value="info.infolinkman"/></td>
                                            <td>E-mail��<s:property value="info.infoemail"/></td>
                                        </tr>
                                    </table>                      
                                </td>
                            </tr>
                            <tr height="63"><td align="center" colspan="2"><a href="javascript:window.history.back(-1)">����</a></td></tr>                              
                        </s:else>
                    </table>
                </td>
            </tr>
        </table>
        <br>
    </center>
</body>
</html>