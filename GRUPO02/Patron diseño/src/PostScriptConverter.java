public class PostScriptConverter extends Converter {

    public PostScriptConverter(String pId, String pDocument) {
        super(pId, pDocument);
    }

    public void makeLine(){
        System.out.println("Hacer Línea PostScript");
    }  
    
    public void makeParagraph (){
        System.out.println("Hacer párrafo PostScript");
    }

    public void makeTable (){
        System.out.println("Hacer tabla PostScript");
    }

    @Override
    public String toString() {
        return "PostScriptConverter ["+super.toString ()+"]";
    } 

    
}
    

