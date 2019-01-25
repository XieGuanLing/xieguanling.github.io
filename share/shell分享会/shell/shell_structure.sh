#!/bin/bash
#a simple shell script example
#a function
function sayhello(){
 echo "Enter Your name:"
 read name
 echo "Hello $name"
}

echo "program start here..."
sayhello
echo "program ends"
