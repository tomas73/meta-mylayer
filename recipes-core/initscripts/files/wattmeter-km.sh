#!/bin/sh
### BEGIN INIT INFO
# Provides:          
# Required-Start:    
# Required-Stop:     
# Default-Start:     
# Default-Stop:      
# Short-Description: loads my kernel module wattmeter-km
# Description:       loads my kernel module wattmeter-km
### END INIT INFO

case "$1" in
    start|"")
	insmod /lib/modules/4.9.130-jumpnow/extra/wattmeter-km.ko
	;;
    stop)
	rmmod wattmeter-km
	;;
    *)
	echo "Usage: load_kmod {start|stop}" >&2
	exit 1
	;;
esac

exit 0
