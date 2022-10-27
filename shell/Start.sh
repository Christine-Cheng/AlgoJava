#!/usr/bin/bash

exist = 1;
is_exist(){
  if [ exist==1 ]; then
      restart application.sh
  fi
}
