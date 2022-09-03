package com.javatrainer;

public enum Langage {
    PHP ("langage PHP", "PHPSTORM"),
    PYTHON ("langage PYTHON", "ANACONDA"),
    JAVA ("langage JAVA", "INTELLIJI");

   private String name = "";
   private String editor = "";
    Langage(String name, String editor){
        this.name = name;
        this.editor = editor;

    }

    public void getEditor() {
        System.out.println("Editor : "+ editor);
    }

    @Override
    public String toString() {
        return name.toString();
    }
}
