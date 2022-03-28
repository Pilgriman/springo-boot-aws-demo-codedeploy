#!/usr/bin/env bash
c2 /home/ec2-user/server
sudo java -jar -Dserver.port=80 * > /dev/null 2> /dev/null < /dev/null &