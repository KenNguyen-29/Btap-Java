package b3.student;

/**
 * B3 - Bai tap Student:
 * Ho ten, diem toan, ly, hoa.
 */
public class Student {
    public String name;
    public float math;
    public float physics;
    public float chemistry;

    public Student(String name, float math, float physics, float chemistry) {
        this.name = name;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
    }

    public float average() {
        return (math + physics + chemistry) / 3;
    }

    public void print() {
        System.out.printf(
                "Ho ten: %s | Toan: %.1f | Ly: %.1f | Hoa: %.1f | TB: %.2f%n",
                name, math, physics, chemistry, average());
    }
}
