FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI += "file://wattmeter-km.sh"

do_install_append () {
	install -m 0755    ${WORKDIR}/wattmeter-km.sh	${D}${sysconfdir}/init.d
	update-rc.d -r ${D} wattmeter-km.sh start 90 S .
}

MASKED_SCRIPTS += "wattmeter-km"