# LinkedList
LinkedList kế thừa **AbstractSequentialList class** và implements **List interface**. Cung cấp một cấu trúc dữ liệu **linked-list** (dạng danh sách được liên kết).
## LinkedList class declaration
Constructor | Description
------------ | -------------
```LinkedList()``` | Sử dụng khởi tạo một LinkedList rỗng
```LinkedList(Collection c)``` | Sử dụng khởi tạo LinkedList với các phần tử của Collection c

Example:
```java
// 1. LinkedList()
LinkedList list1 = new LinkedList();

// 2. LinkedList(Collection c)
ArrayList dummyList = new ArrayList(Arrays.asList("Alo", 2, "Darkness"));
LinkedList list2 = new LinkedList<>(dummyList);
```
## Method cơ bản trong LinkedList