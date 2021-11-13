package com.nuc.zbd1913041440_exp_6;

import com.nuc.zbd1913041440_exp_6.entity.zbdBook;
import com.nuc.zbd1913041440_exp_6.entity.zbdType;
import com.nuc.zbd1913041440_exp_6.entity.zbdUser;
import com.nuc.zbd1913041440_exp_6.mapper.zbdBookMapper;
import com.nuc.zbd1913041440_exp_6.mapper.zbdUserMapper;
import com.nuc.zbd1913041440_exp_6.service.zbdBookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Zbd1913041440Exp6ApplicationTests {

    @Autowired
    zbdUserMapper zbdUserMapper;

    @Autowired
    zbdBookMapper zbdBookMapper;

    @Autowired
    zbdBookService zbdBookService;

    @Test
    void contextLoads() {
    }

    @Test
    void login(){
        System.out.println(zbdUserMapper.login("admin", "123456"));
    }

    @Test
    void register(){
        Integer zhangjiayi = zbdUserMapper.register("zhangjiayi", "123456", 2);
        System.out.println(zhangjiayi);
    }

    @Test
    void findAllBooks(){
        List<zbdBook> allBooks = zbdBookMapper.findAllBooks();
        System.out.println(allBooks);
    }

    @Test
    void findAllUsers(){
        List<zbdUser> allUsers = zbdUserMapper.findAllUsers();
        System.out.println(allUsers);
    }

    @Test
    void addbook(){
        zbdBook zbdBook = new zbdBook(6,"ss",44,"ss",2);
        zbdBookMapper.addBook(zbdBook);
    }

    @Test
    void addUser(){
        zbdUser zbdUser = new zbdUser("ss","ss",2);
        zbdUserMapper.addUser(zbdUser);
    }

    @Test
    void delUser(){
        zbdUserMapper.delUser(5);
    }

    @Test
    void setUser(){
        zbdUser zbdUser = new zbdUser(3,"aaa","aaa",2);
        zbdUserMapper.setUser(zbdUser);
    }

    @Test
    void delBook(){
        zbdBookMapper.delBook(6);
    }

    @Test
    void setBook(){
        zbdBook zbdBook = new zbdBook(4,"555",555,"555",3);
        zbdBookMapper.setBook(zbdBook);
    }

    @Test
    void findBook(){
        List<zbdBook> aa = zbdBookMapper.findBooks("技能");
        System.out.println(aa);
    }

    @Test
    void Type(){
        String bookTypeById = zbdBookMapper.findBookTypeById(2);
        System.out.println(bookTypeById);
    }

    @Test
    void delType(){
        zbdBookService.delType(4);
    }

    @Test
    void findType(){
        List<zbdType> type = zbdBookMapper.findType("文");
        System.out.println(type);
    }

    @Test
    void findUser(){
        List<zbdUser> a = zbdUserMapper.findUser("a");
        System.out.println(a);
    }
}
