DESCRIPTION = "Prints current power consumption"
LICENSE = "CLOSED"
SRC_URI="git://github.com/tomas73/wattmeter.git;protocol=https"

SRCREV = "${AUTOREV}"
BPV = "0.1.0"
PV = "${BPV}+gitr${SRCPV}"
INSANE_SKIP_${PN} = "ldflags"

S = "${WORKDIR}/git/userspace/basic-power"

do_compile() {
	     bbplain "power: do_compile"
	     ${CC} power.c -o power
}

do_install() {
	     install -d ${D}${bindir}
	     install -m 0755 power ${D}${bindir}
}

RPROVIDES_${PN} += "power"
