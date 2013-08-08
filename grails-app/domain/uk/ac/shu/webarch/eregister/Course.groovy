package uk.ac.shu.webarch.eregister

class Course {

	String courseName
	String courseCode
	String description
	Set classes

static constraints = {
courseCode maxSize: 28
courseName maxSize: 50
description maxSize: 300
classes maxSize: 500

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
