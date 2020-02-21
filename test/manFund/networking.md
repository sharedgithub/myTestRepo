
Lets a windows compute wants to talks to linux computer 


Open system interconnection model

it tells how data should travel over a network

Application
Presentation
Session
Transport
Network
Datalink
Physical
 
Please Do Not Throw Sause Pizza Away

Physical Layer is first layer of OSI model. Because no physical layer no network.


1) Application Layer
	Is used by network applicaiton like chrome firefox outlook
   Only layer where user interacts with the data
   SMTP , HTTP, POP3, IMAP, DHCP, DNS, TELNET, FTP
   
   80 (HTTP), 443 (HTTPS) or 8080 (HTTP Alternate).
   FTP 25, SSH(Secure shell protocol) 22 and TELNET 23  both telnet and ssh is used to connect remote machine but ssh is secure and encrypted
   DHCP Server 67
	DHCP Client 68
	DNS 53
	
	source.vmware.com	source is hostname (name of the machine) vmware.com is domain name
	.com is top level domain, vmware is second level domain 

when you hit browser with fqdn is resolved by dns server then a socket is opened on the client side to communicate

HTTPS stands for Hyper Text Transfer Protocol Secure. It is highly advanced and secure version of HTTP. It uses the port no. 443 for Data Communication. It allows the secure transactions by encrypting the entire communication with SSL. It is a combination of SSL/TLS protocol and HTTP. It provides encrypted and secure identification of a network server.
	
	HTTP request generally open a connection over network and if the response is recieved it closes that connection same thing happens with rest api
	websocket is a protocol used to create a communication channel over the tcp protocol which will remain open until either client or server terminates the connection
	this is used in the application which require real time data
	like stocks app`gaming app and chat
   
2) Presentation layer
	Translation Encryption and compression 
	SSL
	
3) Session Layer
	Establishing connection, maintaining connection, terminating the connection

4) Transport Layer
	data segmentation , flow control and error control, sequencing
	flow control is when server adjust transmission of data according to the speed of the client
	error control is when server resent the segment which are lost or does not received by the client
	sequencing the segemtn at client side
	TCP and UDP
	TCP does error checking and UDP does not
	Data is called segments in transport layer and it is sent to network layer

5) Network Layer 
	Converts segment into packets
	It descides the best path for the packets
	Routers and L3 Switches
	
	IPV4 IPV6 IPSec and routing protocols OSPF RIP, ICMP  internet control messaging protocol
	
	Packet->  IPSender:IP Receiver: Segment
	
6) Data Link Layer
	COnver packets into frame 
	framing and physical addressing
	Switches , Bridges and NIC
	PPP, PPTP, ARP, RARP( point to point, address resolution protocol , reverse address rp)
	
	Frame:-> MacSender: MacReceiver: Packet
	
7) Physical Layer
	Converts data into bits 
	Hub Repeaters Cables
	Data is called bits here
	
	
	
****IP Address

IPV4 is 32 bit address divided into class A,B, C, D, E
0000000-1111111 each block N.N.N.N is of 8 bit


IP Address   NetworkAddress:HOST Address


Class			Range			Subnet Mast
Class A			0-126			255.0.0.0
B				128-191			255.255.0.0
C				192-223			255.255.255.0
D				224-239				X
E				240-255				X

127.0.0.1 is missing..its a loopback address to check whether nic card is working or not. 
to check type 127.0.0.1

192.168.x.x and 10.x.x.x are typicaly used within private network

First ip address is network id and the last one is broadcast id


***** Network Interface Card
or Network Adapters, Lan Adapters, 

can be wired or wireless

***Hub switch router gateway bridge
Hub connnects devices in the same network ...physical layer...it just broadcast
Swith also does the same thing but it sends to a particula system using ARP ( address resolution protocol )
router works at network layer connecting networs together

hub and swithc works with frames and router works with packets

bridge is used in bus topology where all systems are connected via a bridge. 

any device which connects two network together*, *which uses diffent protocol,  like router,switch, firewall server or any device that enable data flow in and ou

, gateway is also called protocol convertor



****Port Number




https://www.researchgate.net/publication/336085150_A_Comprehensive_Survey_on_IoT_Networking


***** Topologies

Star Bus and Ring



*************Sensors and actuators


*****TPM


*** NAT

*** VLAN VPN
logical division of ip address is called subnetting
and logical division of ethernet is called vlan

https://www.uhcl.edu/computing/information-security/tips-best-practices/routers

proxies revese proxy

firefoxy

packet filtering
application firewaal/ proxy firewall
hybrid provide best security

access controllist

network topology



