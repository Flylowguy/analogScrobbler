#
# Makefile:
# gnsdk_musicid sample app
#

sdkdepends = musicid lookup_local storage_sqlite dsp musicid_stream lookup_localstream manager

ifeq ($(filter static, $(MAKECMDGOALS)), static)
	extra_libs = ../../xtralibs/ipp
endif
ARCH=armhf-32
platformlibs += -lasound
include ../build_vars.mk
include $(build_dir)/rules_samples.mk
