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

