<%@ page language="java" contentType="text/html; charset=gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head><title>查看信息列表</title></head>
<body>
    <center>        
        <!-- 列表显示付费信息 -->
        <s:set name="onepayforlist" value="#request.onepayforlist"/>        
        <table border="0" width="670" cellspacing="0" cellpadding="0" style="margin-top:5">
            <s:if test="#onepayforlist==null||#onepayforlist.size()==0">
                <tr height="30"><td align="center">★★★ 缴费后，您发布信息就可在这里显示！★★★</td></tr>
            </s:if>
            <s:else>
                <tr height="30"><td style="text-indent:5" valign="bottom"><font color="#004790"><b>■推荐<s:property value="#session.treeMap[#onepayforlist[0].infotype.typesign]"/></b>『缴费专区』</font></td></tr>
                <s:iterator status="onepayforStatus" value="onepayforlist">
                     <s:if test="#onepayforStatus.odd">
                         <tr><td align="center" style="border:1 solid" bgcolor="#F0F0F0">
                     </s:if>
                     <s:else>
                         <tr><td align="center" style="border:1 solid" bgcolor="white">
                     </s:else>
                             <table border="0" width="655" cellpadding="3" style="word-break:break-all">
                            	 <tr>
                                	 <td style="color: red;" align="center">职位：【<s:property value="infotitle"/>】</td>
                                 </tr>
                                 <tr height="30">
                                     <td colspan="2">【<s:property value="#session.treeMap[#onepayforlist[0].infotype.typesign]"/>】</td>
                                     <td align="right">发布时间：『<s:property value="infodate"/>』&nbsp;</td>
                                 </tr>
                                 <tr height="80"><td colspan="3"><s:property value="infocount"/></td></tr>
                                 <tr height="30" align="center">
                                     <td>联系电话：<s:property value="infophone"/></td>
                                     <td>联 系 人：<s:property value="infolinkman"/></td>
                                     <td>E-mail：<s:property value="infoemail"/></td>
                                 </tr>                                 
                             </table>
                         </td>
                     </tr>
                     <tr height="1"><td></td></tr>
                </s:iterator>
            </s:else>
        </table>
                     共<s:property value="pageBean2.allRow"/>条记录
      	 共<s:property value="pageBean2.totalPage"/>页
                     当前第<s:property value="pageBean2.currentPage"/>页
     	<s:if test="%{pageBean2.currentPage==1}">
     		第一页    上一页
     	</s:if>
     	<s:else>
     		<a href="infoList.action?page2=1&infoType=<s:property value="%{pageBean2.infoType}"/>">第一页</a>
     		<a href="infoList.action?page2=<s:property value="%{pageBean2.currentPage-1}"/>&infoType=<s:property value="%{pageBean2.infoType}"/>">上一页</a>
     	</s:else>
     	<s:if test="%{pageBean2.currentPage!=pageBean2.totalPage}">
     		<a href="infoList.action?page2=<s:property value="%{pageBean2.currentPage+1}"/>&infoType=<s:property value="%{pageBean2.infoType}"/>">下一页</a>
     		<a href="infoList.action?page2=<s:property value="%{pageBean2.totalPage}"/>&infoType=<s:property value="%{pageBean2.infoType}"/>">最后一页</a>
     	</s:if>
     	<s:else>
     		下一页       最后一页
     	</s:else>
        <!-- 列表显示免费信息 -->
        <s:set name="onefreelist" value="#request.onefreelist"/>
        <table border="0" width="670" cellspacing="0" cellpadding="0" style="margin-top:5" rules="rows">
            <s:if test="#onefreelist==null||#onefreelist.size()==0">
                <tr height="30"><td align="center">★★★ 在这里显示免费发布的信息！★★★</td></tr>
            </s:if>
            <s:else>
                <tr height="30"><td style="text-indent:5" valign="bottom"><font color="#004790"><b>■最新<s:property value="#session.treeMap[#onefreelist[0].infotype.typesign]"/></b>『免费专区』</font></td></tr>
                <s:iterator status="onefreeStatus" value="onefreelist">
                     <s:if test="#onefreeStatus.odd">
                         <tr><td align="center" style="border:1 solid" bgcolor="#F0F0F0">
                     </s:if>
                     <s:else>
                         <tr><td align="center" style="border:1 solid" bgcolor="white">
                     </s:else>
                             <table border="0" width="655" cellpadding="3" style="word-break:break-all">
	                             <tr>
	                                 <td align="center" style="color: red;">职位：【<s:property value="infotitle"/>】</td>
	                             </tr>
                      
                                 <tr height="30">
                                     <td colspan="2">【<s:property value="#session.treeMap[#onefreelist[0].infotype.typesign]"/>】</td>
                                     <td align="right">发布时间：『<s:property value="infodate"/>』&nbsp;</td>
                                 </tr>
                                 <tr height="80"><td colspan="3"><s:property value="infocount"/></td></tr>
                                 <tr height="30" align="center">
                                     <td>联系电话：<s:property value="infophone"/></td>
                                     <td>联系人：<s:property value="infolinkman"/></td>
                                     <td>E-mail：<s:property value="infoemail"/></td>
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
       	 共<s:property value="pageBean1.allRow"/>条记录
      	 共<s:property value="pageBean1.totalPage"/>页
                     当前第<s:property value="pageBean1.currentPage"/>页
     	<s:if test="%{pageBean1.currentPage==1}">
     		第一页    上一页
     	</s:if>
     	<s:else>
     		<a href="infoList.action?page1=1&infoType=<s:property value="%{pageBean1.infoType}"/>">第一页</a>
     		<a href="infoList.action?page1=<s:property value="%{pageBean1.currentPage-1}"/>&infoType=<s:property value="%{pageBean1.infoType}"/>">上一页</a>
     	</s:else>
     	<s:if test="%{pageBean1.currentPage!=pageBean1.totalPage}">
     		<a href="infoList.action?page1=<s:property value="%{pageBean1.currentPage+1}"/>&infoType=<s:property value="%{pageBean1.infoType}"/>">下一页</a>
     		<a href="infoList.action?page1=<s:property value="%{pageBean1.totalPage}"/>&infoType=<s:property value="%{pageBean1.infoType}"/>">最后一页</a>
     	</s:if>
     	<s:else>
     		下一页       最后一页
     	</s:else>
    </center>
</body>
</html>