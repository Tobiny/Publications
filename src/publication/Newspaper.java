package publication;
//


public class Newspaper extends Publication {
    private String sections;
    private String editor;


    //Getters
    public String getEditor() {
        return editor;
    }
    public String getSections() {
        return sections;
    }

    //Setters
    public void setEditor(String editor) {
        this.editor = editor;
    }
    public void setSections(String sections) {
        this.sections = sections;
    }
}
