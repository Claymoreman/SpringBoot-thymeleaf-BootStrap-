package com.nuc.zbd1913041440_exp_6.service;


import com.nuc.zbd1913041440_exp_6.entity.zbdBook;
import com.nuc.zbd1913041440_exp_6.entity.zbdType;

import java.util.List;

/**
 * @author 朱博达
 */
public interface zbdBookService {
    public List<zbdBook> findAllBooks();

    public boolean addBook(zbdBook zbdBook);

    public Integer delBook(Integer id);

    public Integer setBook(zbdBook zbdBook);

    public List<zbdBook> findBooks(String text);

    public String findTypeById(Integer id);

    public List<zbdType> findType();

    public Integer delType(Integer id);

    public Integer addType(zbdType zbdType);

    public Integer setType(zbdType zbdType);

    public List<zbdType> findTypes(String text);
}
