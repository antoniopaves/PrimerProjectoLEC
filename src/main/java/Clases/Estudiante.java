/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author 22775980-1
 */
public class Estudiante {
    private int EstudianteID; 
    private String Nombre;
    String Apellido1;
    String Apellido2;
    String Curso; 
    String Correo; 
    String Run; 
    String Birthday; 
    int Edad; 
    float Peso;
    float Estatura;
    
    public Estudiante(int EstudianteID, String Nombre, String Apellido1, String Apellido2, String Curso, String Correo, String Run, String Birthday, int Edad, float Peso,float Estatura) {
   this.EstudianteID = EstudianteID;
   this.Nombre = Nombre;
   this.Apellido1 = Apellido1;
   this.Apellido2 = Apellido2;
   this.Curso = Curso;
   this.Correo = Correo;
   this.Run = Run;
   this.Birthday = Birthday;
   this.Edad = Edad;
   this.Peso = Peso;
   this.Estatura = Estatura;
   
   
   
    }    
    
       @Override
    public String toString() {
        return  "Id Estudiante: " + EstudianteID + " " + "Nombre: " + Nombre + "\n" + 
                " Primer Apellido: " + Apellido1 + " Segundo Apellido: " + Apellido2 + "\n" + 
                " Curso: " + Curso + " Correo: " + Correo + "\n" + 
                " Run: " + Run + " Fecha de Nacimiento: " + Birthday + "\n" + 
                " Edad: " + Edad + " Peso: "+ Peso + " Estatura: " + Estatura;
    }
    
}
