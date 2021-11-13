package com.nuc.zbd1913041440_exp_6.controller;

import com.nuc.zbd1913041440_exp_6.entity.zbdBook;
import com.nuc.zbd1913041440_exp_6.entity.zbdType;
import com.nuc.zbd1913041440_exp_6.service.zbdBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    zbdBookService zbdBookService;

    @RequestMapping("/user-table")
    public String userTable(Model model){
        List<zbdBook> allBooks = zbdBookService.findAllBooks();
        model.addAttribute("allBooks",allBooks);
        return "booktable";
    }

    @RequestMapping("/admin-table")
    public String adminTable(Model model){
        List<zbdBook> allBooks = zbdBookService.findAllBooks();
        List<zbdType> type = zbdBookService.findType();
        model.addAttribute("allBooks",allBooks);
        model.addAttribute("types",type);
        return "booktable-admin";
    }

    @RequestMapping("/admin-tab")
    public String adminTable(){
        return "booktable-admin";
    }

    @RequestMapping("/admin-index")
    public String adminIndex(){
        return "admin-index";
    }

    @RequestMapping("/user-index")
    public String userIndex(){
        return "user-index";
    }

    @RequestMapping("/add")
    public String addBook(Model model){
        List<zbdType> type = zbdBookService.findType();
        model.addAttribute("types",type);
        return "book-add";
    }

    @PostMapping("/insert")
    public String addBook(@RequestParam("bookId")Integer bookId,
                          @RequestParam("bookName") String bookName,
                          @RequestParam("bookPrice") Integer bookPrice,
                          @RequestParam("bookType") Integer bookType,
                          @RequestPart("bookCover") MultipartFile bookCover) throws Exception {
        zbdBook zbdBook = new zbdBook(bookId,bookName,bookPrice,null,bookType);


        if(!bookCover.isEmpty()){
            String originalFilename = bookCover.getOriginalFilename();
            String fileName = UUID.randomUUID().toString() + originalFilename;
            File bookCoverPath = new File("E:\\BookCover\\" + fileName);
            bookCover.transferTo(bookCoverPath);
            zbdBook.setZbdBookCoverPath(fileName);
            zbdBookService.addBook(zbdBook);
        }
        return "redirect:/book/admin-table";
    }

    @RequestMapping("/del")
    public String delBook(@RequestParam("bookId")Integer id){
        zbdBookService.delBook(id);
        return "redirect:/book/admin-table";
    }

    @RequestMapping("/set")
    public String setUser(@RequestParam("Bookid")Integer id,
                          @RequestParam("BookName")String bookName,
                          @RequestParam("BookPrice")Integer bookPrice,
                          @RequestParam("BookType")Integer bookType,
                          @RequestPart("BookCover") MultipartFile bookCover) throws Exception {
        zbdBook zbdBook = new zbdBook(id,bookName,bookPrice,null,bookType);
        if(!bookCover.isEmpty()){
            String originalFilename = bookCover.getOriginalFilename();
            String fileName = UUID.randomUUID().toString() + originalFilename;
            File bookCoverPath = new File("E:\\BookCover\\" + fileName);
            bookCover.transferTo(bookCoverPath);
            zbdBook.setZbdBookCoverPath(fileName);
            zbdBookService.setBook(zbdBook);
        }
        return "redirect:/book/admin-table";
    }


    @RequestMapping("/find")
    public String findBooks1(@RequestParam("text")String text,Model model){
        List<zbdBook> allbooks = zbdBookService.findBooks(text);
        model.addAttribute("allBooks",allbooks);
        return "booktable-admin";
    }

    @RequestMapping("/type")
    public String findType(Model model){
        List<zbdType> type = zbdBookService.findType();
        model.addAttribute("types",type);
        return "booktype-admin";
    }

    @RequestMapping("/type-find")
    public String findType(@RequestParam("text")String text, Model model){
        List<zbdType> type = zbdBookService.findTypes(text);
        model.addAttribute("types",type);
        return "booktype-admin";
    }

    @RequestMapping("/type1")
    public String findType1(Model model){
        List<zbdType> type = zbdBookService.findType();
        model.addAttribute("types",type);
        return "booktype";
    }

    @RequestMapping("/type-del")
    public String delType(@RequestParam("typeId")Integer typeId){
        zbdBookService.delType(typeId);
        return "redirect:/book/type";
    }

    @RequestMapping("/type-add")
    public String addType(){
        return "type-add";
    }


    @RequestMapping("/type-add1")
    public String addType1(@RequestParam("id")Integer id,
                          @RequestParam("type")String type){
        zbdType zbdType = new zbdType(id,type);
        zbdBookService.addType(zbdType);
        return "redirect:/book/type";
    }

    @RequestMapping("/type-set")
    public String setType(@RequestParam("id")Integer id,
                           @RequestParam("type")String type){
        zbdType zbdType = new zbdType(id,type);
        zbdBookService.setType(zbdType);
        return "redirect:/book/type";
    }
}
