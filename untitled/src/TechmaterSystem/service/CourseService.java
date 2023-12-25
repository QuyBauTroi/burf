package TechmaterSystem.service;

import TechmaterSystem.entities.Course;
import TechmaterSystem.entities.OpeningScheduled;
import TechmaterSystem.entities.UserDetailCourse;

import java.util.Map;

public class CourseService {
    public void displayCourseStartDay(Map<Integer, Course> courses) {
        for (Map.Entry<Integer, Course> entry : courses.entrySet()) {
            Course course = entry.getValue();
            System.out.println("Course ID: " + course.getId() + ", Start Date: " + course.getTimeLine());
        }
    }

    public void displayCourseStartDay(Map<Integer, Course> courses, Map<Integer, UserDetailCourse> userDetailCourses, Map<Integer, OpeningScheduled> openingSchedules) {
        for (Map.Entry<Integer, Course> entry : courses.entrySet()) {
            Course course = entry.getValue();

            // Assuming there is a corresponding UserDetailCourse and OpeningSchedule
            UserDetailCourse userDetailCourse = userDetailCourses.get(course.getId());
            OpeningScheduled openingSchedule = openingSchedules.get(course.getId());

            System.out.println("Course ID: " + course.getId() +
                    ", Start Date: " + course.getTimeLine() +
                    ", User Detail: " + (userDetailCourse != null ? userDetailCourse.toString() : "N/A") +
                    ", Opening Schedule: " + (openingSchedule != null ? openingSchedule.toString() : "N/A"));
        }
    }
}
