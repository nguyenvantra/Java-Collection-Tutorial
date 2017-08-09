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
## Method cơ bản trong Vector
Nhìn chung các method trong Vector tương tự như trong ArrayList. Dưới đây là một số method cơ bản của Vector.
### 1. boolean add(Object obj)
Thêm phần tử được chỉ định vào cuối danh sách
```java
Vector v = new Vector();
		
v.add("Alo");
v.add(2);
v.add("Darkness");

System.out.println(v); //[Alo, 2, Darkness]
```
### 2. void add(int index, Object obj)
Thêm phần tử chỉ định vào vị trí được chỉ định trong danh sách
### 3. boolean addAll(Collection c)
Thêm tất cả các phần tử trong Collection vào cuối danh sách
```java
ArrayList arr = new ArrayList();
arr.add("Alo");
arr.add(2);
arr.add("Darkness");
    
Vector v = new Vector();
v.addAll(arr);

System.out.println(v); //[Alo, 2, Darkness]
```
### 4. boolean addAll(int index, Collection c)
Thêm tất cả các phần tử trong Collection vào vị trí được chỉ định
### 5. void clear()
Xoá tất cả các phần tử trong danh sách
```java
Vector v = new Vector();
		
v.add("Alo");
v.add(2);
v.add("Darkness");

System.out.println(v); //[Alo, 2, Darkness]
v.clear();
System.out.println(v); //[]
```
### 6. Object get(int index)
Trả về phần tử ở vị trí **index** trong danh sách.
```java
Vector v = new Vector();
		
v.add("Alo");
v.add(2);
v.add("Darkness");

System.out.println(v.get(0)); // Alo
```
### 7. boolean remove(int index)
Xóa bỏ phần từ tại vị trí **index** trong danh sách.

Đây chỉ là những method cơ bản của Vector để biết thêm truy cập [docs](http://docs.oracle.com/javase/8/docs/api/java/util/Vector.html)

## So sánh Vector và ArrayList
### 1.Những điểm khác biệt giữa **Vector** và **ArrayList**
#### Synchronization

