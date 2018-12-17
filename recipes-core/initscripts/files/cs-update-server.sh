#!/bin/sh
### BEGIN INIT INFO
# Provides:          
# Required-Start:    
# Required-Stop:     
# Default-Start:     
# Default-Stop:      
# Short-Description: starts cs-update-server as a daemon
# Description:       starts cs-update-server as a daemon
### END INIT INFO

case "$1" in
    start|"")
	/usr/bin/cs-update-server
	;;
    *)
	echo "Usage: cs-update-server.sh start" >&2
	exit 1
	;;
esac

exit 0
