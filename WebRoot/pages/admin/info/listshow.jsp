<%@ page language="java" contentType="text/html; charset=gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <title>��̨-�鿴��Ϣ�б�</title>
    <script type="text/javascript" src="<s:url value='js/DeleteCheck.js'/>"></script>
</head>
<body>
    <center>
        <table border="0" width="650" cellspacing="0"  cellpadding="0">
            <s:set name="listshow" value="#request.adminlist"/>
            <s:if test="#listshow==null||#listshow.size()==0">
                <tr height="1"><td></td></tr>
                <tr height="200" bgcolor="#F9F9F9"><td colspan="8" align="center" style="border:1 solid"><font color="red"><b>���Բ���δ�ҵ�������������Ϣ�����</b></font></td></tr>
            </s:if>
            <s:else>
                <tr height="30">
                    <td style="text-indent:8">���[<s:property value="#session.treeMap[#listshow[0].infotype.typesign]"/>]</td>
                    <td><s:fielderror/>&nbsp;</td>
                </tr>
                <tr>
                    <td colspan="2" align="center" style="border:1 solid">
                        <table border="0" width="100%" cellspacing="0" cellpadding="0">
                            <tr align="center" height="30" bgcolor="#F0F0F0">
                                <td width="7%"><b>���</b></td>
                                <td width="8%"><b>��ϢID</b></td>
                                <td width="35%"><b>��Ϣ����</b></td>
                                <td width="20%"><b>����ʱ��</b></td>
                                <td width="8%"><b>����</b></td>
                                <td width="8%"><b>���</b></td>
                                <td width="14%" colspan="2"><b>����</b></td>
                            </tr>
                            <s:iterator status="status" value="listshow">
                                <s:if test="#status.odd">
                                    <tr height="30"></s:if>
                                <s:else>
                                    <tr height="30" bgcolor="#F9F9F9"></s:else>
                                        <td align="center"><b><s:property value="#status.index+1"/></b></td>
                                        <td style="text-indent:10"><s:property value="id"/></td>
                                        <td style="text-indent:5"><a href="adminsingInfo.action?checkID=<s:property value='id'/>"><s:property value="infotitle"/></a></td>
                                        <td align="center"><s:property value="infodate"/></td>
                                        <td align="center"><s:if test="infopayfor==1">��</s:if><s:else>��</s:else></td>
                                        <td align="center"><s:if test="infostate==1"><font color="red">��</font></s:if><s:else><b><font color="blue">��</font></b></s:else></td>
                                        <td align="center"><a href="adminsingInfo.action?checkID=<s:property value='id'/>">�����</a></td>
                                        <td align="center"><a href="adminDelete.action?deleteID=<s:property value='id'/>" onclick="return really()">��ɾ��</a></td>
                                    </tr>
                            </s:iterator>
                        </table>
                    </td>
                </tr>
                <tr height="8"><td></td></tr>
            </s:else>
        </table>
                     ��<s:property value="pageBean.allRow"/>����¼
      	 ��<s:property value="pageBean.totalPage"/>ҳ
                     ��ǰ��<s:property value="pageBean.currentPage"/>ҳ
     	<s:if test="%{pageBean.currentPage==1}">
     		��һҳ    ��һҳ
     	</s:if>
     	<s:else>
     		<a href="adminListInfo.action?page=1&infopayfor=<s:property value="%{pageBean.payforType}"/>&infostate=<s:property value="%{pageBean.stateType}"/>&typeId=<s:property value="%{pageBean.typeId}"/>">��һҳ</a>
     		<a href="adminListInfo.action?page=<s:property value="%{pageBean2.currentPage-1}"/>&infopayfor=<s:property value="%{pageBean.payforType}"/>&infostate=<s:property value="%{pageBean.stateType}"/>&typeId=<s:property value="%{pageBean.typeId}"/>">��һҳ</a>
     	</s:else>
     	<s:if test="%{pageBean.currentPage!=pageBean.totalPage}">
     		<a href="adminListInfo.action?page=<s:property value="%{pageBean.currentPage+1}"/>&infopayfor=<s:property value="%{pageBean.payforType}"/>&infostate=<s:property value="%{pageBean.stateType}"/>&typeId=<s:property value="%{pageBean.typeId}"/>">��һҳ</a>
     		<a href="adminListInfo.action?page=<s:property value="%{pageBean.totalPage}"/>&infopayfor=<s:property value="%{pageBean.payforType}"/>&infostate=<s:property value="%{pageBean.stateType}"/>&typeId=<s:property value="%{pageBean.typeId}"/>">���һҳ</a>
     	</s:if>
     	<s:else>
     		��һҳ       ���һҳ
     	</s:else>
    </center>
</body>
</html>