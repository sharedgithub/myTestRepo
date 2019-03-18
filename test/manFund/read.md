Most of the defects occurs during requiremtn and design phase. phase containment is when we restrict defect to the phase where they are caught

Quality is degree by which a system/component/process meets user/customer requirements. Testing provide way to measure the quality of the system. No of defects, test coverage, pass/fail tests

In some cases software testing is not just a googd way to reduce ristks to the quality of the system to an acceptable level:testing can be required to meed contractual or legal requirement or industry specific standards.

System Testing includes both Functional tests as well as Non-Functional tests.

Functional testing ensures that the product/application meets customer and business requirements. On the other hand, non-functional testing is done to verify if the product stands up to customer's expectations in terms of quality, reliability usability, performance, compatibility, etc.

Risk is something which can lead to negative concequences.

Quality of software testing: 
1) interpersonal and communication skill: knowing how to communicate is neccessary but knowledge of what to say and when to say is what is requrired here...0
2) Should be able to catch details
3) Explorer 

error occurs due to human mistake. Like if incorrect password is entered that is erro
bug defect fault are the same thing and occurs due to incorrect system implementation or error in development like for the above scenario if the error  message is different 
failure is the diffrence between constumer expection and actual product

# 7 principles
 Testing shows presence of defect: yes it does but it does not gurantee your application is defect free
 
 Absence of error fallacy: testing is fine ..but the product should be usable to the end users
 Pestcide paradox: same test executed again and again reduces their defect detection effectiveness
 Context dependent: Type of testing depends on the type of product
 Defect clustering: Defects has tendence to form clusters accross the application
 Early testing:
 Exhaustive testing not possible
 
 

in static testing code is not executed...like testing FRS or code
in dynamic testing code is executed

 severity is defined in terms of financial loss, damage to environment, company’s reputation and loss of life.
 priority of a defect is related to how quickly a bug should be fixed
 When a defect is of high severity, most likely it will also have a high priority.
 
 but High Severity and low Priority is also possible 
 This happens when the bug causes major problems, but it only happens in very rare conditions or situations, for example, customers who use very old browsers cannot continue with their purchase of a product. Because the number of customers with very old browsers is very low, it is not a high priority to fix the issue.
 
 High Prioirty and Low Severity
 This could happen when, for example, the logo or name of the company is not displayed on the website. It is important to fix the issue as soon as possible, although it may not cause a lot of damage.
 
 
 BRS(Business Requirement Specifications)  		|SRS(Software req Spec)			  	| FRS (functional)
 createdy By Business Analyst					|System analyst						| developers and engineers
 Whole Requirement or customer whished			|Functional and Non Functional Req	| sequence of operations to be followed for a process|
 
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


User Acceptance is defined as a type of testing performed by the Client/endusers to certify the system with respect to the requirements that was agreed upon. This testing happens in the final phase of testing before moving the software application to the Market or Production environment.
The main purpose of this testing is to validate the end to end business flow. It does NOT focus on cosmetic errors, Spelling mistakes or System testing. This testing is carried out in a separate testing environment with production like data setup. It is a kind of black box testing where two or more end users will be involved.

Return on investment can be calculated in durations or money
 ther formula for this is (GAIN-INVESTMENT)/INVESTMENT

 GAIN in the time takes with AUtomation (this will also include effort for manual cases which can not be automated)
 

 defect life cycle
 
 Raised -> Reviewd-> Open-> Assigned-> fixed-> closed=> accepted
 
 Black box testing techniques
 equivalence parititioning  for example an application can accept values from -100 to +100 so we can partiion the input to -100 to -1 and 0 to 100. then we can pick a value from each paritiion
 
 
 boundary value analysis 
 Boundy value: if text accept -100 to 100 then first we use equivalence partition and use boundry values of those partiiton
 
 state transiton 
 
 Verification is evaluation against functional and software requirements
 Validation is against user requirement specifications
 
