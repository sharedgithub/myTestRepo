Encryption at reciever Decryption at sender
plain data-> cipher data->comm chanel-> cipher data-> plain data

Key is used to encrypt the data at reciever and decrypt at sender

Encryption
***virtualization

Hypervisor any software hardware firmware used to run virtual machine
firmware:-
Kernel:-

Hypervisor has
	host : Server running hypervisor
	Guest Machines: VM
	
Hypervisor Type
	Type 1: Bare metal
		Hardware-> Hypervisor-> VMS ..hypervisor runs directly on the hardware
	Type 2: Hosted 
		Hardware-> Operating Sytepm-> Hypervisor-VMS
		
		
Cloud Type
	Vendors run hypervisor software on their hardware and rent access to the hypervisor

	Public cloud: Own by Someone else
	Private Cloud: Own by people using it
	Hybrid Cloud: Public+Private  where public is used to take backup sometimes
	
Types of Services
	IaaS:
	Paas:
	Saas:
	
______________________________	
	
EXxi host is like physical server
Esxi is the operating system which we install on virtual machine
Esxi is type1 hypervisor

VM's OS is called guest operating system

why vsphere is used

to manage cluster of esxi hosts , their virtual datacenters, virtual memory, virtual network

	vMotion: migration of vm from one host to another
	storage vMotion: migration of storgae file
	High Availibility
	Fault Tolerance
	Disturbueted Resource Scheduler  load balance accrose my physical servers
  
  ********************************************************
	
  Threats and vulnerability

Malware=Malicious Software

Characteristics
1) Propogation mechanisms( how to propogate system to system)
2) Payload( what malicious action to perform)

Types of malwares:

	1) Virus spread system to system with humar help, like inserting usb or click on email attachment
		Prevention : education for user
	2) Worms spread system to system without any help
		Prevention: updating system os and security patches
	3) Trojan horse: like downloading an application which pretends to be a different appplication and does malicious actions
	4) Remote access trojans(RAT) : provide access to the hackers (backdoors)
	
	
	5) Backdoor: 
	6) Logic bomb: executes when a particula state is reached
	
	Advance malwares
	7) rootkits: originally designed for user privilage escalation
				 it delivers variety of payloads:
					1) Adware
					2) backdoors etc
					
		User Mode and Kernel mode rootkits
	8) Polymorphism virus: they avoid signature detection by changing there own code
	9) Armored virus: Use sophisticated techniques to hide themselves from virus detection system
	
	
Three common type of payload
	1) Adware: Displays advertisements
	2) Spyware: Gather information
			Keyloggin
			Monitoring web browsing
			Search hard drive or cloud storage
	3) Ransomeware: block access to files by encrypt the files
	
Signature Detection:

	Comparing signature(detection of code pattern) of virus from a database
	

Botnets: Network of infected computers
    Hacker steals your computer power/network/storage using worms to connect your system to botnets.
    Once added to the network it waits for hackers orders
    hackers uses them to :
    	1) deliver spam
	2) performing ddos
	3) renting computation power 
	4) mining bitcoins 
	5) performing bruetforce attack
	
Zero days: a type of vulnerability in the system which no one knows but the hacker
APT ( advance persistent threats) are well funded group of hackers could be government or individual group
  
  
  

internal or external attacker
internal attacker could be a one:
	who is going through lot of stress
	visiting harmful websites
	installing harmful tools
	
CIA triangle
Confidentiality
INtegrity
Avalibility

DOS denial of service compromises the availability of a system
it requires a lot of bandwidth and easier to block 
thats y distributes dos ddos attack where botnets are used 

Eavesdroping attack : attacker access encrypted communication
	Network device tapping
	DNS or ARP poisining : redirects communication to different system
	( in dns poising wrong dns information is provided to the user and it redirects to attacker server)
	ARP poising for local network
two types: man in the middle and Replay attack
in man in the middle attacker just capture traffice and in replay attacke he uses the captured token to interact as that user and get other information

password attack
bruteforce attack to guess encryption key

hacktivist uses hacking for their social and political agendas
  
  
  Assymteric : we have public and private key here
	Symetric : we have a single key or group of key here 
	
	
Active attacks: where data is modified 
Passive attack: where data/resource is accessed

Passive attacks:
	Packet sniffing

Active attack:

	Replay attack: 
	Masqurrade:
	Data modification:
	Denial of service
	
	
Security Services:
	Data which is transmitted over a network what kind of service we have to see the data is secured
	
	1) Access Control  preventing unauthorised access
	2) Authentication  verification of user
	3) Confidentialty  security to data sender
	4) Integrity 		No modification
	5) Non repudaion   preventing dos attack
	
	
