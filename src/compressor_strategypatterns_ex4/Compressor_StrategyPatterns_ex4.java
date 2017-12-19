
package compressor_strategypatterns_ex4;




public class Compressor_StrategyPatterns_ex4 {
    
    public static void main(String[] args) {
        Compessor compressor=(Compessor) new RarCompressor();
        FileCompressor filecom=new FileCompressor(compressor);
        filecom.compressFile("Compress");
        
   //sxoliazw
   
    
}
