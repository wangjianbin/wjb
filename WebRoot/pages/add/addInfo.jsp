<%@ page language="java" contentType="text/html; charset=gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <title>������Ϣ</title>
    <script type="text/javascript" src="<s:url value='js/InputCheck.js'/>"></script>
</head>
<body>
    <center>
    <table border="0" cellpadding="0" cellspacing="0" width="688" height="100%">
        <tr height="20"><td><img src="images/default_t.jpg"></td></tr>
        <tr>
            <td background="images/default_m.jpg" valign="top" align="center">
                <s:form action="AddInfoAction.action" theme="simple">
                <table border="0" width="650" height="300" rules="all" cellspacing="0">
                    <tr height="30"><td style="text-indent:10"><font color="#004790"><b>��������Ϣ</b></font></td></tr>
                    <tr>
                        <td align="center">
                            <table border="0" width="650" rules="all" cellspacing="8">                    
                                <tr>
                                    <td width="20%" style="text-indent:10">��Ϣ���</td>
                                    <td>
                                       <s:select
                                           emptyOption="true"
                                           list="#session.treeMap"                            
                                           name="info.infotype.typesign"/>                            
                                    </td>
                                    <td align="right"><font color="#7F7F7F">[��Ϣ������಻�ó��� 40 ���ַ�]&nbsp;&nbsp;</font></td>
                                </tr>
                                <tr><td colspan="3" style="color: red"><s:fielderror><s:param value="%{'typeError'}"/></s:fielderror></td></tr>
                                <tr>
                                    <td style="text-indent:10">��Ϣ���⣺</td>
                                    <td colspan="2"><s:textfield name="info.infotitle" size="80" maxlength="40"/></td>                        
                                </tr>
                                <tr><td colspan="3" style="color: red;"><s:fielderror><s:param value="%{'titleError'}"/></s:fielderror></td></tr>
                                <tr>
                                    <td style="text-indent:10">��Ϣ���ݣ�</td> 
                                    <td>
                                        <font color="#7F7F7F">
                                            ���ã�<input type="text" name="ContentUse" value="0" size="4" disabled style="text-align:center;border:0;"> ��&nbsp;&nbsp;
                                            ʣ�ࣺ<input type="text" name="ContentRem" value="500" size="4" disabled style="text-align:center;border:0;"> �� 
                                        </font>
                                    </td>
                                    <td align="right"><font color="#7F7F7F">[��Ϣ������಻�ó��� 500 ���ַ�]&nbsp;&nbsp;</font></td>
                                </tr>
                                <tr><td colspan="3" style="color: red;"><s:fielderror><s:param value="%{'contentError'}"/></s:fielderror></td></tr>
                                <tr><td colspan="3" align="center"><s:textarea id="content" name="info.infocount" rows="12" cols="85" onkeydown="check(content,ContentUse,ContentRem,500)" onkeyup="check(content,ContentUse,ContentRem,500)" onchange="check(content,ContentUse,ContentRem,500)"/></td></tr>
                                <tr>
                                    <td style="text-indent:10">��ϵ�绰��</td>
                                    <td colspan="2"><s:textfield label="��ϵ�绰" name="info.infophone" size="45"/><font color="gray"></font></td>
                                </tr>
                                <tr><td colspan="3" style="color: red;"><s:fielderror><s:param value="%{'phoneError'}"/></s:fielderror></td></tr>
                                <tr>
                                    <td style="text-indent:10">�� ϵ �ˣ�</td>
                                    <td colspan="2"><s:textfield label="�� ϵ ��" name="info.infolinkman" size="50"/></td>
                                </tr>
                                <tr><td colspan="3" style="color: red;"><s:fielderror><s:param value="%{'linkmanError'}"/></s:fielderror></td></tr>
                                <tr>
                                    <td style="text-indent:10">E - mail��</td>
                                    <td colspan="2"><s:textfield label="E - mail" name="info.infoemail" size="55"/></td>                    
                                </tr>
                                <tr><td colspan="3" style="color: red;"><s:fielderror><s:param value="%{'emailError'}"/></s:fielderror></td></tr>                        
                            </table>                
                        </td>
                    </tr>
                    <tr align="center" height="50">
                        <td>
                            <s:submit value="����"/>
                            <s:reset value="����"/>
                        </td>
                    </tr>
                </table>
                </s:form>            
            </td>
        </tr>
        <tr height="26"><td><img src="images/default_e.jpg"></td></tr>        
    </table>
    </center>
</body>
</html>