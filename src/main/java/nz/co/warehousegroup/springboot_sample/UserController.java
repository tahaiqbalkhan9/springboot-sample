package nz.co.warehousegroup.springboot_sample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "User API")
@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@ApiOperation(value = "Base path of user API")
	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@RequestMapping("/users")
	public List<Integer> getUsersByIds() {
		return userService.getUserIds();
	}

	@RequestMapping("/user/{id}")
	public User getUser(@PathVariable(name = "id", required = true) Integer id) {
		return userService.get(id);
	}
}