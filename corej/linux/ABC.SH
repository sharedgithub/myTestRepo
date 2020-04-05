
basic component of linux os: kernel, system libraries, system utilities

System Library: Most of the functionalities of the operating system are implemented by System Libraries. These act as a special function using which application programs accesses Kernel’s features.
System Utility: These programs are responsible for performing specialized, individual level tasks.

Linux kernel and application programs can be installed on any kind of hardware platform and thus is considered as portable.
    It is an open source operating system where programmers get the advantage of designing their own custom OS
    Software and the server licensing required to install Linux is completely free and can be installed on many computers as required
    It has low or minimum but controllable issues with viruses, malware, etc
    It is highly secured and supports multiple file systems.File support system includes Ext2, Ext3, Ext4, Jfs, Xfs, Btrfs, FAT, etc.

Linux Kernel is the component that manages the hardware resources for the user and that provides essential services and interact with the user commands. Linux Kernel is an open source software and free, and it is released under General Public License so we can edit it and it is legal.
Micro,Monolithic and Hybrid



linux is made out form unix kernal. linux is unix clone
ubuntu debian fedora arch linux 


There are six levels of a Linux Boot Sequence. These are as follows:

BIOS: Full form of BIOS is Basic Input or Output System that performs integrity checks and it will search and load and then it will execute the bootloader.
MBR: MBR means Master Boot Record. MBR contains the information regarding GRUB and executes and loads this bootloader.
GRUB: GRUB means Grand Unified Bootloader. In case, many kernel images are installed on your system then you can select which one you want to execute.
Kernel: Root file system is mounted by Kernel and executes the /sbin/init program.


Swap space is the amount of physical memory that is allocated for use by Linux to hold some concurrent running programs temporarily. This condition usually occurs when Ram does not have enough memory to support all concurrent running programs. 

A shell script is a computer program designed to be run by the Unix/Linux shell which could be one of the following:

    The Bourne Shell sh
    The bourne again shell BASH
    The C Shell
    The Korn Shell
    The GNU Bourne-Again Shell



x=2  #will pass
x =2 #will fail

 
read -sp "password: " PASSWORD  #-sp s for silent to read sensitive data    
read HOSTNAME < /etc/hostname.txt  #read a filecontent to variable
read -p "enter your name" NAME
unset NAME # clean variable value
echo "this is dir $(pwd) $name" # ex for cmd output and variable
echo $0 # to know which interpretter is in use currently
cd /hello/word
cd ..
cd ~ #go to home dir
PS1="enterHerre#"  #change start of the terminal window

#display content of a file
touch file.txt
tac file.txt  #reverse of cat
cat -b file.txt # displays line number

more file       #
less file 	# Browse through a text file. doesnot load the file entirely and allow to navigate page by page
head file 	# Display the first 10 lines of ​file
tail file	# Display the last 10 lines of ​file
tail 100 /var/log/messages 		#display last 100 syslog messages
head -20 file
wc file		# Displays totallines totalwords  -l for lines -w for words -c for characters
echo "this is my name"  | wc -w # output 4
cat file.txt | head -5 | tail -3 | wc -l > output.txt #piping is for sending data from one program to another
wc -l file.txt #this returns count of lines in file
cat file.txt | sort -rnk2 | uniq -c #-rnk2 means sort in reverse then specifying that column have numeric data and column 2 should be sorted
sort -k -t/; file
cut -d ' ' -f 3 this.txt | cut -c 1-4  # split fields in txt file with space then print only third field then show 1 to 4 character
join file1 file2 # to join the data according to the key field

#File Operations
cp /home/new.txt /bin/abc.txt #copy file
cp -r home bin #copy folder
mv /home/new.txt /home/new2.txt #move/rename file/folder
rm file.txt #remove file
rm -r folderpath # add -i (interactive option to give you a prompt before doing any of the above operation

#Files comparison
cmp file1.txt file2.txt
diff file1.txt file3.txt

# Regular Expression
hel?  help hell helt # matches exactly one character
car*  car carpenter carpool #matches string
file[123] or [1-3] file1 file3 file2 #mathes single character in the range 
[hd]ello hello dello
{*.txt,*.img} abc.txt hell.txt abc.img
file[!1] file2,file3

#Brace expansion
touch {a,b,c}.txt  # creates a.txt b.txt c.txt
touch file{.txt,.jpg} # creates file.txt and file.jpg
touch {1..3}{a..c}.txt # creates all combinations 1a.txt 1c.txt ....3c.txt 

#File Listing
-t sort by modification time
-s sort by size
-r reverse the sort
-l give long details
ls -l cd*.sh #list .sh files names starts with cd

#grep command Grep stands for ‘global regular expression print’. This command is used for matching a regular expression against text in a file.
grep pattern file		# Search for ​pattern​ in ​file
grep -r pattern directory	# Search recursively for ​pattern​ in ​directory
grep -v "ac" file	#gives all line not containing ac
grep [a-f] new.txt
grep "^d" file	#gives all lines starting with d
grep "anuj" *.txt    #find files having anuj text
grep -c "Unix" filename #count a word in a file

#Searching file
find /home -name *.jpg
find -name abc.txt   # in current directory
locate name			# Find files and directories by name
find /home/john -name 'prefix*'	# Find files in ​/home/john​ that start with "prefix".

#Replaces in file
tr //t /, <new.txt >out.csv # this replaces all the tab in the file new.txt and write it in out.csv

#Jobs and Process
jobs  #shows jobs id and process id
fg %1	#brings jobs with id 1 to foreground
bg %2
kill %1
ps				# Display your currently running processes
ps -ef				# Display all the currently running processes on thesystem.
ps -ef | grep processname	# Display process information for ​processnametop# Display and manage the top processesh
kill pid			# Kill process with process ID of p​id
killall processname		# Kill all processes named ​processname
htop 			# task manager


#file permission change mod

Number 	Octal Permission Representation 						Ref
0 	No permission 												---
1 	Execute permission 											--x
2 	Write permission 											-w-
3 	Execute and write permission: 1 (execute) + 2 (write) = 3 	-wx
4 	Read permission 											r--
5 	Read and execute permission: 4 (read) + 1 (execute) = 5 	r-x
6 	Read and write permission: 4 (read) + 2 (write) = 6 		rw-
7 	All permissions: 4 (read) + 2 (write) + 1 (execute) = 7 	rwx

user(u) groups (g) others(o) all(a)

-rw-rw-r--   - file   		user: rw- group: rw- all: r--    664
drwxr-xr-x   d directory  	user: rwx group: r-x all: r-x    755
lrwxr-xr-x  #l means symbolic links or symlinks ..two types hard and soft

chmod o+wx testfile
chmod a+x testfile
chmod u-x testfile # removing permission
chmod 743 testfile

chown user filelist #change owner
chgrp group filelist #change group

free -m
cat /proc/cpuinfo  	#CPU info
cat /proc/meminfo  	#memory info
cat -h  		# display free and used memory

mpstat 1 		#process statistics
vmstat 1 		#vm stattistics
iostat 1 		#IO statistics

tcpdump -i eth0 'port 80' 		# Monitor all traffic on port 80 ( HTTP )

id # Display the user and group ids of yourcurrent user.
last # Display the last users who have logged ontothe system.
who # Show who is logged into the system.
w # Show who is logged in and what they aredoing.

df -h		# Show free and used space on mounted filesystems
fdisk -l	# Display disks partitions sizes and types
du -ah		# Display disk usage for all files and directories inhuman readable formart

#to check operating system 
uname -a

scp # to copy file from one host to another
ssh user@host  # Connect to ​host​ using ​port

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
nslookup google.com 		# gives DNS domain name system ..which is like phonebook of the internet

tar cf archive.tar directory	# Create tar named ​archive.tar​ containingdirectory​.
tar xf archive.tar		# Extract the contents from ​archive.tar​.
tar czf archive.tar.gz directory	# Create a gzip compressed tar file namearchive.tar.gz​.
tar xzf archive.tar.gz		# Extract a gzip compressed tar file.


#!/bin/bash
set -x #to start debugging"
set +x # till where you want to debug"

~ Shell Built in Variables	~ Meaning
$#	Number of command line arguments.
$?	Exit Status
$*	string that contains all arguments to shell
$@	Same as above, except when quoted.
$-	Option supplied to shell
$$	PID of shell
$!	PID of last started background process (started with &)

return code can be between 0 to 255. 0 means success rest mean failure

#If statement

$ {#variable} #displays length of variable

if [[ ! $# -eq 2 ]]; then
 echo can use only two args
 exit 1
fi



if [[ $? -ne 0 ]]; then
 echo enter only integer
 exit 5
fi

-eq equal to
-ne not equal to
-gt greater than
-lt less than
-ge greater than and equal to
-le less than and equal to

#file systems

[-e $VAR] returns true if VAR contains path to existing file or directory
[-f $VAR] returns true if VAR contains path to existing file 
[-d $VAR] returns true if VAR contains path to existing directory
[-x $VAR] returns true if VAR contains path to executable file
[-L $VAR] returns true if VAR contains path of a symlink
[-r $VAR] returns true if VAR contains path of a readable file
[-w $VAR] returns true if VAR contains path of a writable file

if [[ ! -e $dir ]] && [[ mkdir "$dir" ]]; then #for or command use ||
		echo "directory created"
	else
		exit 1
	fi
fi


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
./abc.sh >&2 stdout to stderror..we didnt mention 1 as it is stdout by default 
./abc.sh 2>&1 reverse

{mkdir dir; cd dir} ## command grouping
mkdir dir && cd dir ##cd will execute only if mkdir pass
mkdir dir || cd dir ## cd will execute only if mkdir fails 
[[ $1 ]] || echo "missing parameter"

sleep 2

#let to assign value
FIRST_NUM=2;SECOND_NUM=3
let RESULT=FIRST_NUM+SECOND_NUM
echo "$FIRST_NUM + $SECOND_NUM = $RESULT"



#Arrays
NAME[0]="Zara"
NAME[1]="Qadir"
echo "First Index: ${NAME[0]}"
echo "Second Index: ${NAME[1]}"

b=("this" "is" "war" "ok")

for c in ${b[@]}
do
echo $c

done




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
function addition {
 local VAR=$1
 local VAR2=$2
}

addition(){
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
#replacing text in file
sed 's/version/story/g' myfile.txt


 foo="I'm a cat, and she's cat."
 echo ${foo/cat/dog}   # prints "I'm a dog, and she's a cat."
 echo ${foo//cat/dog}  # prints "I'm a dog, and she's a dog."
 

${string:position:length}
${string:position}
${#string}
${string/pattern/replacement}
${string//pattern/replacement}


Service      Port
SMTP          25
FTP           20 for data transfer and 21 for Connection established

DNS            53
DHCP         67/UDP(for DHCP server, 68/UDPfor DHCP client
SSH            22
