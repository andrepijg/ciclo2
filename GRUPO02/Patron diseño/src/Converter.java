public class Converter {

    private String id;
    private String document;

    public Converter (String pId, String pDocument){
        this.id = pId;
        this.document = pDocument;
    }

    public String getId() {
        return id;
    }

        public String getDocument() {
        return document;
    }

    public void makeLine (){

    }

    public void makeParagraph(){

    }

    public void makeTable (){

    }

    @Override
    public String toString() {
        return "Converter [document=" + document + ", id=" + id + "]";
    }

    
    
}
