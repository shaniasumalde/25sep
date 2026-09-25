
    public class Main {

        public static Student findOldest(Student[] students) {
            Student oldest = students[0];
            for (Student s : students) {
                if (s.age > oldest.age) {
                    oldest = s;
                }
            }
            return oldest;
        }

        public static Student findById(Student[] students, String id) {
            for (Student s : students) {
                if (s.studentId != null && s.studentId.equals(id)) {
                    return s;
                }
            }
            return null;
        }

        public static void main(String[] args) {
            Student s1 = new Student("Anna", 21);
            Student s2 = new Student("Peter", 19);
            Student s3 = new Student("Maria", 23);

            Student[] students = {s1, s2, s3};

            System.out.println("Alle studerende:");
            for (Student s : students) {
                s.printInfo();
            }

            Student oldest = findOldest(students);
            System.out.println("\nÆldste studerende:");
            oldest.printInfo();
        }
    }