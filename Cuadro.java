public class Cuadro {

private String titulo;
private int anioRealizacion;
private boolean restaurado;

public Cuadro(String nombreDelCuadro, int fechaDeRealizacion){
    titulo = nombreDelCuadro;
    anioRealizacion = fechaDeRealizacion;
    restaurado = false;
}

public String getTitulo() {
    return titulo;
}

public int getAnioRealizacion() {
    return anioRealizacion;
}

public boolean getRestaurado() {
    return restaurado;
}

public void setTitulo (String nuevoTitulo){
    titulo = nuevoTitulo;
}

public void caducidadTasacion (int aniosDeValidezTasacion){
    int anioCaducidadTasacion = anioRealizacion + aniosDeValidezTasacion;
} 

public void setRestaurado() {
    if(restaurado == false){
        restaurado = true;
    }
    else{
        restaurado = false;
    }
}

public void imprimeInformacion (){
    System.out.println("El cuadro " + titulo + " realizado en el año " + anioRealizacion + " ha sido restaurado " + restaurado );
}

public String estadoObjeto(){
    String cadena = "El cuadro " + titulo + " realizado en el año " + anioRealizacion + ", ha sido restaurado " + restaurado;
    return cadena;
}

}