package pr.iceworld.fernando;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pr.iceworld.fernando.repository.UserRepository;

public class Application {

	private static final Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
//		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
//		annotationConfigApplicationContext.register(UserRepository.class);
//		annotationConfigApplicationContext.refresh();
//
//		UserRepository userRepository = (UserRepository) annotationConfigApplicationContext.getBean("userRepository");
//		logger.info(JSON.toJSONString(userRepository.getUsers()));

		ClassPathXmlApplicationContext cpac = new ClassPathXmlApplicationContext("beans.xml");
//		UserRepository userRepository = (UserRepository) cpac.getBean("userRepository");
//		logger.info(JSON.toJSONString(userRepository.getUsers()));

	}
}
