package springboot.framework.simple_api_springboot.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {

//	List<Course> findByName(String name);
	List<Course> findByTopicId(String topicId);
}
