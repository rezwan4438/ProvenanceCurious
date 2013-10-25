import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        PythonProvenanceLexer lex = new PythonProvenanceLexer(new ANTLRFileStream("D:\\Users\\ewi1462\\workspace\\pythonProvenance\\src\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        PythonProvenanceParser g = new PythonProvenanceParser(tokens, 49100, null);
        try {
            g.file_input();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}