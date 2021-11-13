# SpringBoot-thymeleaf-BootStrap
## 图书信息管理子系统
一、功能需求：
1.图书管理：包括图书类型管理、每本图书详细信息管理
 （1）图书类型管理：图书类型信息增、删、改、查询；
 （2）图书详细信息管理：图书信息的增、删、改、查询；
    a.其中图书信息包括图书编号、图书名称、图书类型、图书价格、图书封皮图片
    b.查询要求可以按单条件查询（例如按图书编号或图书类型查询）；按多条件查询，同时满足多个条件查询，例如上面5个条件中选择3个（图书名称、图书类型、图书价格（价格按某一范围））或选择两个条件（图书类型、图书价格（价格按某一范围）），查询结果满足条件的可能有多条数据。
    c.图书类型管理及每本图书信息增、删、改操作必须由具有系统管理员权限的用户完成，具有普通权限的用户不能执行管理操作。

2.用户管理：包括两类用户：具有普通权限的用户和具有系统管理员权限的用户。
 （1）用户权限分为0和1两种，0表示系统管理员权限，1表示普通用户权限。
例如：张三可以登录到系统，以系统管理员身份登录进去，可以进行图书管理；以普通用户身份登录，则只能浏览图书信息，查询图书信息（简单查询和高级查询）。
 （2）普通用户、系统管理员用户均可有多个。
 （3）用户信息（包括用户ID、用户名称、密码、用户权限）管理：增、删、改、查操作。

3.具有普通用户权限的用户可以完成注册、登录，信息浏览、查询功能；
  具有系统管理员权限的用户可以完成图书管理、用户管理功能。

4.退出系统，用户注销。
