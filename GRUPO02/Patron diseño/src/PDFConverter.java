public class PDFConverter extends Converter {


public PDFConverter(String pId, String pDocument) {
        super(pId, pDocument);
    }

    public void makeLine(){
        System.out.println("Hacer Línea PDF");
    }  
    
    public void makeParagraph (){
        System.out.println("Hacer párrafo PDF");
    }

    public void makeTable (){
        System.out.println("Hacer tabla PDF");
    }

    @Override
    public String toString() {
        return "PDFConverter ["+super.toString ()+"]";
    } 

    
}
