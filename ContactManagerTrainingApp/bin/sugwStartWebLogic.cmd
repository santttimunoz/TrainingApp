@ECHO off

@rem personalizacion
@rem set enableHotswapFlag=-javaagent:%WL_HOME%\server\lib\diagnostics-agent.jar
@rem set PRODUCTION_MODE=false
@rem FOR ServerTest
@rem -Dh2.optimizeInJoin=false -Dserver.running.tests=true -Dgw.ab.env=h2mem -Dgw.bc.env=h2mem -Dgw.cc.env=h2mem -Dgw.pc.env=h2mem -Dgw.ph.env=h2mem -Dgw.px.env=h2mem -Dgw.th.env=h2mem -Dserver.runlevel=4

for %%p in (%*) do call :SET_PARAM %%p
GOTO :CMD_LINE_DONE
	:SET_PARAM
	for %%q in (%1) do set noQuotesParam=%%~q
	if /i "%noQuotesParam%" == "MODE_TEST" (
		set GW_OPTIONS_TEST=-Dh2.optimizeInJoin=false -Dserver.running.tests=true -Dgw.ab.env=h2mem -Dgw.bc.env=h2mem -Dgw.cc.env=h2mem -Dgw.pc.env=h2mem -Dgw.ph.env=h2mem -Dgw.px.env=h2mem -Dgw.th.env=h2mem
		GOTO :EOF
	)
	if /i "%noQuotesParam:~0,9%" == "RUN_LEVEL" (
		set GW_OPTIONS_RUN_LEVEL= %GW_OPTIONS_TEST% -Dserver.runlevel=%noQuotesParam:~10,1%
		GOTO :EOF
	)
	
	if /i "%noQuotesParam:~0,15%" == "WLS_DOMAIN_HOME" (
		set WLS_DOMAIN_HOME=%noQuotesParam:~16%
		GOTO :EOF
	)
	GOTO :EOF
:CMD_LINE_DONE

if "%WLS_DOMAIN_HOME%"=="" (
  echo Falta el parametro WLS_DOMAIN_HOME, ejemplo WLS_DOMAIN_HOME:D:\java\oracle\wls\12c.1.3\user_projects\domains\base_domain
)

set GW_OPTIONS_DEV=-ea -Dgw.server.mode=dev -Dgwdebug=true
set WLS_OPTIONS_SERVER=-Dweblogic.ScatteredReadsEnabled=true -Dweblogic.wsee.client.ssl.usejdk=true 
set WLS_OPTIONS_SECURITY=-Dweblogic.security.allowCryptoJDefaultJCEVerification=true -Dweblogic.security.allowCryptoJDefaultPRNG=true -Dweblogic.security.SSL.ignoreHostnameVerification=true -Dweblogic.security.TrustKeyStore=DemoTrust
set SURA_OPTIONS=-Dfile.generic.path=C:\u01\escritura\arquitectura\config\wls.properties -Dfile.path=C:\u01\escritura\arquitectura\config\local.properties
set JAVA_OPTIONS=%WLS_OPTIONS_SECURITY% %WLS_OPTIONS_SERVER% %GW_OPTIONS_DEV% %GW_OPTIONS_TEST% %GW_OPTIONS_RUN_LEVEL% %SURA_OPTIONS%
echo GW_OPTIONS_TEST=%GW_OPTIONS_TEST%

set debugFlag=true
set USER_MEM_ARGS=-Xms256m -Xmx4096m -XX:MaxPermSize=512m
set PARAMETERS_CMDLINE=enableHotswap noderby

ECHO WLS_DOMAIN_HOME=%WLS_DOMAIN_HOME%
call %WLS_DOMAIN_HOME%\bin\startWeblogic.cmd %PARAMETERS_CMDLINE%

:DO_EXIT