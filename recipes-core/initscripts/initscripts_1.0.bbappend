FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI += "file://wattmeter-km.sh"
SRC_URI += "file://cs-update-server.sh"

do_install_append () {
	install -m 0755    ${WORKDIR}/wattmeter-km.sh	${D}${sysconfdir}/init.d
	install -m 0755    ${WORKDIR}/cs-update-server.sh	${D}${sysconfdir}/init.d
	update-rc.d -r ${D} wattmeter-km.sh start 90 S .
	update-rc.d -r ${D} cs-update-server.sh start 91 S .
}

MASKED_SCRIPTS += "wattmeter-km"
MASKED_SCRIPTS += "cs-update-server"