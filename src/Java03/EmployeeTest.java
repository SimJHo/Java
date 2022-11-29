package Java03;

//- 클래스 Employee(직원)은 클래스 Regular(정규직)와 Temporary(비정규직)의 상위 클래스
//- 필드: 이름, 나이, 주소, 부서, 월급 정보를 필드로 선언
//- 생성자 : 이름, 나이, 주소, 부서를 지정하는 생성자 정의
//- 메소드 printInfo() : 인자는 없고 자신의 필드 이름, 나이, 주소, 부서를 출력

class Employee {
    String name;
    int age;
    String addr;
    String dept;
    int salary;

    public Employee(String name, int age, String addr, String dept) {
        this.name = name;
        this.age = age;
        this.addr = addr;
        this.dept = dept;
    }

    public Employee(int salary) {
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("주소 : " + addr);
        System.out.println("부서 : " + dept);
    }
}

class Regular extends Employee{
    public Regular(String name, int age, String addr, String dept) {
        super(name, age, addr, dept);
    }

    public void setSalary(int salary){
        super.salary = salary;
    }

    public void printInfo(){
        super.printInfo();

        System.out.println("정규직");
        System.out.println("월급 : " + super.salary);
    }
}

class Temporary extends Employee{
    int time;
    int timePay;

    public Temporary(String name, int age, String addr, String dept) {
        super(name, age, addr, dept);
        timePay = 10000;
    }

    public void setTime(int time){
        this.time = time;
        super.salary = time * timePay;
    }

    public void printInfo(){
        super.printInfo();

        System.out.println("비정규직");
        System.out.println("일한 시간 : " + time);
        System.out.println("월급 : " + super.salary);
    }
}

class EmplyeeTest {
    public static void main(String[] args) {

        Employee employee = new Employee("홍길동", 19, "서울 뉴욕시", "개발 1팀");
        employee.printInfo();

        Regular kim = new Regular("김길동", 19, "서울 뉴욕시", "개발 1팀");
        kim.setSalary(10000);
        kim.printInfo();

        Temporary lee= new Temporary("이길동", 19, "서울 뉴욕시", "개발 1팀");
        lee.setTime(5);
        lee.printInfo();
    }
}

