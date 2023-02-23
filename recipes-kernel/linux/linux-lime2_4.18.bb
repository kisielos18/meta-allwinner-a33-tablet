SUMMARY = "An kernel recipe that lime2-linux repository"

inherit kernel
require recipes-kernel/linux/linux-yocto.inc

# Override SRC_URI in a copy of this recipe to point at a different source
# tree if you do not want to build from Linus' tree.
SRC_URI = "git://github.com/maemo-leste/lime2-linux.git;branch=linux-4.18.y;protocol=https"
#SRC_URI = "git://https://github.com/maemo-leste/lime2-linux.git;protocol=https"

LINUX_VERSION ?= "4.18"
SRCREV = "86e014f514f979312cae23a15284cb81d1ee7336"

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"
SRC_URI += "file://defconfig"

COMPATIBLE_MACHINE = "sun8i-a33-tablet"
CONFIG_SRC := "${THISDIR}"

#do_unpack_append(){
#    bb.build.exec_func('install_defconfig', d)
#}

#install_defconfig(){ 
#    cp ${THISDIR}/files/defconfig ${S}/arch/${ARCH}/configs/
#}

#KCONFIG_MODE = "--alldefconfig"
#KBUILD_DEFCONFIG = "defconfig"
#KBUILD_DEFCONFIG_KMACHINE ?= defconfig_file
