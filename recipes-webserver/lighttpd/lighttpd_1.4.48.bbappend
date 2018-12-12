SRC_URI += "git://github.com/tomas73/wattmeter.git;protocol=https;"

SRCREV = "${AUTOREV}"

RDEPENDS_${PN} += "lighttpd-module-cgi"

do_install_append () {
		  install -m 0644 ${WORKDIR}/git/userspace/www/power.php ${D}/www/pages/power.php
}
