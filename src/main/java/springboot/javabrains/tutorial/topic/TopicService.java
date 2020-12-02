package springboot.javabrains.tutorial.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service //singleton ie., instance created only once
public class TopicService {
	
	private List<Topic> topics = new ArrayList<>( Arrays.asList( //spring mvc converted from list to json response
			new Topic("spring","Spring Framework","SF description"),
			new Topic("java","Core Java","Java description"),
			new Topic("javascript","Javascript","JS description")
			));
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(Topic topic, String id) {
		for (int i =0;i<topics.size();i++) {
			Topic t = topics.get(i);
			if( t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}	
	}

	public void deleteTopic(String id) {
		topics.removeIf(t-> t.getId().equals(id));
	}
}
