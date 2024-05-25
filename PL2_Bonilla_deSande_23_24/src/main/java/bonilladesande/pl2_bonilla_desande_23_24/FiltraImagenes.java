/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bonilladesande.pl2_bonilla_desande_23_24;

import java.io.File;
import javax.swing.filechooser.FileFilter;

import java.io.File;
import javax.swing.filechooser.FileFilter;

public class FiltraImagenes extends FileFilter {

    public final static String JPEG = "jpeg";
    public final static String JPG = "jpg";
    public final static String GIF = "gif";
    public final static String TIFF = "tiff";
    public final static String TIF = "tif";
    public final static String PNG = "png";

    @Override
    public boolean accept(File f) {
        if (f.isDirectory()) {
            return true;
        }

        String extension = getExtension(f);
        if (extension != null) {
            if (extension.equals(TIFF)
                    || extension.equals(TIF)
                    || extension.equals(GIF)
                    || extension.equals(JPEG)
                    || extension.equals(JPG)
                    || extension.equals(PNG)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public String getDescription() {
        return "Seleccione la foto.";
    }

    String getExtension(File f) {
        String ext = null;
        String s = f.getName();
        
        //BUSCA EL ÚLTIMO PUNTO DEL ARCHIVO
        int i = s.lastIndexOf('.');
        
        //COGE LO QUE VA DESPUÉS DEL PUNTO EN EL ARCHIVO SELECCIONADO Y LO CONVIERTE A MINÚSCULAS, PARA DETECTAR LA EXTENSIÓN DEL ARCHIVO.
        if (i > 0 && i < s.length() - 1) {
            ext = s.substring(i + 1).toLowerCase();
        }
        return ext;
    }
}
