<%@ page language="java" contentType="text/html; charset=gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head><title>�鿴��Ϣ�б�</title></head>
<body>
    <center>        
        <!-- �б���ʾ������Ϣ -->
        <s:set name="onepayforlist" value="#request.onepayforlist"/>        
        <table border="0" width="670" cellspacing="0" cellpadding="0" style="margin-top:5">
            <s:if test="#onepayforlist==null||#onepayforlist.size()==0">
                <tr height="30"><td align="center">���� �ɷѺ���������Ϣ�Ϳ���������ʾ������</td></tr>
            </s:if>
            <s:else>
                <tr height="30"><td style="text-indent:5" valign="bottom"><font color="#004790"><b>���Ƽ�<s:property value="#session.treeMap[#onepayforlist[0].infotype.typesign]"/></b>���ɷ�ר����</font></td></tr>
                <s:iterator status="onepayforStatus" value="onepayforlist">
                     <s:if test="#onepayforStatus.odd">
                         <tr><td align="center" style="border:1 solid" bgcolor="#F0F0F0">
                     </s:if>
                     <s:else>
                         <tr><td align="center" style="border:1 solid" bgcolor="white">
                     </s:else>
                             <table border="0" width="655" cellpadding="3" style="word-break:break-all">
                            	 <tr>
                                	 <td style="color: red;" align="center">ְλ����<s:property value="infotitle"/>��</td>
                                 </tr>
                                 <tr height="30">
                                     <td colspan="2">��<s:property value="#session.treeMap[#onepayforlist[0].infotype.typesign]"/>��</td>
                                     <td align="right">����ʱ�䣺��<s:property value="infodate"/>��&nbsp;</td>
                                 </tr>
                                 <tr height="80"><td colspan="3"><s:property value="infocount"/></td></tr>
                                 <tr height="30" align="center">
                                     <td>��ϵ�绰��<s:property value="infophone"/></td>
                                     <td>�� ϵ �ˣ�<s:property value="infolinkman"/></td>
                                     <td>E-mail��<s:property value="infoemail"/></td>
                                 </tr>                                 
                             </table>
                         </td>
                     </tr>
                     <tr height="1"><td></td></tr>
                </s:iterator>
            </s:else>
        </table>
                     ��<s:property value="pageBean2.allRow"/>����¼
      	 ��<s:property value="pageBean2.totalPage"/>ҳ
                     ��ǰ��<s:property value="pageBean2.currentPage"/>ҳ
     	<s:if test="%{pageBean2.currentPage==1}">
     		��һҳ    ��һҳ
     	</s:if>
     	<s:else>
     		<a href="infoList.action?page2=1&infoType=<s:property value="%{pageBean2.infoType}"/>">��һҳ</a>
     		<a href="infoList.action?page2=<s:property value="%{pageBean2.currentPage-1}"/>&infoType=<s:property value="%{pageBean2.infoType}"/>">��һҳ</a>
     	</s:else>
     	<s:if test="%{pageBean2.currentPage!=pageBean2.totalPage}">
     		<a href="infoList.action?page2=<s:property value="%{pageBean2.currentPage+1}"/>&infoType=<s:property value="%{pageBean2.infoType}"/>">��һҳ</a>
     		<a href="infoList.action?page2=<s:property value="%{pageBean2.totalPage}"/>&infoType=<s:property value="%{pageBean2.infoType}"/>">���һҳ</a>
     	</s:if>
     	<s:else>
     		��һҳ       ���һҳ
     	</s:else>
        <!-- �б���ʾ�����Ϣ -->
        <s:set name="onefreelist" value="#request.onefreelist"/>
        <table border="0" width="670" cellspacing="0" cellpadding="0" style="margin-top:5" rules="rows">
            <s:if test="#onefreelist==null||#onefreelist.size()==0">
                <tr height="30"><td align="center">���� ��������ʾ��ѷ�������Ϣ������</td></tr>
            </s:if>
            <s:else>
                <tr height="30"><td style="text-indent:5" valign="bottom"><font color="#004790"><b>������<s:property value="#session.treeMap[#onefreelist[0].infotype.typesign]"/></b>�����ר����</font></td></tr>
                <s:iterator status="onefreeStatus" value="onefreelist">
                     <s:if test="#onefreeStatus.odd">
                         <tr><td align="center" style="border:1 solid" bgcolor="#F0F0F0">
                     </s:if>
                     <s:else>
                         <tr><td align="center" style="border:1 solid" bgcolor="white">
                     </s:else>
                             <table border="0" width="655" cellpadding="3" style="word-break:break-all">
	                             <tr>
	                                 <td align="center" style="color: red;">ְλ����<s:property value="infotitle"/>��</td>
	                             </tr>
                      
                                 <tr height="30">
                                     <td colspan="2">��<s:property value="#session.treeMap[#onefreelist[0].infotype.typesign]"/>��</td>
                                     <td align="right">����ʱ�䣺��<s:property value="infodate"/>��&nbsp;</td>
                                 </tr>
                                 <tr height="80"><td colspan="3"><s:property value="infocount"/></td></tr>
                                 <tr height="30" align="center">
                                     <td>��ϵ�绰��<s:property value="infophone"/></td>
                                     <td>��ϵ�ˣ�<s:property value="infolinkman"/></td>
                                     <td>E-mail��<s:property value="infoemail"/></td>
                                 </tr>
                             </table>
                         </td>
                     </tr>
                     <tr height="1"><td></td></tr>
                </s:iterator>
                <tr height="30"><td align="center"><jsp:include page="/pages/page.jsp"/><br></td></tr>                
            </s:else>
        </table>
        <br>
       	 ��<s:property value="pageBean1.allRow"/>����¼
      	 ��<s:property value="pageBean1.totalPage"/>ҳ
                     ��ǰ��<s:property value="pageBean1.currentPage"/>ҳ
     	<s:if test="%{pageBean1.currentPage==1}">
     		��һҳ    ��һҳ
     	</s:if>
     	<s:else>
     		<a href="infoList.action?page1=1&infoType=<s:property value="%{pageBean1.infoType}"/>">��һҳ</a>
     		<a href="infoList.action?page1=<s:property value="%{pageBean1.currentPage-1}"/>&infoType=<s:property value="%{pageBean1.infoType}"/>">��һҳ</a>
     	</s:else>
     	<s:if test="%{pageBean1.currentPage!=pageBean1.totalPage}">
     		<a href="infoList.action?page1=<s:property value="%{pageBean1.currentPage+1}"/>&infoType=<s:property value="%{pageBean1.infoType}"/>">��һҳ</a>
     		<a href="infoList.action?page1=<s:property value="%{pageBean1.totalPage}"/>&infoType=<s:property value="%{pageBean1.infoType}"/>">���һҳ</a>
     	</s:if>
     	<s:else>
     		��һҳ       ���һҳ
     	</s:else>
    </center>
</body>
</html>