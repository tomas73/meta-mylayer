DESCRIPTION = "Pushes current power consumption to server"
LICENSE = "CLOSED"
SRC_URI="git://github.com/tomas73/wattmeter.git;protocol=https"

SRCREV = "${AUTOREV}"
BPV = "0.1.0"
PV = "${BPV}+gitr${SRCPV}"
INSANE_SKIP_${PN} = "ldflags"

S = "${WORKDIR}/git/userspace/CS-update/client"

do_compile() {
	     bbplain "cs-update-client: do_compile"
	     ${CC} main.c -o cs-update-client
}

do_install() {
	     install -d ${D}${bindir}
	     install -m 0755 cs-update-client ${D}${bindir}
}

RPROVIDES_${PN} += "cs-update-client"
