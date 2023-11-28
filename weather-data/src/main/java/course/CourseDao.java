package course;

public interface CourseDao {

    void save(Course course);

    Course findById(long id);

}
