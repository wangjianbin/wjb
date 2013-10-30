<%@ page language="java" contentType="text/html; charset=gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
  <title>��̨-�����Ϣ</title>
  <base href="<%=basePath%>">
  <script type="text/javascript" src="<s:url value='js/DeleteCheck.js'/>"></script>
</head>
<body>
    <center>
        <br>
        <s:form theme="simple">
        <input type="hidden" name="checkID" value="<s:property value="info.id"/>">
        <input type="hidden" name="deleteID" value="<s:property value="info.id"/>">
        <table border="0" width="645" cellpadding="10" cellspacing="0" style="word-break:break-all">            
            <tr height="30">
                <td style="text-indent:5"><b>�����Ϣ [IDֵ��<s:property value="info.id"/>]</b></td>
                <td colspan="2" align="right"><s:fielderror/></td>
            </tr>
            <tr height="30" bgcolor="#F9F9F9"><td colspan="3" align="center" style="text-indent:5">��Ϣ��ϸ����</td></tr>
            <tr height="30">
                <td width="25%" style="text-indent:10">��Ϣ���</td>
                <td>��<s:property value="#session.treeMap[info.infotype.typesign]"/>��</td>
                <td>����״̬��&nbsp;&nbsp;<s:if test="info.infopayfor==1">�� �Ѹ���</s:if><s:else>�� δ����</s:else></td>
            </tr>
            <tr height="30">
                <td style="text-indent:10">����ʱ�䣺</td>
                <td><s:property value="info.infodate"/></td>
                <td>���״̬��&nbsp;&nbsp;<s:if test="info.infostate==1">�� �����</s:if><s:else>�� δ���</s:else></td>
            </tr>
            <tr height="30">
                <td style="text-indent:10">��Ϣ���⣺</td>
                <td colspan="2"><s:property value="info.infotitle"/></td>
            </tr>
            <tr height="40" bgcolor="#F9F9F9">
                <td style="text-indent:10">��Ϣ���ݣ�</td>
                <td align="center">
                    <s:if test="info.infostate==1"><s:set name="forbid" value="true"/></s:if>
                    <s:else><s:set name="forbid" value="false"/></s:else>
                    <s:submit action="adminCheck" value="��ͨ�����" disabled="%{forbid}"/>
                </td>
                <td align="center"><s:submit action="adminDelete" value="��ɾ����Ϣ" onclick="return really()"/></td>                
            </tr>
            <tr height="5"><td></td></tr>
            <tr>
                <td colspan="3" style="border:1 solid">
                    <table border="0" width="630" cellspacing="0" cellpadding="10" style="word-break:break-all">
                        <tr height="130"><td colspan="3" valign="top"><s:property value="info.infocount" escape="false"/></td></tr>
                        <tr height="30" align="center">
                            <td>��ϵ�绰��<s:property value="info.infophone"/></td>
                            <td>��ϵ�ˣ�<s:property value="info.infolinkman"/></td>
                            <td>E-mial��<s:property value="info.infoemail"/></td>
                        </tr>
                   </table>  
                </td>
            </tr>
            <tr><td align="center" colspan="3"><a href="javascript:window.history.back(-1)">����</a></td></tr>
         </table>
         </s:form>
    </center>
</body>
</html>