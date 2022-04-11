package io.javabrains.springbootstarter.topic;
import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
  
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			 new Topic("spring" , "Spring Framework" , "Spring Framework Description"),
			 new Topic("java" , "Core Java" , "Core Java Description"),
			 new Topic("javascript" , "JavaScript" , "JavaScript Description")
			  ) );
	
	public List<Topic> getAllTopics(){
		return topics ;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get(); 
	}

	public void addTopic(Topic topic) {
		topics.add(topic); 
	}

	public void updateTopic(String id, Topic topic) {
		for(int i = 0; i < topics.size(); i++) {
			Topic t = topics.get(i) ;
			if(t.getId().equals(id))
			{
				topics.set(i, topic) ;
				return ;
			}
		}
		
	}

	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
	}
	
	public Hybrid getAllDetails() {
		Hybrid h = new Hybrid() ;
		
//		List<Topic> topics = new ArrayList<>() ;
//		topicRepository.findAll()
//		.forEach(topics::add);
		
		if(topics.size() == 0)
			return null;
		
		h.setAllUsers(topics);
		Topic f = topics.get(0) ;
		h.setFirstUser(f);
		String fName = f.getName() ;
		h.setFirstUserName(fName);
		Map<String,Topic> map = new HashMap<>() ;
		
		for(int i=0 ; i<topics.size() ; i++)
		{
			Topic currTopic = topics.get(i) ;
			String Id = currTopic.getId() ;
			map.put(Id, currTopic) ;
		}
	    h.setAllUserMap(map);
	    Integer total = topics.size() ;
	    h.setTotalUsers(total);
	    return h ;
		
	}
	
   
	
}
