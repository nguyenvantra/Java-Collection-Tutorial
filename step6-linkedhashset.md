# LinkedHashSet
LinkedHashSet là một **HashTable** và **LinkedList**. Nó extends **HashSet** và implements **Set interface**.
## Những điểm quan trong trong LinkedHastSet
- Không cho phép **duplicate value** và chấp nhận **null value**.
- Duy trì thứ tự chèn các phần tử.
- LinkedHashSet còn implements **Searlizable** và **Cloneable interfaces**.
## LinkedHashSet class declaration
Constructor | Description
------------ | -------------
```LinkedHashSet()``` | Sử dụng khởi tạo một LinkedHashSet rỗng, **initial capacity** mặt định là 16 và **load factor** là 0.75
```LinkedHashSet(Collection c)``` | Sử dụng khởi tạo LinkedHashSet với các phần tử của Collection c
```LinkedHashSet(int initialCapacity)``` | Sử dụng khởi tạo một LinkedHashSet rỗng với **initial capacity** được chỉ định và **load factor** là 0.75
```LinkedHashSet(int initialCapacity, float loadFactor)``` | Sử dụng khởi tạo một LinkedHashSet rỗng với **initial capacity** được chỉ định và **load factor** được chỉ định

Example:
```java
// 1. LinkedHashSet()
LinkedHashSet list1 = new LinkedHashSet();

// 2. LinkedHashSet(Collection c)
ArrayList dummyList = new ArrayList(Arrays.asList("Alo", 3, "Darkness"));
LinkedHashSet list2 = new LinkedHashSet(dummyList);

// 3. LinkedHashSet(int initialCapacity)
LinkedHashSet list3 = new LinkedHashSet(30);

// 4.LinkedHashSet(int initialCapacity, float loadFactor)
LinkedHashSet list4 = new LinkedHashSet(20, 0.9f);
```
## Method cơ bản trong LinkedHashSet
LinkedHashSet extends từ HashSet nên kế thừa method từ HashSet. Một số method cơ bản của LinkedHashSet. 
### 1. boolean add(Object o)
Thêm phần tử được chỉ định vào trong LinkedHashSet nếu phần tử đã tồn tại trong LinkedHashSet thì trả về false
### 2. void clear()
Remove tất cả phần tử trong LinkedHashSet
### 3. boolean contains(Object o)
Trả về **true** nếu LinkedHashSet chứa phần tử được chỉ định
### 4. boolean remove(Object o)
Gỡ bỏ phần tử được chỉ định nếu phần tử tồn tại trong LinkedHashSet
### 5. Iterator iterator()
Trả về một **iterator**
### 6. int size()
Trả về số phần tử có trong LinkedHashSet

Đây chỉ là những method cơ bản của LinkedHashSet để biết thêm truy cập [docs](http://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashSet.html)

