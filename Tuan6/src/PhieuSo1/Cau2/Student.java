package PhieuSo1.Cau2;

import java.io.Serial;
import java.io.Serializable;

//Triển khai giao diện Serializable để thực hiện cơ chế tuần tự hóa
public class Student implements Serializable {
        @Serial
        private static final long serialVersionUID = 1L;
        private int id;
        private String name;
        private String address;
        private int age;

        public Student() {
        }

        public Student(int id, String name, String address, int age) {
                this.id = id;
                this.name = name;
                this.address = address;
                this.age = age;
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getAddress() {
                return address;
        }

        public void setAddress(String address) {
                this.address = address;
        }

        public int getAge() {
                return age;
        }

        public void setAge(int age) {
                this.age = age;
        }

        public String toString() {
                return "Student@[id=" + id + " , name=" + name + ", "
                        + "address= " + address + ",age =" + age + "]";
        }
}
