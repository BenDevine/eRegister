package uk.ac.shu.webarch.eregister
class RegClass {

String name
Instructor classInstructor
Course course
Set enrolledStudents

static constraints = {
name maxSize: 50
classInstructor maxSize: 50
course maxSize: 100
enrolledStudents maxSize: 200

    }
static hasMany = [
  ]
    static mappedBy = [
  ]
    static mapping = {
	classInstructor column: 'instructor_fk'
	course column: 'course_fk'
                }
       }
