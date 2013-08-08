package uk.ac.shu.webarch.eregister
class RegisterEntry {

Student student
Long timestamp

	static constraints = {
student Maxsize: 50
timestamp(nullable: false, blank:false);
   }

    static mapping = {
	table 'student_register_entry'
	student column: 'student fk'
            }
    }
