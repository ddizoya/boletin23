package boletin23;

import java.io.IOException;

public class Boletin23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mantenimiento mant = new Mantenimiento();
        FicheroLibreria librohistoria = new FicheroLibreria("Hisotia del XXI", "Manuel Hernández", 12, 4);
        FicheroLibreria libroarte = new FicheroLibreria("Hisotia del arte", "Jacinta Flores", 17, 13);
        FicheroLibreria libromatematicas = new FicheroLibreria("Álgebra", "Anabel Hayato", 21, 11);
        mant.anadir("fich.txt", librohistoria);
        mant.anadir("fich.txt", libroarte);
        mant.anadir("fich.txt", libromatematicas);
        mant.consultar("fich.txt");
    }

}
