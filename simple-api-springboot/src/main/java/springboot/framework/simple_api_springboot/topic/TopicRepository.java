package springboot.framework.simple_api_springboot.topic;

import org.springframework.data.repository.CrudRepository;


public interface TopicRepository extends CrudRepository<Topic, String> {

}
