<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=gbk">
  <title>ҳü</title>
</head>
<body>
    <center>
        <table border="0" width="100%" cellspacing="0" cellpadding="0">
            <!-- �����˵� -->
            <tr height="20">
                <td style="text-indent:10" valign="bottom">
                    <a href="InfoAction.action" style="color:gray">[������Ϣ]</a>
                    <a href="log_isLogin.action" style="color:gray">[�����̨]</a>
                </td>
                <td align="right" valign="bottom">
                    <a href="#"  style="color:gray" onclick="this.style.behavior='url(#default#homepage)';this.setHomePage('http://localhost:8080/CityInfo');">��Ϊ��ҳ -</a>
                    <a href="javascript:window.external.AddFavorite('http://localhost:8080/CityInfo','���й�����Ϣ��')" style="color:gray">�ղر�ҳ -</a>
                    <a href="mailto:123@***.com.cn" style="color:gray">��ϵ����</a>
                    &nbsp;
                </td>
            </tr>
            <!-- �����˵� -->
            <tr height="56">
                <td align="center" width="220" background="images/logo.gif"></td>
                <td align="right" background="images/menu.gif">
                    <s:set name="types" value="#session.treeMap"/>
                    <s:if test="#types==null||#types.size()==0">û����Ϣ������ʾ��</s:if>
                    <s:else>
                        <table border="0" width="600">
                            <tr align="center">
                                <td width="200"><a href="index.action" style="color:white">��&nbsp;&nbsp;&nbsp;&nbsp;ҳ</a></font></td>
                                <s:iterator status="typesStatus" value="types">
                                    <td width="200"><a href="infoList.action?infoType=<s:property value='key'/>" style="color:white"><s:property value="value"/></a></td>
                                    <s:if test="#typesStatus.index==4"></tr><tr align="center"></s:if>
                                </s:iterator>
                            </tr>                      
                        </table>
                    </s:else>
                </td>
            </tr>
        </table>
        <table border="0" width="100%" height="90" cellspacing="0" cellpadding="0" style="margin-top:1">
            <tr><td align="center"><img src="images/pcard1.jpg"></td></tr>
        </table>
    </center>
</body>
</html>