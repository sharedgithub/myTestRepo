#!/bin/bash

A shell script is a computer program designed to be run by the Unix/Linux shell which could be one of the following:

    The Bourne Shell
    The C Shell
    The Korn Shell
    The GNU Bourne-Again Shell

# 3 Variable type
local ,environment and shell variable

#list .sh files names starts with cd
ls -l cd*.sh

#Arrays
NAME[0]="Zara"
NAME[1]="Qadir"
echo "First Index: ${NAME[0]}"
echo "Second Index: ${NAME[1]}"

#display content of a file
touch file.txt
cat file.txt
cat -b file.txt #with filename

more file       #
less file 	# Browse through a text file. doesnot load the file entirely and allow to navigate page by page
head file 	# Display the first 10 lines of ​file
tail file	# Display the last 10 lines of ​file



cp /home/new.txt /bin/abc.txt #copy file
cp -r home bin #copy folder
mv /home/new.txt /home/new2.txt #move/rename file/folder
rm file.txt #remove file
rm -r folderpath

 # to know which interpretter is in use currently
echo $0


cd /hello/word
cd ..
cd ~ #go to home dir
PS1="enterHerre#"  #change start of the terminal window


#file permission change mod

Number 	Octal Permission Representation 				Ref
0 	No permission 							---
1 	Execute permission 						--x
2 	Write permission 						-w-
3 	Execute and write permission: 1 (execute) + 2 (write) = 3 	-wx
4 	Read permission 						r--
5 	Read and execute permission: 4 (read) + 1 (execute) = 5 	r-x
6 	Read and write permission: 4 (read) + 2 (write) = 6 		rw-
7 	All permissions: 4 (read) + 2 (write) + 1 (execute) = 7 	rwx

user(u) groups (g) others(o) all(a)

-rw-rw-r--   - file   		user: rw- group: rw- all: r--    664
drwxr-xr-x   d directory  	user: rwx group: r-x all: r-x    755

chmod o+wx testfile
chmod a+x testfile
chmod u-x testfile # removing permission
chmod 743 testfile

chown user filelist #change owner
chgrp group filelist #change group

$VAR=22
echo variable is $VAR

echo -n Enter name:
read NAME
echo YourName is $NAME
unset NAME # clean variable value

#-p for print this command is echo + read command
read -p "Enter name:" NAME

#-sp s for silent to read sensitive data     
read -sp "password: " PASSWORD 

#read a filecontent to variable
read HOSTNAME < /etc/hostname.txt 

# put output of command to variable
# print working directory PWD
CURR_DIR=$(pwd)
sleep 2

#let to assign value
FIRST_NUM=2;SECOND_NUM=3
let RESULT=FIRST_NUM+SECOND_NUM
echo "$FIRST_NUM + $SECOND_NUM = $RESULT"

#passing arguments for scripts and functions

#./abc.sh variable1 variable2

$0-script name

$1, $2, ...$n means nth argument

"$@" all agument space separated
$* all argument in a single string

$# argument count


#redirection

three streams STDIN(0) STDOUT(1) STDERR(2)
0-> data provided to program
1-> output of program
2-> error

ls >abc.txt #use >> to apend to existing file
ls 1>abc.txt
cat 2>abc.txt
./abc.sh 2>error.txt 1>output.txt
./abc.sh &>common.txt



#piping is for sending data from one program to another
cat file.txt | head -5 | tail -3 | wc -l > output.txt

#this returns count of lines in file
wc -l file.txt 

#exit status 0 is pass other than o means error
#to check exit status of previously ran command user $?

#Conditons

-eq equal to
-ne not equal to
-gt greater than
-lt less than
-ge greater than and equal to
-le less than and equal to

if [!conditons] && [conditons];then

else

elif [condition] || ![condition];then

fi



#!/bin/bash

if [ ! $# -eq 2]; then
 echo can use only two args
 exit 1
fi

VAR1=$1
VAR2=$2

let RESULT=VAR1*VAR2

if [ $? -ne 0 ]; then
 echo enter only integer
 exit 5
fi

if [ $VAR3 = "ANUJ" ]; then
 echo goti

# regular exp

hel?  help hell helt
car*  car carpenter carpool
file[1-3] file1 file3 file2
[hd]ello hello dello
{*.txt,*.img} abc.txt hell.txt abc.img
file[!1] file2,file3

#file systems

[-e $VAR] returns true if VAR contains path to existing file or directory
[-f $VAR] returns true if VAR contains path to existing file 
[-d $VAR] returns true if VAR contains path to existing directory
[-x $VAR] returns true if VAR contains path to executable file
[-L $VAR] returns true if VAR contains path of a symlink
[-r $VAR] returns true if VAR contains path of a readable file
[-w $VAR] returns true if VAR contains path of a writable file


#loop

a=0
while [ "$a" -lt 10 ]    # this is loop1
do
   b="$a"
   while [ "$b" -ge 0 ]  # this is loop2
   do
      echo -n "$b "
      b=`expr $b - 1`
   done
   echo
   a=`expr $a + 1`
done

NUMS="1 2 3 4 5 6 7"

for NUM in $NUMS
do
   Q=`expr $NUM % 2`
   if [ $Q -eq 0 ]
   then
      echo "Number is an even number!!"
      continue
   fi
   echo "Found odd number"
done

#functions
function addition() {
 local VAR=$1
 local VAR2=$2
}

addition 1 2

#SED Stream editor to perform basic text transformation on input stream

sed OPTIONS..[SCRIPT][INPUTFILE]

[SCRIPT] : [ADDR] X [options]

#delete line 30 to 35 from abc.txt and write in output.txt
sed '30,35d' abc.txt> output.txt

a text  append text
i text  prepend text
d       delete
p       print

# from table t print only lines containing 
sed -n '/peter/p' table.txt
#print only third file
sed -n '3p' table.txt
#print only third file
sed -n '3,6p' table.txt

# g/re/p which means “globally search for a regular expression and print all lines containing it”.

$ls -l | grep "Aug"

cat /proc/cpuinfo  	#CPU info
cat /proc/meminfo  	#memory info
cat -h  		# display free and used memory
htop 			# task manager
mpstat 1 		#process statistics
vmstat 1 		#vm stattistics
iostat 1 		#IO statistics
tail 100 /var/log/messages 		#display last 100 syslog messages
tcpdump -i eth0 'port 80' 		# Monitor all traffic on port 80 ( HTTP )

id # Display the user and group ids of yourcurrent user.
last # Display the last users who have logged ontothe system.
who # Show who is logged into the system.
w # Show who is logged in and what they aredoing.

df -h		# Show free and used space on mounted filesystems
fdisk -l	# Display disks partitions sizes and types
du -ah		# Display disk usage for all files and directories inhuman readable formart

ssh -p port user@host  # Connect to ​host​ using ​port

grep pattern file		# Search for ​pattern​ in ​file
grep -r pattern directory	# Search recursively for ​pattern​ in ​directory
locate name			# Find files and directories by name
find /home/john -name'prefix*'	# Find files in ​/home/john​ that start with "prefix".


ps				# Display your currently running processes
ps -ef				# Display all the currently running processes on thesystem.
ps -ef | grep processname	# Display process information for ​processnametop# Display and manage the top processesh
kill pid			# Kill process with process ID of p​id
killall processname		# Kill all processes named ​processname

ifconfig -a			# Display all network interfaces and ip address
ifconfig eth0			# Display eth0 address and details
ping host			# Send ICMP echo request to ​host
whois domain			# Display whois information for ​domain
dig domain			# Display DNS information for ​domain
dig -x IP_ADDRESS		# Reverse lookup of ​IP_ADDRESS
host domain			# Display DNS ip address for ​domain
hostname -i			# Display the network address of the host name.
hostname -I			# Display all local ip addresses
wget http://domain.com/file	# Download ​http://domain.com/file
netstat -nutlp			# Display listening tcp and udp ports and correspondingprograms

tar cf archive.tar directory	# Create tar named ​archive.tar​ containingdirectory​.
tar xf archive.tar		# Extract the contents from ​archive.tar​.
tar czf archive.tar.gz directory	# Create a gzip compressed tar file namearchive.tar.gz​.
tar xzf archive.tar.gz		# Extract a gzip compressed tar file.
