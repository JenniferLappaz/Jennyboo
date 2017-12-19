
package compressor_strategypatterns_ex4;



public class FileCompressor {
    
    public final Compessor compessor;
    
    
    
    public FileCompressor (Compessor compessor){
        this.compessor=compessor;
    }
    
    public void compressFile (String text){
        compessor.compress(text);
    }
}
