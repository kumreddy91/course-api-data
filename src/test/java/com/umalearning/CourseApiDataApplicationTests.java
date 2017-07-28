package com.umalearning;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.umalearning.springbootstarter.course.Course;
import com.umalearning.springbootstarter.course.CourseService;
import com.umalearning.springbootstarter.topic.Topic;
import com.umalearning.springbootstarter.topic.TopicService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseApiDataApplicationTests {

	@Autowired
	CourseService courseServiceTest;
	
	@Autowired
	TopicService topicService;
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void courseApiStuff(){
		String j = "jaffa";
		assertEquals(j,"jaffa");
	}
	
	@Test
	public void testCourseService(){
		List<Course> courses= courseServiceTest.getAllCourses("java");
		assertEquals(courses.size(), 1);
	}
	
	@Test
	public void testTopicService(){
		List<Topic> topics  = topicService.getAllTopics();
		assertEquals(topics.size(), 2);
	}

}
