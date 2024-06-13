/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package student;

/**
 *
 * @author Aluno
 */
public class Student {
    // Variáveis para armazenar as informações do aluno
    private String fName; // Primeiro nome
    private String lName; // Sobrenome
    private int stuId; // ID do aluno
    private String stuStatus; // Status do aluno (ativo ou inativo)

    // Construtor da classe Student
    public Student(String fName, String lName, int stuId, String stuStatus) {
        this.fName = fName;
        this.lName = lName;
        this.stuId = stuId;
        this.stuStatus = stuStatus;
    }

    // Método para obter o nome completo do aluno
    public String getFullName() {
        return fName + " " + lName;
    }

    // Método para definir o status do aluno
    public void setStuStatus(String stuStatus) {
        this.stuStatus = stuStatus;
    }

    // Método para exibir as informações do aluno
    public void displayInfo() {
        System.out.println("Nome do Aluno: " + getFullName() +
                           " ID do Aluno: " + stuId +
                           " Status do Aluno: " + stuStatus);
    }

    // Método principal para teste
    public static void main(String[] args) {
        // Criando um objeto Student
        Student student1 = new Student("Lisa", "Palombo", 123456789, "Active");
        
        // Exibindo as informações do aluno
        student1.displayInfo();
    }
}

