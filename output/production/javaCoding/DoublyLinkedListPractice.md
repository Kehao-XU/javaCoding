# 双向链表练习题 | Doubly Linked List Practice

## 题目：实现双向链表的删除操作 | Problem: Implement Delete Operation for Doubly Linked List

### 题目描述 | Problem Description

请在现有的 `DLList` 类中实现一个 `deleteFirst` 方法，用于删除链表的第一个元素。

Please implement a `deleteFirst` method in the existing `DLList` class to remove the first element of the linked list.

### 要求 | Requirements

1. **方法签名**：`public void deleteFirst()`
2. **功能**：删除链表的第一个元素
3. **边界情况**：
   - 如果链表为空（只有哨兵节点），不执行任何操作
   - 如果链表只有一个元素，删除后链表变为空
4. **返回值**：无
5. **其他**：确保删除后双向链表的 `prev` 和 `next` 指针正确更新，同时更新 `size` 字段

### 示例 | Example

#### 输入输出示例 | Input/Output Example

```java
// 创建链表：1 → 2 → 3 → null
DLList<Integer> list = new DLList<>(1);
list.addFirst(2);
list.addFirst(3);
System.out.println("删除前大小：" + list.size());  // 输出：3
list.printList();  // 输出：3, 2, 1

// 删除第一个元素
list.deleteFirst();
System.out.println("删除后大小：" + list.size());  // 输出：2
list.printList();  // 输出：2, 1

// 再次删除
list.deleteFirst();
System.out.println("删除后大小：" + list.size());  // 输出：1
list.printList();  // 输出：1

// 再次删除，链表变为空
list.deleteFirst();
System.out.println("删除后大小：" + list.size());  // 输出：0
list.printList();  // 无输出

// 再次删除，不执行任何操作
list.deleteFirst();
System.out.println("删除后大小：" + list.size());  // 输出：0
```

### 提示 | Hint

1. **双向链表的删除操作**需要同时更新两个节点的指针：
   - 前一个节点的 `next` 指针
   - 后一个节点的 `prev` 指针

2. **哨兵节点**的存在使得边界情况的处理更加简单，不需要额外检查 `null` 指针。

3. **删除第一个元素的步骤**：
   - 获取要删除的节点（哨兵节点的下一个节点）
   - 更新哨兵节点的 `next` 指针，指向要删除节点的下一个节点
   - 更新新的第一个节点的 `prev` 指针，指向哨兵节点
   - （可选）将删除节点的 `prev` 和 `next` 指针置为 `null`（有助于垃圾回收）
   - 更新 `size` 字段

### 相关知识 | Related Knowledge

- 双向链表的结构和操作
- 哨兵节点的使用
- 指针操作和内存管理
- 边界情况的处理

### 评分标准 | Scoring Criteria

- **正确性**（40分）：方法能正确删除第一个元素，处理所有边界情况
- **代码质量**（30分）：代码清晰，逻辑合理，注释充分
- **性能**（20分）：时间复杂度 O(1)，空间复杂度 O(1)
- **完整性**（10分）：正确更新 `size` 字段，确保链表结构的完整性

---

## 答案参考 | Reference Answer

```java
public void deleteFirst() {
    // 检查链表是否为空
    if (size == 0) {
        return;
    }
    
    // 获取要删除的节点（第一个元素）
    StuffNode firstNode = sentiNode.next;
    
    // 更新哨兵节点的next指针
    sentiNode.next = firstNode.next;
    
    // 更新新的第一个节点的prev指针
    firstNode.next.prev = sentiNode;
    
    // 可选：帮助垃圾回收
    firstNode.prev = null;
    firstNode.next = null;
    
    // 更新大小
    size--;
}
```

### 解析 | Explanation

1. **边界检查**：首先检查链表是否为空，如果为空则直接返回。
2. **获取节点**：获取要删除的第一个节点。
3. **更新指针**：
   - 哨兵节点的 `next` 指向要删除节点的下一个节点
   - 新的第一个节点的 `prev` 指向哨兵节点
4. **清理**：将删除节点的指针置为 `null`，有助于垃圾回收。
5. **更新大小**：减少 `size` 字段的值。

这样就完成了双向链表的第一个元素删除操作，时间复杂度为 O(1)，因为只需要常数时间的指针操作。