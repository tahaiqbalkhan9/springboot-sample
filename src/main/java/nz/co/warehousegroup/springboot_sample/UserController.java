package nz.co.warehousegroup.springboot_sample;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

@Api(tags = "User API")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "Base path of user API")
    @RequestMapping("/")
    public String index(HttpServletRequest request) {
        String hostName = "";
        try {
            hostName = InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return "Greetings from Spring Boot | Running on " + hostName;
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