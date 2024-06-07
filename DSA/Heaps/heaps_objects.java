import java.util.*;
public class heaps_objects {
    
    static class Student implements Comparable<Student>
    {
        String name;
        int rank;

        Student(String name, int rank)
        {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2)
        {
            return this.rank-s2.rank;
        }
    }

    public static void main(String args[])
    {
        PriorityQueue<Student> lst = new PriorityQueue<>();
        lst.add(new Student("abc", 1000));
        lst.add(new Student("def", 200));
        lst.add(new Student("ghi", 500));
        lst.add(new Student("jkl", 800));


        while (!lst.isEmpty())
        {
            System.out.println(lst.peek().name + "->" + lst.peek().rank);
            lst.remove();
        }
    }

}
