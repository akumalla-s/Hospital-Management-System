# ASSIGNMENT 3 
# INFO LAB

## **CONTEXT** 
This application is a platform for people to find medical resource in different city and community. 
Encounter represent a visit to the doctor’s office. The vital signs timeline is linked to the encounters. Each Encounter will have a single Vital Sign component.  
  
## **REQUIREMENTS** 
*  Implement an application based on the given model with Java swing. 
    *  Patients are able to look for a doctor under the near hospitals 
    *  Doctors are able to diagnose and leave encounter record based on vital signs 
    *  Community admins are able to modify the information under a community 
    *  System admin should have all access(CRUD) to all resources in this application 
*  You’re free to have extension design based on the given model, but you’re not allowed to delete any element in the model. 
*  Your application is required to manage user data(CRUD). 
*  UI&UX will be considered as a part of grade. 
*  Data validation(Non-null check, basic data type check) 
*  Design different roles of users in this application:(System administrator, patient, hospital administrator, community administrator, etc) 

## **DESCRIPTION**
The following are actors and their functionalities involved our assignment.
1)	HospitalAdmin
    *	CRUD operation on a Hospital record in hospitalDirectory object.
2)	DoctorAdmin
    *	CRUD operation on a Doctor record in a doctorDirectory object.
3)	CommunityAdmin
    *	View, Update, Delete operations on either hospitalDirectory instances or Person instances.
4)	Person
    *	Register as a person specifying his house, community, city details.
5)	Patient
    *	Login using his personID to find a doctor and book appointment.
6)	Doctor
    *	Login using his/her doctorID to view patient appointments scheduled, view patient’s encounter history if any, enter vital signs for a patient which gets added into patient’s encounterHistory.
7)	System Admin
    *	Login to manage HospitalDirectory, DoctorDirectory, Hospitals in a community, Persons in a community.
    *	View patient encounter history, view doctor’s record.
   
## **SAMPLE FLOW**
1)	HospitalAdmin creates a hospital record and it will get inserted into hsopitalDirectory.
2)	DoctorAdmin creates a doctor record and it will get inserted into doctorDirectory.
3)	Person registers with his community details.
4)	CommunityAdmins can manage Hospitals, Persons under a community.
5)	Patient logs in using his personID to view and book an appointment with a doctor.
6)	Doctor logs in using his doctorID to view his scheduled appointments, view a patient’s encounterHistory if any, enter vital signs which gets added into patient’s encounterHistory.
7)	SystemAdmins can login using their credentials to perform CRUD operations on HospitalDirectory, DoctorDirectory, PersonDirectory. View patient’s encounterHistory, doctor’s appointment details.

## **ASSUMPTIONS MADE**
*	A Hospital needs to be exist in order to create a Doctor record.
*	A Person needs to register specifying his community details.
*	A Patient needs to register as a Person in order to book an appointment.

## **CLASS DIAGRAM**
![](/diagrams/classdiagram.jpg)

## **SEQUENCE DIAGRAM**
![](/diagrams/sequencediagram.jpg)
"# Hospital-Management-System" 
