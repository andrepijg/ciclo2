public class ASCIIConverter extends Converter {

    public ASCIIConverter(String pId, String pDocument) {
        super(pId, pDocument);
    }

    public void makeLine(){
        System.out.println("Hacer Línea ASCII");
    }  
    
    public void makeParagraph (){
        System.out.println("Hacer párrafo ASCII");
    }

    public void makeTable (){
        System.out.println("Hacer tabla ASCII");
    }

    @Override
    public String toString() {
        return "ASCIIConverter ["+super.toString ()+"]";
    }

    
}

