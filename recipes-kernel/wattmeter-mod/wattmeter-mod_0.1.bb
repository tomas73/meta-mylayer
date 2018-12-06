SUMMARY = "Example of how to build an external Linux kernel module"
LICENSE = "GPLv2"

LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

inherit module

SRC_URI="git://github.com/tomas73/wattmeter-ko.git;protocol=https \
	 file://COPYING \
"

SRCREV = "${AUTOREV}"
BPV = "0.1.0"
PV = "${BPV}+gitr${SRCPV}"


S = "${WORKDIR}/git/kernel-module"

PR = "r1"
# The inherit of module.bbclass will automatically name module packages with
# "kernel-module-" prefix as required by the oe-core build environment.

RPROVIDES_${PN} += "kernel-module-wattmeter"
