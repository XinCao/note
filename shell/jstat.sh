#!/bin/bash
echo "请输入java进程pid:";
read pid;
while true;
do
    echo `date '+%T%n%D'``jstat -gcutil $pid` >> log.txt
    sleep 5;
done
