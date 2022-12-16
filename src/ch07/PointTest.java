package ch07;

class PointTest {
    public static void main(String[] args) {
        Point3D p3 = new Point3D(1,2,3);
        System.out.println(p3.getLocation());
    }
}
// 조상 클래스
class Point {
    int x;
    int y;
    // 생성자
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    String getLocation() {
        return "x:" + x + ", y:" + y;
    }
}
// 자손 클래스
class Point3D extends Point {
    int z;
    // 생성자
    Point3D(int x, int y, int z) {
//        super(); // 에러, 조상클래스 기본생성자인 Point()가 없어
        super(x,y); // 조상클래스 생성자인 Point(int x,int y) 호출
        this.x = x;
        this.y = y;
        this.z = z;
    }
    // 오버라이딩
    String getLocation() {
        return "x:" + x + ", y:" + y + ", z:" +z;
    }
}