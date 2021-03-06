// CloudCoder - a web-based pedagogical programming environment
// Copyright (C) 2011-2015, Jaime Spacco <jspacco@knox.edu>
// Copyright (C) 2011-2015, David H. Hovemeyer <david.hovemeyer@gmail.com>
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU Affero General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU Affero General Public License for more details.
//
// You should have received a copy of the GNU Affero General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.

package org.cloudcoder.app.shared.model;

import java.io.Serializable;

/**
 * Information specifying an existing user to be registered
 * for a specified section/course.
 * 
 * @author David Hovemeyer
 */
public class CourseRegistrationSpec implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String username;
	private int courseId;
	private int section;
	private CourseRegistrationType registrationType;

	/**
	 * Constructor.
	 */
	public CourseRegistrationSpec() {
		
	}
	
	/**
	 * Set the username.
	 * 
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	
	/**
	 * Set the course id.
	 * 
	 * @param courseId the course id to set
	 */
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	
	/**
	 * @return the course id
	 */
	public int getCourseId() {
		return courseId;
	}
	
	/**
	 * Set the section number.
	 * 
	 * @param section the section number to set
	 */
	public void setSection(int section) {
		this.section = section;
	}
	
	/**
	 * @return the section number
	 */
	public int getSection() {
		return section;
	}
	
	/**
	 * Set the registration type.
	 * 
	 * @param registrationType the registration type to set
	 */
	public void setRegistrationType(CourseRegistrationType registrationType) {
		this.registrationType = registrationType;
	}
	
	/**
	 * @return the registration type
	 */
	public CourseRegistrationType getRegistrationType() {
		return registrationType;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof CourseRegistrationSpec)) {
			return false;
		}
		CourseRegistrationSpec other = (CourseRegistrationSpec) obj;
		return ModelObjectUtil.equals(this.username, other.username)
				&& this.courseId == other.courseId
				&& this.section == other.section
				&& this.registrationType == other.registrationType;
	}
	
	@Override
	public int hashCode() {
		return (username != null ? username.hashCode() : 0) +
				1049 * courseId +
				2663 * section +
				5441 * (registrationType != null ? registrationType.hashCode() : 0);
	}
}
