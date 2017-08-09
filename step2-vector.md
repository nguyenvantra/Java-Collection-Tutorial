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
### 1. Những điểm khác biệt giữa **Vector** và **ArrayList**
#### Synchronization
Vector **hỗ trợ synchronization** còn ArrayList thì không. Điều này có nghĩa là tại một thời điểm chỉ có một thread có thể truy cập và thực thi Vector trong khi đó ArrayList **không hỗ trợ synchronization** thì nhiều thread có thể hoạt động trên một ArrayList cùng một lúc.
### Performance
Về hiệu năng thì ArrayList nhanh hơn Vector vì ArrayList không hỗ trợ synchronization.
### Resize
ArrayList và Vector đều có thể tăng lên hoặc co lại kích thước để duy trì sự tối ưu bộ nhớ. Nhưng cách thay đổi kích thước là khác nhau ArrayList gia tăng 50% kích thước mảng khi thực hiện **resize** còn Vector con số đó là 100%.
## References
[1. http://docs.oracle.com/javase/8/docs/api/java/util/Vector.html](http://docs.oracle.com/javase/8/docs/api/java/util/Vector.html)

[2. http://www.geeksforgeeks.org/java-util-vector-class-java/](http://www.geeksforgeeks.org/java-util-vector-class-java/)

[3. http://www.geeksforgeeks.org/vector-vs-arraylist-java/](http://www.geeksforgeeks.org/vector-vs-arraylist-java/)

[4. https://www.tutorialspoint.com/java/util/java_util_vector.htm](https://www.tutorialspoint.com/java/util/java_util_vector.htm)

