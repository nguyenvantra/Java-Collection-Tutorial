# Vector
Giống như [ArrayList](https://github.com/nguyenvantra/Java-Collection-Tutorial/blob/master/step1-arraylist.md) Vector là một phần trong **Java Collection Framework** và thuộc package **java.util**. Nó cung cấp cho chúng ta **dynamic arrays** trong Java.

## Những điểm quan trọng trong Vector
- Vector kế thừa **AbstractList class** và implements **List interface**.
- Kích thướt của Vector không cố định có thể **tăng lên** hoặc **thu hẹp** lại phụ thuộc vào cách thực thi trong Vector.
- **Synchronized**.
- Cho phép truy cập ngẫu nhiên theo vị trí **index**.

## Vector class declaration
Constructor | Description
------------ | -------------
```Vector()``` | Sử dụng khởi tạo một Vector rỗng với kích thước là 10
```Vector(int size)``` | Sử dụng khởi tạo Vector với kích thước là size
```Vector(int size, int incr)``` | Sử dụng khởi tạo Vector với kích thước là size và số phần tử được cấp phát  mỗi khi một vector được resize là incr
```Vector(Collection c)``` | Sử dụng khởi tạo Vector với các phần tử của Collection c

Example:
```java
// 1.Vector()
Vector list1 = new Vector();

// 2.Vector(int size)
Vector list2 = new Vector(20);

// 3.Vector(int size, int incr)
Vector list3 = new Vector(20, 10);

// 4.Vector(Collection c)
Vector dummyList = new Vector(Arrays.asList("Alo", 12, "Darkness"));
Vector list4 = new Vector(dummyList);
```
