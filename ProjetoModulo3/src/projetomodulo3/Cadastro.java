//******************************************************
//Instituto Federal de São Paulo - Campus Sertãozinho
//Disciplina......: M3LPBD
//Programação de Computadores e Dispositivos Móveis
//Aluno...........: JORGE AUGUSTO PEREIRA DE CARVALHO
//******************************************************
package projetomodulo3;

/**
 *
 * @author jorge
 */
public class Cadastro {
    
    private String disciplina;
    private int horas;
    private String curso;
    private int vagas;
    private String turno;
    
public void setDisciplina(String text) {
    disciplina = text;
    
}

public void setCurso(String text) {
        curso = text;
    
}

public void setHoras( int n){
    horas = n;
}

public void setTurno(String text) {
        turno = text;
    
}

public void setVagas(int v) {
    vagas = v;
} 
    
public String getDisciplina(){
    return disciplina;
}

public String getCurso(){
    return curso;
}

public String getTurno(){
    return turno;
}

public int getHoras(){
    return horas;
}

public int getVagas(){
    return vagas;
}


public String toString() {
    String msg = "Disciplina: " + disciplina + " / Curso: " + curso + " / Carga horaria: " + horas + " / Vagas: " + vagas + " / Turno: " + turno;
    return msg;
}

}
