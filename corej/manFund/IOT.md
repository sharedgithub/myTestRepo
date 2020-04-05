## Different componenet mainly
* communication infrastructure (wifi bluetooth nfc RFID(Radio frequency identification, zigbee)
* computing infrastructure ( applications , backend, data capture and analytical tools)
* Things ( devices, sensors wearables, drones)


## Diffferent layers

Device Layer: Consist of various devices like sensors, wearables, smart meters, smartphones, drones...etc and huge set of standard and custom communication protocol like ZigBee, BACNet, LLRP, Mobdus

Data Ingestion and transformation: Data from different data layer transformed to standard format for further processing by data processing layer
    This data could be from sensors, actuators, wearable, RFID received via TCP/IP socket communication or messaging queues like MQTT,AMPQ, CoAP, DDS, KAfka and HTTP/HTTPS over rest API
    
Data processing layer: batch processing of transformed data from device layer to perform image,preventive, and predictive analysis

APPlication layer: 

## Chalenges
1) Dynamic Environment: millons of sensors and different devices connection with the softwares and cloud

2) Real time complexity: IOT applicaitons can have multiple real time scenarios and its usecases are extremely complex

3) Scalability of systems: to create an envrionment for test ..to test functional and non functional aspects is real challenging
The creation of an environment to test a real-time IoT implementation is a challenge

4) Complex set of usecases to create test cases and test data

5) security and privacy

6) safety concerns

The hardware/software convergence of QA:
Devices, sensors and applications form the ecosystem. However, there is a phase shift from sheer testing of applications in a defined environment to testing the experience in a dynamic environment. With several million sensors and different types of devices providing the experience in conjunction with intelligent software, mere functionality validation is not enough in an environment as complex as IoT

A working system is not sufficient: 
To certify an IoT system or service, it is not enough to merely ensure a working set of device software. For instance, a shipment tracking system with sensors and devices that communicate with multiple software back-ends will need intelligent algorithms to ensure accurate product delivery. This requires a very robust QA validation process. The use cases could be extremely complex in real time; the variety of real-time scenarios can become a challenge for QA.

Large number of sensor interactions: The creation of an environment to test a real-time IoT implementation is a challenge. It entails not only configuring an environment to validate the correctness, but also to assess scalability and reliability. The system is built on numerous analytics engines, and demands a significant experience in simulation to build out a test environment. While the hardware and the rotocols are typically well tested by device makers, understanding application intelligence and the device’s real-time complexity is an extremely new art and science for many application developers and QA experts.

## Types of testing:

Functional 
As this is an architecture between different set(s) of hardware and software, it becomes mandatory that they talk to each other in real time/near real time. When they both integrate with each other, things such as security, backward compatibility, upgrade issues becomes a challenge for the testing team.

Functional Testing:
Compatibility Testing: device versions, communication protoocl version, os version, device software version
Usablity Testing:
Network Testing:testing on different kind of internet connection
Security Testing:
Performance Testing:testing with device low battery, differenct memory configuration
Service Testing:IOT app web service testing
Operational Testing: TO verify app behavour when its fully charged or updated or misscall or network down


## Solutions:

Protocol simulators: One of the interesting aspects of IoT QA is the ability to work with multiple protocols. Protocol simulators can come in handy when there is a huge variety of device end-points and interfaces to validate



Data recorders: Data recorders from different types of devices can be helpful in smart validation across device sets. The recorded data can be played across different device end-points automatically, which in turn can be a great enabler in compatibility testing of apps across different device sets and communication layers.



Virtualization: This is an important aspect of IoT validation. Due to highly complex IoT interfaces, there is little opportunity for real-time validation of application behavior. Therefore, it will still be beneficial to bring in an ample amount of virtualization into the services on which IoT applications are built. Virtualization of an IoT ecosystem yields the benefits of faster turnaround and reduced costs due to minimal dependency on the production environment for testing. It also leads to earlie

Orient people to gain an amalgamation of skills, combining QA, quality engineering and hardware validation to meet the demands of ioT QA.


• Build collaborative QA teams with a view toward performing integrated tests spanning hardware, software and big data layers, thereby augmenting the niche and broader aspects of IoT testing.


• Look for tool-build opportunities: As the distinctions between hardware and software blur,there is a plethora of opportunities to build solutions to enhance QA across the internal systems ecosystem.


• Build labs that serve the entire digital portfolio, to experiment and simulate real-time experiences that inform smarter ways of testing.


• Build a culture of “test as a user” vs. a mind-set in which the organization merely tests against requirements; this will ensure the “experience” component of the IoT stream is well-established for a comprehensive quality product or service.


## Final thoughts



A comprehensive QA strategy is required to cover the depth and breadth of IoT testing. The strategy must include the types of testing, test lab setup, testing tools and simulators that should be deployed. Considering the difficulties in generating big data from the thing in a testing environment, it is crucial to evaluate data simulation and virtualization techniques. Stubs can be considered as options during early stages while data recorders can serve as alternatives at later stages. Beyond test planning and data simulation, metrics-driven exhaustive test execution is performed to achieve a stable system.



Creating a QA environment to enable validation of such an interface means addressing the growing data volume, velocity and variety challenges of the IoT ecosystem. The front-end validation environment can be done by assembling data recorders and simulators. The service and data layer validations will involve complex simulation services such as the generation of millions of sensor hits, machine learning algorithms and the ability to generate time-boxed traffic.
There are a few methods to create such an ecosystem; for example, leveraging sandboxes of development services or creating mock environments using virtualization tools. However,numerous implementation synergies are required to establish a working set of environments for a thorough services and back-end validation platform.



The investments made in IT infrastructure and marketing can take businesses only so far, particularly if they do not have a holistic approach to testing the IoT ecosystem. As IoT expands beyond the periphery into the mainstream of consumer and enterprise markets, QA teams must gear up to help their organizations take advantage of the tremendous opportunities created by the ongoing business digitization. It’s time for QA organizations to empower their companies with reliable IoT products and services that make good on the promise of smart, connected devices that elevate everything from personal wellness/hygiene and driving, through manufacturing, logistics management and air travel. With ever-greater blending of IoT into business and IT, it is necessary for the QA teams to upskill beyond traditional functional testing and gear up for integrated testing of embedded software, IT solutions and big data — and to understand their influence on one another. 


