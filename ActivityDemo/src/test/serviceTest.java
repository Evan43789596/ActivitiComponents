import com.evan.oa.entity.Group;
import com.evan.oa.service.IBaseService;
import com.evan.oa.service.IGroupService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/applicationContext.xml", "classpath*:/springMVC.xml" })
public class serviceTest {

	@Autowired
	private IBaseService<Group> baseService;
	
	@Autowired
	private IGroupService groupService;
	
	@Test
	public void serviceTests() throws Exception{
		List<Group> list = this.groupService.getGroupList();
		System.out.println(list.size());
	}
}
