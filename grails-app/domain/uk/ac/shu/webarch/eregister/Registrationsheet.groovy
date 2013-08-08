package uk.ac.shu.webarch.eregister
class RegistrationSheet {

Course course
Date sheetDate
Set signatories
String notes

    static constraints = {
course Maxsize: 100
course(nullable:false, blank:false);
sheetDate(nullable:false, blank:false);
notes(nullable:true, blank:true);
          }

	static mapping = {
	notes column: 'course_desc', type:'text'
        }
     }
