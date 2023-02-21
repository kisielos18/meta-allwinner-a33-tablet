SUMMARY = "An kernel recipe that lime2-linux repository"

inherit kernel
require recipes-kernel/linux/linux-yocto.inc

# Override SRC_URI in a copy of this recipe to point at a different source
# tree if you do not want to build from Linus' tree.
SRC_URI = "git://https://github.com/maemo-leste/lime2-linux.git;branch=linux-4.18.y"

LINUX_VERSION ?= "4.18"
SRCREV_machine="8b3baaeed9adf1f2ac229e63fd2f29d85612844b"

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"
SRC_URI += "files://defconfig"

# Override COMPATIBLE_MACHINE to include your machine in a copy of this recipe
# file. Leaving it empty here ensures an early explicit build failure.
COMPATIBLE_MACHINE = "qemux86|qemux86-64"
