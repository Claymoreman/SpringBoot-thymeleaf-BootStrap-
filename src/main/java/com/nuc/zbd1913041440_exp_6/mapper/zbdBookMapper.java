package com.nuc.zbd1913041440_exp_6.mapper;

import com.nuc.zbd1913041440_exp_6.entity.zbdBook;
import com.nuc.zbd1913041440_exp_6.entity.zbdType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 朱博达
 */
@Mapper
public interface zbdBookMapper {

    /**
     * 查询所有图书信息
     * @return
     */
    public List<zbdBook> findAllBooks();

    /**
     * 添加图书信息
     * @return
     */
    public boolean addBook(zbdBook zbdBook);

    /**
     * 删除图书信息
     * @return
     */
    public Integer delBook(Integer id);

    /**
     * 修改图书信息
     * @return
     */
    public Integer setBook(zbdBook zbdBook);

    /**
     * 查找图书信息
     * @return
     */
    public List<zbdBook> findBooks(String text);

    /**
     * 通过id查找图书类型信息
     * @return
     */
    public String findBookTypeById(Integer id);

    /**
     * 查找所有图书类型信息
     * @return
     */
    public List<zbdType> findBookType();

    /**
     * 删除图书类型信息
     * @return
     */
    public Integer delBookType(Integer id);

    /**
     * 添加图书类型信息
     * @return
     */
    public Integer addType(zbdType zbdType);

    /**
     * 修改图书类型信息
     * @return
     */
    public Integer setType(zbdType zbdType);

    /**
     * 搜索图书类型信息
     * @return
     */
    public List<zbdType> findType(String text);

}
