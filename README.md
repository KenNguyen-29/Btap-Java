# Bài tập Java (B1 – B2 – B3)

Giải bài tập theo 3 bài giảng PDF.

## Cấu trúc

```
src/
  b1/          # Tổng quan Java
  b2/          # Ngôn ngữ Java (biến, mảng, chuỗi, Scanner)
  b3/
    student/   # Lớp Student
    geometry/  # Hình học + kế thừa
```

## Biên dịch

```bash
javac -d out src/b1/*.java src/b2/*.java src/b3/student/*.java src/b3/geometry/*.java
```

## Chạy từng bài

### B1 – Tổng quan
```bash
java -cp out b1.HelloName An
java -cp out b1.Fibonacci
```

### B2 – Ngôn ngữ
```bash
java -cp out b2.ValidateNumber
java -cp out b2.AgeCalculator
java -cp out b2.ArrayExercises
java -cp out b2.ParseName
java -cp out b2.ArrayAdvanced
```

### B3 – OOP
```bash
java -cp out b3.student.StudentDemo
java -cp out b3.geometry.HinhDemo
```
