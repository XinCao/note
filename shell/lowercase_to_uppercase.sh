#!/bin/bash

if [ "$1"x = "-u"x ]; then
	cat | tr [a-z] [A-Z]
else
	cat | tr [A-Z] [a-z]
fi
