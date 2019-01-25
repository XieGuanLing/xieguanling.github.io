#!/bin/bash
#检测文件是否存在
if [ $# -ne 1 ]
then
	echo "usage -$0 file-name"
	exit 1
fi
if [ -f $1 ]
then
	echo "$1 file exist"
else
	echo "file not found"
fi
