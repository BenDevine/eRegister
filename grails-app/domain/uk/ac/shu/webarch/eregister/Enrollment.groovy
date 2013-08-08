package uk.ac.shu.webarch.eregister
class Enrollment {

Student student
Course course

    static constraints = {
student Maxsize: 50
Course Maxsize: 100
 }
static hasMany = [classes: RegClass]
	static mappedBy = [classes: 'course']
	static mapping = {
	table 'course'
	courseName column: 'course_name'
	courseCode column: 'mapped_course_code'
	description colmn: 'course_desc' , type: 'text'
       }
}
