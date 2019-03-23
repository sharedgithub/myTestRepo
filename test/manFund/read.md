## Overview

Most of the defects occurs during requirement and design phase. 
Phase containment is when we restrict defect to the phase where they are caught

Quality is degree by which a system/component/process meets user/customer requirements. Testing provide way to measure the quality of the system. No of defects, test coverage, pass/fail tests are some parameters

In some cases software testing is not just a good way to reduce risks to the quality of the system to an acceptable level:testing can be required to meet contractual or legal requirement or industry specific standards.

Robustness is the degree to which a component or system can function correctly in the presence of invalid inputs or stressful condition

portablity: The ease by which a software can be transfered from one hardware/software to another


## Risk

Risk is something which can lead to negative concequences.

Product Risk: anything which can impact quality of the product. The possibility that software might fail to satisfy end users need. Risk based testing is done

Impact & Likelihood for all the determined risk is calculated. 
for example addition in calculator impact will be high as everyone uses it but likelihood is low as the code for addition will not be complex
at the same time sine function of calculator will be low impact but likelihood will be high

1 Very High,2 High ,3 medium ,4 low ,5 very low

using impact and likelihood risk priotiy is derived for example if impact is 2 and llkelihood is 5 risk priority will be 2*5 =10 


Project Risk: Risk associated with the delivery timelines of the project. 
	like organizational isssue such as shortage of people, skill or training
	problems with underlying platform or OS
	changes in managment
	
	
Risk can be solved with 
1) mitigation: preplanned steps to avoid risks 
2) contingency: after the risk is identified
3) Transfer: ask someone else in the project to reduce the likelihood of the risk
4) Ignore: if there is little that can be done about it


##Quality of software testing: 

1) interpersonal and communication skill: knowing how to communicate is neccessary but knowledge of what to say and when to say is what is requrired here.
2) Should be able to catch details
3) Explorer 

error occurs due to human mistake. Like if incorrect password is entered that is erro
bug defect fault are the same thing and occurs due to incorrect system implementation or error in development like for the above scenario if the error  message is different 
failure is the diffrence between constumer expection and actual product

Verification is validation against functional and non functional requirements
Validations is wether end user's requirements is met
 Verification is evaluation against functional and software requirements
 Validation is against user requirement specifications

## Agile

Agile is group of software development methodologies where requirements and solutions evolve through collaboration of self organizing cross functional teams

Agile manifesto describes a mindset in following 

* individual and interaction over processes and tools
* working software over comprehensive documentation
* customer collaboration contract negotiation
* response to change over following a plan



## How to select automation tool

1) first understand the requirement for the tool. All the requirement must be documented and reviewed by project teams
	In this step we will have to understand requirement for the tool and various feature it should have

2) Evaluation of all the tools and the vendors
	vendor reputation in the market is important. we need to consider after sale support and tool update frequency
	analyzing all commercial and opensource tools based on requirement from step 1
	ease of use, availibility of training materials, user manuals
	technologies involved
	shortlist all the tool meeting project requirement
	doing a poc  or pilot project with simulated project specific environment. sometime it can happen that tool is good but cannot be integrated with the version control system of the project
	
	
3) Estimation of cost and benifits. If the cost is high compared to the benefits it is offering then it can affect the final decision

4) Making the decision: After analysis of strong and weak points of the tools



if we can explaing something in words we understand it else we dont: Hence we write test plan and stratergy documents
Writing a test plan forces us to confront the challenges and focus our thinking on important topics. Using a template for test plans help us remember important challenges. Through review meetings we can communicate our test plan to the entire team. It also serves as a proof of conversations happening during this duration. 

Test plan also helps us managing change. With the evolution of the project test plan is also required to be revised and updated to keep testing aligned with the project needs.

You can also have differenct test plans for different test levels as system and component test have different need and occur in different timelines

 Components of the Test Plan document
Test Plan id
Introduction
Test items
Features to be tested
Features not to be tested
Test techniques
Testing tasks
Suspension criteria
Features pass or fail criteria
Test environment (Entry criteria, Exit criteria) 
Test deliverables
Staff and training needs
Responsibilities
Schedule

 TestStratergy document developed by test manager is a static document for entire project duration
 This document defines “Software Testing Approach” to achieve testing objectives. The Test Strategy is normally derived from the Business Requirement Specification document.
 
Components of the Test Strategy document
Scope and Objectives
Business issues
Roles and responsibilities
Communication and status reporting
Test deliverables
Industry standards to follow
Test automation and tools
Testing measurements and metrices
Risks and mitigation
Defect reporting and tracking
Change and configuration management
Training plan


The Test Plan document on the other hand, is derived from the Product Description, Software Requirement Specification SRS, or Use Case Documents.
The Test Plan document is usually prepared by the Test Lead or Test Manager and the focus of the document is to describe what to test, how to test, when to test and who will do what test.
After every test phase test plan is updated to reflect any deviation from the original plan




# 7 principles of testing
 Testing shows presence of defect: yes it does but it does not gurantee your application is defect free
 
 Absence of error fallacy: testing is fine ..but the product should be usable to the end users
 Pestcide paradox: same test executed again and again reduces their defect detection effectiveness
 Context dependent: Type of testing depends on the type of product
 Defect clustering: Defects has tendence to form clusters accross the application
 Early testing:
 Exhaustive testing not possible
 
 

## incident management
 severity is defined in terms of financial loss, damage to environment, company’s reputation and loss of life.
 priority of a defect is related to how quickly a bug should be fixed
 When a defect is of high severity, most likely it will also have a high priority.
 
 but High Severity and low Priority is also possible 
 This happens when the bug causes major problems, but it only happens in very rare conditions or situations, for example, customers who use very old browsers cannot continue with their purchase of a product. Because the number of customers with very old browsers is very low, it is not a high priority to fix the issue.
 
 High Prioirty and Low Severity
 This could happen when, for example, the logo or name of the company is not displayed on the website. It is important to fix the issue as soon as possible, although it may not cause a lot of damage.
 
 
## Requirements
 
 BRS(Business Requirement Specifications)  		|SRS(Software req Spec)			  	| FRS (functional)
 createdy By Business Analyst					|System analyst						| developers and engineers
 Whole Requirement or customer whished			|Functional and Non Functional Req	| sequence of operations to be followed for a process|
 

## ROI

Return on investment can be calculated in durations or money
 ther formula for this is (GAIN-INVESTMENT)/INVESTMENT

 GAIN in the time takes with AUtomation (this will also include effort for manual cases which can not be automated)
 

 defect life cycle
 
 Raised -> Reviewd-> Open-> Assigned-> fixed-> closed=> accepted
 				  -> Rejected
 						 -> deffered
 													 -> reopened
## Type of testing
Static testing: testing of component of system without execution of code like code reviews or static analysis
Dynamic testing: testing which involves execution of code 

in static testing code is not executed...like testing FRS or code
in dynamic testing code is executed

User Acceptance is defined as a type of testing performed by the Client/endusers to certify the system with respect to the requirements that was agreed upon. This testing happens in the final phase of testing before moving the software application to the Market or Production environment.
The main purpose of this testing is to validate the end to end business flow. It does NOT focus on cosmetic errors, Spelling mistakes or System testing. This testing is carried out in a separate testing environment with production like data setup. It is a kind of black box testing where two or more end users will be involved.

Alpha Testing: Simulated or Actual operational testing by potential users or independent test team at development site
Beta Testing: Actual testing conducted by end users/customers

System Testing includes both Functional tests as well as Non-Functional tests.

Functional testing ensures that the product/application meets customer and business requirements. On the other hand, non-functional testing is done to verify if the product stands up to customer's expectations in terms of quality, reliability usability, performance, compatibility, etc.

Usability testing: the extent to which software product is easy to learn and operate
Reliablity testing: the process of testing to determine the reliablity of the software. Reliablity is ability of the software to perform its required functions consistently under stated condition or specific period of time

## Testing levels

unit, component , integration, system, acceptance

## Different phases of testing

Planning, estimation, monitoring, test control

## Testing techniques

Static
			Informal Review
			Walkthrough
			Technical Review
			Inspection
			Static Analysis-	DataFlow
								ControlFlow


Dynamic - 
			Experience Based-
									Error Guessing and Fault attacks
									Exploratory Testing
			Specification Based-	
									Equivalence Partitioning
									BoudaryValue Analysis
									Decision Tables
									State Transition
									Use Case Testing
			Structure Based:-
									Statement 
									Decision
									Condition
									Multiple Condition

 Black box testing techniques
 equivalence parititioning  for example an application can accept values from -100 to +100 so we can partiion the input to -100 to -1 and 0 to 100. then we can pick a value from each paritiion
 
 
 boundary value analysis 
 Boundy value: if text accept -100 to 100 then first we use equivalence partition and use boundry values of those partition
 
 state transiton 
 
 
