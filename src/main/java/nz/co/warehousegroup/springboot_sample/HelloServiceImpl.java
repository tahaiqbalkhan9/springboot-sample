package nz.co.warehousegroup.springboot_sample;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements UserService{

	@Override
	public List<Integer> getUserIds() {
		return Arrays.asList(1,2,3,4,5);
	}

	@Override
	public User get(Integer id) {
		User user = new User();
		user.setId(id);
		user.setFirst_name("Taha");
		user.setLast_name("Iqbal");
		user.setPassword("123456");
		
		return user;
	}

	
}
