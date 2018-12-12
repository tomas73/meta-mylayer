SUMMARY = "Image implementing power meter"
HOMEPAGE = "http://www.matos.se"

require ../../meta-bbb/images/console-image.bb

APACHE_POWER_STUFF = " \
		  apache2 \
		  php \
		  php-dbg \
		  php-cli \
		  php-cgi \
		  php-fpm \
		  php-fpm-apache2 \
		  php-pear \
		  php-phar \
		  php-dev \
"

LIGHTTPD_POWER_STUFF = " \
		     lighttpd \
		     lighttpd-module-fastcgi \
		     php \
		     php-cgi \
"


MY_POWER_STUFF = " \
	    ssh-keys-server \
	    kernel-module-wattmeter \
	    power \
	    cs-update-client \
"

IMAGE_INSTALL += " \
    ${MY_POWER_STUFF} \
    ${LIGHTTPD_POWER_STUFF} \
 "

export IMAGE_BASENAME = "power-image"

