package BaitapBuoi14;

import BaitapBuoi14.enitities.Students;
import BaitapBuoi14.service.StudentManagementService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<Integer, Students> studentMap=new HashMap<>();
        StudentManagementService service = new StudentManagementService();
        service.inputStudentManagementService(studentMap,scanner);
    }
}
