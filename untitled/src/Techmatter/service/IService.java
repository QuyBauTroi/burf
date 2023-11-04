package Techmatter.service;

import java.util.Map;
import java.util.Scanner;

public interface IService<T> {
    void ínsert(Scanner scanner, Map<Integer,T> t);
    void update(Scanner scanner, Map<Integer,T> t);
    void delete(Scanner scanner, Map<Integer,T> t);
}
