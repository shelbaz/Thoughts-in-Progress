54)
	at org.eclipse.core.runtime.adaptor.EclipseStarter.run(EclipseStarter.java:181)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)
	at java.lang.reflect.Method.invoke(Unknown Source)
	at org.eclipse.equinox.launcher.Main.invokeFramework(Main.java:636)
	at org.eclipse.equinox.launcher.Main.basicRun(Main.java:591)
	at org.eclipse.equinox.launcher.Main.run(Main.java:1450)
	at org.eclipse.equinox.launcher.Main.main(Main.java:1426)
!SUBENTRY 1 org.eclipse.core.filebuffers 4 0 2013-09-30 08:35:42.409
!MESSAGE The file does not exist.
!SESSION 2013-09-30 11:40:00.797 -----------------------------------------------
eclipse.buildId=4.3.0.M20130911-1000
java.version=1.7.0_07
java.vendor=Oracle Corporation
BootLoader constants: OS=win32, ARCH=x86_64, WS=win32, NL=en_CA
Framework arguments:  -product org.eclipse.epp.package.standard.product
Command-line arguments:  -os win32 -ws win32 -arch x86_64 -product org.eclipse.epp.package.standard.product

!ENTRY org.eclipse.egit.ui 2 0 2013-09-30 11:40:28.540
!MESSAGE Warning: EGit couldn't detect the installation path "gitPrefix" of native Git. Hence EGit can't respect system level
Git settings which might be configured in ${gitPrefix}/etc/gitconfig under the native Git installation directory.
The most important of these settings is core.autocrlf. Git for Windows by default sets this parameter to true in
this system level configuration. The Git installation location can be configured on the
Team > Git > Configuration preference page's 'System Settings' tab.
This 