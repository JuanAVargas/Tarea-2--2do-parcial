public class Notas{
    private int estudiantes;
    public Notas(int estudiante){
        estudiantes = estudiante;
    }
    public int [] thisisarreglo(){
        int [] notas = new int [estudiantes];
        return notas;
    }
    public void ponerNotas(int nota, int estudiante, int a[]){
        int numEstArre = estudiante - 1;
        a[numEstArre] = nota;
    }
    public double sacarPromedio (int a[]){
        double x = 0;
        double suma = 0;
        for(int i = 0; i < a.length; i = i + 1){
            suma = a[i] + x;
            x = suma;
        }
        double promedio = suma/a.length;
        return promedio;
    }
    public double promedioNotasAprobadas(int a[]){
        double x = 0;
        double suma = 0;
        int verificador = 0;
        for(int i = 0; i < a.length; i = i + 1){
            if(a[i] > 51){
                suma = a[i] + x;
                x = suma;
                verificador = verificador + 1;
            }
        }
        double promedio = suma/verificador;
        return promedio;
    }
    public double nroReprobados(int a[]){
        int repro = 0;
        for (int i = 0; i <a.length; i = i + 1){
            if(a[i] < 51){
                repro++;
            }
        }
        return repro;
    }
    public double nroAprobados(int a[]){
        int apro = 0;
        for(int i = 0; i < a.length; i = i + 1){
            if(a[i] > 51){
                apro++;
            }
        }
        return apro;
    }
    public double notaMayor(int a[]){
        int x = 0;
        for(int i = 0; i < a.length; i = i + 1){
            int mayor = Math.max(a[i], x);
            x = mayor;
        }
        return x;
    }
}

