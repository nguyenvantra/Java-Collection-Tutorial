# TreeSet
TreeSet là một phần trong Java Collection Framework và thuộc package **java.util**. Là một dạng Set được xây dựng dựa trên cấu trúc dữ liệu cây (tree) và nó implements **SortedSet interface**.
## Những điểm quan trọng trong TreeSet
- TreeSet implements SortedSet interface không cho phép **duplicate value**.
- TreeSet không đảm bảo thứ tự chèn vào của các phần tử, nhưng các phần tử trong TreeSet sẻ được sắp xếp.
- TreeSet không cho phép **null value**.
- TreeSet dựa trên cấu trúc dữ liệu cây (tree) nó giống như **Red-Black Tree** vì vậy các hoạt động như **add**, **remove**, **search** mất O(Log n) thời gian, và hoạt động in n phần tử theo thứ tự sắp xếp mất O(n) thời gian.

## TreeSet class declaration 
Constructor | Description
------------ | -------------
```TreeSet()``` | Sử dụng khởi tạo một TreeSet rỗng, các phần tử được sắp xếp theo thứ tự tự nhiên
```TreeSet(Collection c)``` | Sử dụng khởi tạo TreeSet với các phần tử của Collection c
```TreeSet(Comparator comparator)``` | Sử dụng khởi tạo một TreeSet rỗng, được sắp xếp theo Comparator được chỉ định
```TreeSet(SortedSet s)``` | Sử dụng khởi tạo TreeSet mà chứa các phần tử của SortedSet