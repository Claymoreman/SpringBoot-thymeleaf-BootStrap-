package com.nuc.zbd1913041440_exp_6.service.impl;

import com.nuc.zbd1913041440_exp_6.entity.zbdBook;
import com.nuc.zbd1913041440_exp_6.entity.zbdType;
import com.nuc.zbd1913041440_exp_6.mapper.zbdBookMapper;
import com.nuc.zbd1913041440_exp_6.service.zbdBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class zbdBookServiceImpl implements zbdBookService {

    @Autowired
    zbdBookMapper zbdBookMapper;

    @Override
    public List<zbdBook> findAllBooks() {
        return zbdBookMapper.findAllBooks();
    }

    @Override
    public boolean addBook(zbdBook zbdBook) {
        return zbdBookMapper.addBook(zbdBook);
    }

    @Override
    public Integer delBook(Integer id) {
        return zbdBookMapper.delBook(id);
    }

    @Override
    public Integer setBook(zbdBook zbdBook) {
        return zbdBookMapper.setBook(zbdBook);
    }

    @Override
    public List<zbdBook> findBooks(String text) {
        return zbdBookMapper.findBooks(text);
    }

    @Override
    public String findTypeById(Integer id) {
        return zbdBookMapper.findBookTypeById(id);
    }

    @Override
    public List<zbdType> findType() {
        return zbdBookMapper.findBookType();
    }

    @Override
    public Integer delType(Integer id) {
        return zbdBookMapper.delBookType(id);
    }

    @Override
    public Integer addType(zbdType zbdType) {
        return zbdBookMapper.addType(zbdType);
    }

    @Override
    public Integer setType(zbdType zbdType) {
        return zbdBookMapper.setType(zbdType);
    }

    @Override
    public List<zbdType> findTypes(String text) {
        return zbdBookMapper.findType(text);
    }


}
