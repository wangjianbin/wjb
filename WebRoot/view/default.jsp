<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<html>
<head><title>��ҳ</title></head>
<body>
    <center>
        <!-- �ɷ�ר�� -->
        <s:set name="payforlist" value="#request.payforlist"/>        
        <table border="0" width="670" cellspacing="0" cellpadding="5">
            <tr height="35"><td style="text-indent:5" valign="bottom"><font color="#004790"><b>���Ƽ���Ϣ</b>���ɷ�ר����</font></td></tr>
            <tr bgcolor="#FAFCF5">
                <td style="border:1 solid">
                    <table border="0" width="100%" cellspacing="0" cellpadding="0">
                        <s:if test="#payforlist==null||#payforlist.size()==0">
                            <tr height="30"><td align="center" style="border:1 solid">���� �ɷѺ���������Ϣ�Ϳ���������ʾ������</td></tr>
                        </s:if>
                        <s:else>                
                            <s:iterator status="payforStatus" value="payforlist">
                                 <s:if test="#payforStatus.odd"><tr height="23"></s:if>
                                 <td width="50%">��<b><s:property value="#session.treeMap[#payforlist[#payforStatus.index].infotype.typesign]"/></b>��<a href="singleInfo.action?id=<s:property value='id'/>"><s:property value="infotitle"/></a></td>
                                 <s:if test="#payforStatus.even"></tr> </s:if>
                            </s:iterator>
                        </s:else>                        
                    </table>
                </td>
            </tr>
        </table>
        <!-- ��� -->
        <table border="0" width="670"cellspacing="0" cellpadding="0" style="margin-top:1">
            <tr><td align="center"><img src="images/pcard2.jpg"></td></tr>
        </table>        
        <!-- ���ר�� -->
        <s:set name="allsublist" value="#request.allsublist"/>
        <table border="0" width="670" cellspacing="2" cellpadding="0">
            <tr height="35"><td colspan="2" style="text-indent:5" valign="bottom"><font color="#004790"><b>��������Ϣ</b>�����ר����</font></td></tr>            
            <s:if test="#allsublist==null||#allsublist.size()==0">
                <tr height="30"><td align="center" style="border:1 solid">���� ��������ʾ��ѷ�������Ϣ������</td></tr>
            </s:if>
            <s:else>
                <s:iterator status="allStatus" value="allsublist">
                <s:if test="#allStatus.odd"><tr></s:if>
                    <td align="center">
                        <table border="1" cellspacing="0" cellpadding="0" width="332" height="160" rules="none" bordercolor="lightgrey" bordercolorlight="lightgrey" bordercolordark="white">
                         	<s:iterator status="oneStatus">
                         	<s:if test="#oneStatus.index==0">
                                  <tr bgcolor="#00B48F" height="30">
                                      <td style="text-indent:10"><b><font color="white">��<s:property value="#session.treeMap[infotype.typesign]"/></font></b></td>                                      
                                  </tr>
                             </s:if>
                                <tr bgcolor="#FAFCF5"><td style="text-indent:3">�� <a href="singleInfo.action?id=<s:property value='id'/>"><s:property value="infotitle"/></a></td></tr>
                     
                                <s:if test="#oneStatus.last">
                                    <tr height="20" bgcolor="#FAFCF5"><td align="right"><a href="infoList.action?infoType=<s:property value='#allsublist[#allStatus.index].infotype.typesign'/>">����...</a>&nbsp;&nbsp;</td></tr>                                    
     							</s:if>
     					</s:iterator>
                        </table>
                    </td>
                    <s:if test="#allStatus.even"></tr></s:if>
                </s:iterator>
                </s:else>
               
        </table>
        <br>
    </center>
</body>
</html>