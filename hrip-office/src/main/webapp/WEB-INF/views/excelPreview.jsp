<%@ page language="java"
    import="java.util.*,com.zhuozhengsoft.pageoffice.*,com.zhuozhengsoft.pageoffice.excelwriter.*"
    pageEncoding="gb2312"%>
<%@ taglib uri="http://java.pageoffice.cn" prefix="po"%>
<%
PageOfficeCtrl poCtrl=new PageOfficeCtrl(request);
//���÷�����ҳ��
poCtrl.setServerPage(request.getContextPath()+"/poserver.zz");
//����Զ��尴ť
poCtrl.addCustomToolButton("����","Save",1);
//���ñ���ҳ��
poCtrl.setSaveFilePage("SaveFile.jsp");
//��Word�ĵ�
String pathName = "http://127.0.0.1/static/" + request.getAttribute("pathName");
poCtrl.webOpen(pathName, OpenModeType.xlsNormalEdit, "������");
poCtrl.setTagId("PageOfficeCtrl1");//���б���
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>��򵥵Ĵ򿪱���Exce�ļ�</title>
</head>
<body>
    <script type="text/javascript">
        function Save() {
            document.getElementById("PageOfficeCtrl1").WebSave();
        }
    </script>
    <form id="form1">
    <div style=" width:100%; height:700px;">
        <po:PageOfficeCtrl id="PageOfficeCtrl1">
        </po:PageOfficeCtrl>
    </div>
    </form>
</body>
</html>
