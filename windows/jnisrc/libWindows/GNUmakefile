##
# libWindows Makefile
#
# Paul J. Lucas [paul@lightcrafts.com]
##

TARGET_BASE:=	Windows

# Uncomment to compile in debug mode.
#DEBUG:=		true

ROOT:=		../../..
JNI_WINDOWS_DEFINES:=	-DWINVER=0x0603 -D_WIN32_IE=0x0a00 \
			-D_WIN32_WINNT=0x0603 -DUNICODE

JNI_WINDOWS_CFLAGS:=	-std=c++0x
JNI_WINDOWS_INCLUDES:=	-I$(ROOT)/windows
JNI_WINDOWS_LDFLAGS:=	-L.
JNI_WINDOWS_LINK:= 	-lcomdlg32 -lgdi32 -lshlwapi -lole32 -luuid -lWininet -lLCJNI

JAVAH_CLASSES:=	com.lightcrafts.platform.windows.WindowsColorProfileManager \
		com.lightcrafts.platform.windows.WindowsPrintManager \
		com.lightcrafts.platform.windows.WindowsSavedSearch

include		$(ROOT)/lightcrafts/jnisrc/jni.mk

# vim:set noet sw=8 ts=8:
