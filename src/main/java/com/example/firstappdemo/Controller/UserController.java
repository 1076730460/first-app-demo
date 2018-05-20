package com.example.firstappdemo.Controller;

import com.example.firstappdemo.Util.UserDto;
import com.example.firstappdemo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
  private UserDao userDao;
    @RequestMapping("testRelation")
   public List<UserDto> testRelation(int page, int size) throws Exception {
       Pageable pageable = new PageRequest(page, size);
       return userDao.testRelation(pageable);
   }
    public static <T> List<T> castEntity(List<Object[]> list, Class<T> clazz) throws Exception {
        List<T> returnList = new ArrayList<T>();
        Object[] co = list.get(0);
        Class[] c2 = new Class[co.length];

        //确定构造方法
        for(int i = 0; i < co.length; i++){
            c2[i] = co[i].getClass();
        }

        for(Object[] o : list){
            Constructor<T> constructor = clazz.getConstructor(c2);
            returnList.add(constructor.newInstance(o));
        }

        return returnList;
    }
}

