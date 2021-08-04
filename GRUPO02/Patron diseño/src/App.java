import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        

        ArrayList<Converter> documentos = new ArrayList<>();

        Converter objDoc1 = new ASCIIConverter("01", "Tesis");
        Converter objDoc2 = new PostScriptConverter ("1","lectura");
        Converter objDoc3 = new PDFConverter ("1","lectura");

        documentos.add(objDoc1);
        documentos.add(objDoc2);
        documentos.add(objDoc3);

        // System.out.println(documentos.size());

        // System.out.println(" ----------------------");
        
        // for (int i = 0; i < documentos.size(); i++) {
        // System.out.println(documentos.get(i).toString());
        // }

        // System.out.println(" ----------------------");

        // documentos.forEach((doc) -> {
        //     System.out.println(doc.toString());
        // });
        
        // System.out.println(" ----------------------");

        // for (Converter doc : documentos){
        //     System.out.println(doc.toString());
        // }
        
        // //-------------------------------------------

        // Converter[] convertidor = new Converter [3]; 

        // convertidor[0] = new ASCIIConverter ("1","lectura");
        // convertidor[1] = new PostScriptConverter ("1","lectura");
        // convertidor[2] = new PDFConverter ("1","lectura");

    // --------------------------------------------------
    System.out.println("Reader");
    Reader lector = new Reader ("2", documentos.get(1)); // Para que me de el otro resultado debo cambiar la posición del objeto en el array list
    lector.parseInput();

    // Otra forma de hacerlo

        Reader lector0 = new Reader ("1", documentos.get(0));
        Reader lector1 = new Reader ("2", documentos.get(1));
        Reader lector2 = new Reader ("3", documentos.get(2));
        lector0.parseInput();
        lector1.parseInput();
        lector2.parseInput();

    }


    }


