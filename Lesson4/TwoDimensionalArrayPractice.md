# 二维数组练习题 | Two-Dimensional Array Practice

## 题目：二维数组的转置 | Problem: Matrix Transposition

### 题目描述 | Problem Description

请实现一个方法，用于计算给定二维数组的转置。

Please implement a method to calculate the transpose of a given two-dimensional array.

### 要求 | Requirements

1. **方法签名**：`public static int[][] transpose(int[][] matrix)`
2. **功能**：返回一个新的二维数组，是输入矩阵的转置
3. **输入**：一个非空的二维数组 `matrix`，其中所有行的长度相同
4. **输出**：输入矩阵的转置矩阵
5. **定义**：矩阵的转置是将原矩阵的行和列互换，即原矩阵的第 i 行第 j 列的元素变为新矩阵的第 j 行第 i 列

### 示例 | Example

#### 输入输出示例 | Input/Output Example

**示例1**：
```java
// 输入：3x2 矩阵
int[][] input = {
    {1, 2},
    {3, 4},
    {5, 6}
};

// 输出：2x3 转置矩阵
int[][] output = transpose(input);
// 结果：
// {
//     {1, 3, 5},
//     {2, 4, 6}
// }
```

**示例2**：
```java
// 输入：2x2 矩阵
int[][] input = {
    {1, 2},
    {3, 4}
};

// 输出：2x2 转置矩阵
int[][] output = transpose(input);
// 结果：
// {
//     {1, 3},
//     {2, 4}
// }
```

**示例3**：
```java
// 输入：1x3 矩阵
int[][] input = {
    {1, 2, 3}
};

// 输出：3x1 转置矩阵
int[][] output = transpose(input);
// 结果：
// {
//     {1},
//     {2},
//     {3}
// }
```

### 提示 | Hint

1. **矩阵维度**：如果输入矩阵是 `m x n`，那么转置矩阵是 `n x m`

2. **实现步骤**：
   - 获取输入矩阵的行数 `rows` 和列数 `cols`
   - 创建一个 `cols x rows` 的新矩阵
   - 遍历输入矩阵，将元素 `matrix[i][j]` 放入新矩阵的 `newMatrix[j][i]` 位置
   - 返回新矩阵

3. **注意事项**：
   - 不要修改原输入矩阵
   - 处理不同大小的矩阵，包括行和列不同的情况

### 相关知识 | Related Knowledge

- 二维数组的创建和访问
- 矩阵的基本概念和操作
- 数组的遍历和复制
- 嵌套循环的使用

### 评分标准 | Scoring Criteria

- **正确性**（40分）：能正确计算任意非空矩阵的转置
- **代码质量**（30分）：代码清晰，逻辑合理，注释充分
- **性能**（20分）：时间复杂度 O(m*n)，空间复杂度 O(m*n)，其中 m 是行数，n 是列数
- **鲁棒性**（10分）：能处理不同大小的矩阵，包括单行或单列的情况

---

## 答案参考 | Reference Answer

```java
public static int[][] transpose(int[][] matrix) {
    // 获取输入矩阵的行数和列数
    int rows = matrix.length;
    int cols = matrix[0].length;
    
    // 创建转置矩阵，维度为 cols x rows
    int[][] result = new int[cols][rows];
    
    // 遍历输入矩阵，填充转置矩阵
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            // 将原矩阵的 (i,j) 位置元素放入转置矩阵的 (j,i) 位置
            result[j][i] = matrix[i][j];
        }
    }
    
    return result;
}
```

### 解析 | Explanation

1. **获取维度**：首先获取输入矩阵的行数 `rows` 和列数 `cols`
2. **创建结果矩阵**：根据转置的定义，创建一个 `cols x rows` 的新矩阵
3. **填充元素**：使用嵌套循环遍历输入矩阵，将每个元素放入转置矩阵的对应位置
4. **返回结果**：返回填充完成的转置矩阵

### 测试代码 | Test Code

```java
public static void main(String[] args) {
    // 测试示例1：3x2矩阵
    int[][] input1 = {
        {1, 2},
        {3, 4},
        {5, 6}
    };
    int[][] output1 = transpose(input1);
    printMatrix(output1);
    
    System.out.println();
    
    // 测试示例2：2x2矩阵
    int[][] input2 = {
        {1, 2},
        {3, 4}
    };
    int[][] output2 = transpose(input2);
    printMatrix(output2);
    
    System.out.println();
    
    // 测试示例3：1x3矩阵
    int[][] input3 = {
        {1, 2, 3}
    };
    int[][] output3 = transpose(input3);
    printMatrix(output3);
}

public static void printMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
}
```

### 输出结果 | Output

```
1 3 5 
2 4 6 

1 3 
2 4 

1 
2 
3 
```

这个实现能正确处理各种大小的矩阵，并且代码清晰易读。