cflags:= -Wall -Wextra -std=c11

LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)

LOCAL_MODULE := panyi
LOCAL_CFLAGS := $(cflags)
LOCAL_LDLIBS := -llog -ljnigraphics -landroid $(extra_ldlibs)

LOCAL_SRC_FILES := \
	native-lib.c \

include $(BUILD_SHARED_LIBRARY)