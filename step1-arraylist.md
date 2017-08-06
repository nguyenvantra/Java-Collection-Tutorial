# ArrayList

ArrayList là một phần trong **Java Collection Framework** và thuộc package **java.util**. Nó cung cấp cho chúng ta **dynamic arrays** trong Java. Măc dù nó có thể chậm hơn so với **array** nhưng nó vẫn có những ưu điểm khi làm việc với mảng.

## Những điểm quan trong trong ArrayList
- ArrayList kế thừa **AbstractList class** và implements **List interface**.
- Có thể khởi tạo ArrayList với kích thước cố định nhưng kích thước của ArrayList có thể **tăng lên** hoặc **thu hẹp** lại phụ thuộc vào cách thực thi trong ArrayList.
- Có thể chứa các phần tử trùng nhau.
- **Non synchronized**.
- Cho phép truy cập ngẫu nhiên theo vị trí **index**.
- Không sử dụng cho các kiểu dữ liệu nguyên thuỷ (**primitive**).

## ArrayList class declaration
Constructor | Description
------------ | -------------
```ArrayList()``` | Sử dụng khởi tạo một ArrayList rỗng
```ArrayList(Collection c)``` | Sử dụng khởi tạo ArrayList với các phần tử của Collection c
```ArrayList(int capacity)``` | Sử dụng khởi tạo ArrayList với kích thước cho trước

Example:
```java
// 1.ArrayList()
ArrayList list1 = new ArrayList<>();

// 2.ArrayList(Collection c)
ArrayList<String> dummyList = new ArrayList<>(Arrays.asList("Minh", "Xuan"));
ArrayList<String> list2 = new ArrayList<>(dummyList);

// 3.ArrayList(int capacity)
ArrayList list3 = new ArrayList<>(20);
```

## Method cơ bản trong ArrayList 
### 1. boolean add(Object o)
Thêm phần tử được chỉ định vào cuối danh sách
```java
ArrayList<String> list = new ArrayList<>();
// 1. boolean add(Object o)
list.add("Lan");
list.add("Hoa");
list.add("Nam");
System.out.println(list); // [Lan, Hoa, Nam]
```
### 2. void add(int index, Object element)
Thêm phần tử chỉ định vào vị trí được chỉ định trong danh sách
```java
ArrayList<String> list = new ArrayList<>();
list.add("Lan");
list.add("Hoa");
list.add("Nam");
// 2. void add(int index, Object element)
list.add(1, "Son");
System.out.println(list); // [Lan, Son, Hoa, Nam]
```
### 3. boolean addAll(Collection c)
Thêm tất cả các phần tử trong Collection vào cuối danh sách
```java
ArrayList<String> list = new ArrayList<>();
ArrayList<String> dummyList = new ArrayList<>(Arrays.asList("Minh", "Xuan"));
list.add("Lan");
list.add("Hoa");
list.add("Nam");
// 3. boolean addAll(Collection c)
list.addAll(dummyList);
System.out.println(list); // [Lan, Hoa, Nam, Minh, Xuan]
```
### 4. boolean addAll(int index, Collection c)
Thêm tất cả các phần tử trong Collection vào vị trí được chỉ định
```java
ArrayList<String> list = new ArrayList<>();
ArrayList<String> dummyList = new ArrayList<>(Arrays.asList("Minh", "Xuan"));
list.add("Lan");
list.add("Hoa");
list.add("Nam");
// 4. boolean addAll(int index, Collection c)
list.addAll(1, dummyList);
System.out.println(list); // [Lan, Minh, Xuan, Hoa, Nam]
```
### 5. void clear()
Xoá tất cả các phần tử trong danh sách
```java
list.add("Lan");
list.add("Hoa");
list.add("Nam");
System.out.println(list); // [Lan, Hoa, Nam]
// 5. void clear()
list.clear();
System.out.println(list); // []
```
### 6. Object clone()
Trả về shallow copy của ArrayList hiện tại.
```java
ArrayList<String> dummyList = new ArrayList<>(Arrays.asList("Minh", "Xuan"));
ArrayList<String> listClone = new ArrayList<>(dummyList.size());
// 6. Object clone()
listClone = (ArrayList<String>) dummyList.clone();
System.out.println(listClone); // [Minh, Xuan]
```
### 7. boolean contains(Object o)
Trả về **true** nếu như danh sách có chứa phần từ bằng với object o. Chính xác hơn, nó sẽ trả về true nếu và chỉ nếu danh sách có chứa ít nhất 1 phần tử e mà nó thỏa mãn biểu thức ```(o == null? e == null : o.equals(e))```.
```java
ArrayList<String> list = new ArrayList<>();
list.add("Lan");
list.add("Hoa");
list.add("Nam");
// 7.boolean contains(Object o)
list.contains("Darkness"); // false
list.contains("Hoa"); // true
```
### 8.Object get(int index)
Trả về phần tử ở vị trí **index** trong danh sách. Ngoại lệ **IndexOutOfBoundsException** sẽ được ném ra nếu như **index** truyền vào **vượt** quá phạm vi lưu trữ (index < 0 || index >= size())
```java
ArrayList<String> list = new ArrayList<>();
list.add("Lan");
list.add("Hoa");
list.add("Nam");
// 8.Object get(int index)
list.get(1); // Hoa
```
### 9. Object remove(int index)
Xóa bỏ phần từ tại vị trí **index** trong danh sách. Ngoại lệ **IndexOutOfBoundsException** sẽ được ném ra nếu như index truyền vào vượt quá phạm vi lưu trữ.
```java
ArrayList<String> list = new ArrayList<>();
list.add("Lan");
list.add("Hoa");
list.add("Nam");
// 9.Object remove(int index)
list.remove(1);
System.out.println(list); // [Lan, Nam]
```
### 10. int size()
Trả về số lượng phần tử có trong danh sách
```java
ArrayList<String> list = new ArrayList<>();
list.add("Lan");
list.add("Hoa");
list.add("Nam");
// 10. int size()
list.size(); // 3
```

Đây chỉ là những metho cơ bản của ArrayList để biết thêm truy cập [docs](http://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)

## So sánh Array và ArrayList
### 1.Những điểm khác biệt giữa **Array** và **ArrayList**

#### Resizable
- **Array**: Array is static in size, có nghĩa là **Array** có kích thước chiều dài cố định, không thể thay đổi kích thước array sau khi tạo đối tượng.
- **ArrayList**: ArrayList is dynamic in size, có nghĩa là không bị cố định kích thước có thể mở rộng hoặc thu hẹp.

#### Performance
Hiệu suất của array và arrayList phụ thuộc vào **operation**(hoạt động) mà nó thực hiện.
- **resize() opertation**: Tự động thay đổi kích thước trong **ArrayList** sẽ làm chậm hiệu suất vì nó sẽ sử dụng mảng tạm thời để sao chép các phần tử từ mảng cũ sang mảng mới
- **add() or get() operation**: Thêm một phần tử hoặc lấy ra một phần tử từ **Array** và **ArrayList** có hiệu xuất gần giống nhau.

#### Primitives
- **Array**: có thể chứa kiểu dữ liệu nguyên thuỷ cũng như đối tượng.
- **ArrayList**: không thể chứa kiểu dữ liệu nguyên thuỷ.

Xem ví dụ sau:
```java
ArrayList  arraylistobject = new ArrayList();
arraylistobject.add(23);
```
Đừng nhầm tưởng **ArrayList** sẻ thêm được kiểu dữ liệu nguyên thuỷ nhưng thực ra **JVM** thông qua **Autoboxing** chuyển đổi kiểu dữ liệu **int** thành một đối tượng **Integer**.

```java
ArrayList  arraylistobject = new ArrayList();
arraylistobject.add(new Integer(23));
```

#### Type-Safety
- **Array**: Array là một cấu trúc dữ liệu đồng nhất do đó nó sẽ chứa một đối tượng cụ thể hoặc một kiểu dữ liệu nguyên thuỷ cụ thể. Nếu bạn cố gắn lưu trữ kiểu dữ liệu khác nhau thì nó sẽ ném ra **ArrayStoreException**. Vậy **Array** không sử dụng **Generics**.

```java
String temp[] =  new String[2];  // creates a string array of size 2
temp[0] = new Integer(12); // throws ArrayStoreException, trying to add Integer object in String[] 
```

- **ArrayList**: Sử dụng **Generics** để đảm bảo kiểu dự liệu an toàn.

#### Multi-dimensional
- **Array**: cho phép.

```java
Integer addarrayobject[][] = new Integer[3][2];
addarrayobject[0][0]= new Integer(8);
```
- **ArrayList**: không cho phép.

#### Length
- **Array**: sử dụng **length variable** trả về chiều dài của **Array**.

```java
Integer arrayobject[] = new Integer[3];
arraylength= arrayobject.length   ; 
```
- **ArrayList**: sử dụng **size() method**.

```java
ArrayList  arraylistobject = new ArrayList();
arraylistobject.add(12); 
arraylistobject.size(); 
```

### 2.Những điểm giống nhau giữa **Array** và **ArrayList**

#### add and get method
- **Performance** của Array và ArrayList tương đồng nhau khi thực hiện **add** và **get** operations.

#### Duplicate elements
- Array và ArrayList đều cho phép dữ liệu trùng lặp.

#### Null Values
- Array và ArrayList có thể lưu giá trị **null** và sử dụng **index** để duyệt các phần tử.

#### Unordered

## References
[1. http://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html](http://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)

[2. http://javahungry.blogspot.com/2015/03/difference-between-array-and-arraylist-in-java-example.html](http://javahungry.blogspot.com/2015/03/difference-between-array-and-arraylist-in-java-example.html)

[3. http://www.geeksforgeeks.org/arraylist-in-java/](http://www.geeksforgeeks.org/arraylist-in-java/)

[4. https://www.tutorialspoint.com/java/util/java_util_arraylist.htm](https://www.tutorialspoint.com/java/util/java_util_arraylist.htm)





