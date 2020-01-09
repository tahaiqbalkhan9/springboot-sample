package nz.co.warehousegroup.springboot_sample;

import java.util.List;

public interface UserService {

	List<Integer> getUserIds();
	User get(Integer id);
}
