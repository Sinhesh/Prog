package hw;
// ����������� ����������
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// ��������� �����
public class FirstSteps {
	// ��������� ����� main
    public static void main(String[] args) {
    	// ������� ������ � ���������� Murzik ���� Cat
    		Cat cat = new Cat("Murzik"); 
    	// ������� ������ �� �����, ������������ ��� � ������
    		System.out.println(cat.toString());      
    		}

    public static class Cat
    {
    	// ��������� � ������ Cat ����    
    	private String name;   
    	public Cat(String name) {   
    		// ����������� ������       
    		this.name = name;   
    		}   
    	// ������� ���   
    	public String toString() {
    		return name;    
    		}
    	}
    }
