HIGH_PERFORMANCE:=	1
#USE_ICC_HERE:=		1

TARGET_BASE:=		dcraw_lz

# Uncomment to compile in debug mode.
#DEBUG:=		true

EXEC_EXTRA_CFLAGS:=	-Wno-unused-result
EXEC_WINDOWS_CFLAGS:=	-fopenmp -static
EXEC_LINUX_CFLAGS:=	-fopenmp
EXEC_MACOSX_CFLAGS:=	-Xpreprocessor -fopenmp

EXEC_EXTRA_DEFINES:=	-DNODEPS -DLIGHTZONE
EXEC_WINDOWS_DEFINES:=	-DDJGPP

EXEC_WINDOWS_LINK:=	-lmingwex -lws2_32
EXEC_LINUX_LINK:=	-lm
EXEC_MACOSX_LINK:=	-lomp

ROOT:=		../../..
include		$(ROOT)/lightcrafts/mk/executable.mk

# vim:set noet sw=8 ts=8:
