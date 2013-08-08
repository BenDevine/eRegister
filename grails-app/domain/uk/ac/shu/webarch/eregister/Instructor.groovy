package uk.ac.shu.webarch.eregister
class Enrollment {

Student student
Course course

    static constraints = {
student Maxsize: 50
course Maxsize: 100
    }

	static mapping = {
	table 'course_student'
	student column: 'student fk'
	course column: 'course fk'
              }
   }
