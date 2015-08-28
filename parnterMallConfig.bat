@echo off
rem --�ĵ�˵��----
rem �����滻/��������̳���Ұ���Դ�ļ�
rem ��Դ�ļ�����:
rem 2���̻���Ϣ�����ļ�
rem 3��color.xml�ļ�
rem 4��style.xml�ļ�
rem 5��APPͼ��
rem 6������ͼƬ
rem 7��key.keystore�ļ�
rem 8������ͼƬ
rem 9���˵�ͼ��
rem 10�������ļ�
rem ��Aaron�ٵ���д
rem 2015-08-27
rem windows��ר�á�liunx��ios�û������ڴ�.sh
rem ȫ����Դ�ļ�Լ����D:\resourcesĿ¼
rem ----�ļ���Ŀ¼----
rem ��Դ�ļ���Ŀ¼
set RESOURCES_DIR = "D://resources//"
rem android��Ŀ��Ŀ¼
set ANDROID_DIR = D:\program\code\Android_HuobanMall_Buyer
rem -----RESģ���ļ�����----
rem RESģ���ļ���Ŀ¼
set RES_TEMPLATE = "%ANDROID_DIR%\res"
rem -----------���������趨-------
rem ������
set CHANNEL_NAME = yaoshengji
rem ����·��
set CHANNEL_DIR = "%ANDROID_DIR%\custom\%CHANNEL_NAME%"
rem Manifest�ļ�·��
set MANIFEST_DIR = "%ANDROID_DIR%"
rem Manifest�ļ�����
set MANIFEST_NAME = AndroidManifest.xml
rem -----�̻���Ϣ�����ļ�---
rem �̻���Ϣ�����ļ�Ŀ¼������
set MERCHANT_DIR_ANDROID = "%ANDROID_DIR%\custom\%CHANNEL_NAME%\res\xml"
rem �̻���Ϣ�����ļ�Ŀ¼����
set MERCHANT_DIR_LOCAL= "%RESOURCES_DIR%\xml"
rem �̻���Ϣ�ļ�����
set MERCHANT_FILE_NAME = merchant_info.xml
rem ----��ɫ����ʽ�����ļ�---
rem color.xml style.xml�ļ���Ŀ¼
set COLOR_STYLE_DIR_ANDROID = "%ANDROID_DIR%\custom\%CHANNEL_NAME%\res\values"
rem color.xml style.xml�ļ���Ŀ¼����
set COLOR_STYLE_DIR_LOCAL = "%RESOURCES_DIR%\values"
rem color�ļ�����
set COLOR_NAME = color.xml
rem style�ļ���
set STYLE_NAME = style.xml
rem -----keystore�����ļ�-
rem keystore�ļ�Ŀ¼
set KEYSTORE_DIR_ANDROID = "%ANDROID_DIR%\keystore"
rem keystore�ļ�Ŀ¼����
set KEYSTORE_DIR_LOCAL = "%RESOURCES_DIR%\keystore"
rem keystore�ļ�����
set KEYSTORE_NAME = key.keystore
rem ----------�����ļ�����----
rem �����ļ�Ŀ¼
set ANIM_DIR_ANDROID = "%ANDROID_DIR%\custom\%CHANNEL_NAME%\res\anim"
rem �����ļ�Ŀ¼����
set ANIM_DIR_LOCAL = "%RESOURCES_DIR%\anim"
rem ----ͼƬ�ļ�����----
rem mdpi�ֱ���ͼƬ
rem ͼƬĿ¼-mdpi
set IMAGE_MDPI_DIR_ANDROID = "%ANDROID_DIR%\custom\%CHANNEL_NAME%\res\drawable-mdpi"
rem ͼƬĿ¼-mdpi����
set IMAGE_MDPI_DIR_LOCAL = "%RESOURCES_DIR%\drawable-mdpi"
rem ͼƬĿ¼-hdpi
set IMAGE_HDPI_DIR_ANDROID = "%ANDROID_DIR%\custom\%CHANNEL_NAME%\res\drawable-hdpi"
rem ͼƬĿ¼-hdpi����
set IMAGE_HDPI_DIR_LOCAL = "%RESOURCES_DIR%\drawable-hdpi"
rem ͼƬĿ¼-xhdpi
set IMAGE_XHDPI_DIR_ANDROID = "%ANDROID_DIR%\custom\%CHANNEL_NAME%\res\drawable-xhdpi"
rem ͼƬĿ¼-xhdpi����
set IMAGE_XHDPI_DIR_LOCAL = "%RESOURCES_DIR%\drawable-xhdpi"
rem ----�Զ����������------
rem -----��������ļ�����----
rem �жϴ�������Ƿ����
if exist "%CHANNEL_DIR%" goto copyres
if not exist "%CHANNEL_DIR%" goto creatchannel
:copyres
echo "С���Ѿ���ʼ������Դģ���ļ������Ժ�..."


pause
:creatchannel
echo "С���Ѿ���ʼ����ͨ���ļ������Ժ�..."
rem ����ͨ���ļ�
echo "%RESOURCES_DIR%"
md "%CHANNEL_DIR%"

rem ����Manifest�ļ�
echo "С�ȿ�ʼ����%MANIFEST_NAME%�ļ�"
copy /y %MANIFEST_DIR%/%MANIFEST_NAME% %CHANNEL_DIR%/
echo "С���Ѿ����������%MANIFEST_NAME%�ļ�"
echo "С�ȿ�ʼ����res��Դģ���ļ���"
set name = %~n1
if not exist  %CHANNEL_DIR%/%name%/ md %CHANNEL_DIR%/%name%/
xcopy %1 %CHANNEL_DIR%/%name%/ /c/q/e
echo "С���Ѿ�����˿���res��Դģ���ļ���"
pause