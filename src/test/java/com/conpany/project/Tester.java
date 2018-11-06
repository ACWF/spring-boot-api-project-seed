package com.conpany.project;


import com.company.project.Application;
import com.company.project.dao.InfoUserMapper;
import com.company.project.model.InfoUser;
import com.company.project.service.InfoUserService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * 单元测试继承该类即可
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@Transactional
@Rollback
public abstract class Tester {
  @Autowired
  InfoUserMapper infoUserMapper;

  @Autowired
  InfoUserService infoUserService;

  @Autowired
  InfoUser infoUser;

  public void userAddTest() {
    InfoUser user = new InfoUser();
    user.setUsername("koon");
  }
}



