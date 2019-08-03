package pl.sda.filewriter;

public class FileWriterSingleton {

    private static FileWriterSingleton instance;

    private FileWriterSingleton(){

    }

    public synchronized static FileWriterSingleton getInstance(){
        if(instance == null){
            System.out.println("Jestem w if");
            instance = new FileWriterSingleton();
        }

        return instance;
    }


}
