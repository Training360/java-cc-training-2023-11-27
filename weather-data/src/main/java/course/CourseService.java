package course;

public class CourseService {

    // Új kurzus meghirdetése, kurzus neve, jelentkezők maximális száma

    // Több jelentkező tud egyszerre jelentkezni

    private CourseDao courseDao;

    public CourseService(CourseDao courseDao) {
        this.courseDao = courseDao;
    }

    public void announceCourse(AnnounceCourseCommand command) {
        Course course = Course.announce(command);
        courseDao.save(course);
    }

    //@Transactional
    // Idempotens - kétszer beküldöd ugyanazt, kétszer ugyanazt kapod vissza
    public EnrollResult enroll(EnrollCommand command) {
        Course course = courseDao.findById(command.getCourseId());
        return course.enroll(command);
    }
}
