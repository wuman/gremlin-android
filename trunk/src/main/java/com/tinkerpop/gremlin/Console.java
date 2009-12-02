package com.tinkerpop.gremlin;

import com.tinkerpop.gremlin.statements.EvaluationErrorException;
import com.tinkerpop.gremlin.statements.SyntaxErrorException;
import jline.ConsoleReader;
import org.apache.commons.jxpath.JXPathException;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @author Marko A. Rodriguez (http://markorodriguez.com)
 * @version 0.1
 */
public class Console {

    private static final String INDENT = "         ";
    private static final int TAB_LENGTH = 2;
    private static final String PRINT_RETURN = "==>";
    private static final String PROMPT = "gremlin> ";
    private static final String QUIT = "quit";
    private static final String SINGLE_SPACE = " ";
    private static final String EMPTY_STRING = "";

    public static void main(String[] args) throws IOException {

        ConsoleReader reader = new ConsoleReader();
        reader.setBellEnabled(false);
        reader.setUseHistory(true);
        GremlinEvaluator gremlinEvaluator = new GremlinEvaluator();

        String line = "";
        System.out.println();
        System.out.println("         \\,,,/");
        System.out.println("         (o o)");
        System.out.println("-----oOOo-(_)-oOOo-----");

        while (line != null) {
            //System.out.println("DEPTH: " + gremlinEvaluator.getDepth());
            if (gremlinEvaluator.inStatement())
                line = reader.readLine(INDENT + generateIndentation(gremlinEvaluator.getDepth() * TAB_LENGTH));
            else {
                line = reader.readLine(PROMPT);
                if (line.equalsIgnoreCase(QUIT))
                    break;
            }
            if (line.length() > 0) {
                try {
                    List results = gremlinEvaluator.evaluate(line);
                    if (null != results) {
                        if (results.size() > 0) {
                            for (Object o : results) {
                                if (o instanceof Map) {
                                    Map map = (Map) o;
                                    for (Object key : map.keySet()) {
                                        System.out.println(PRINT_RETURN + key + "=" + map.get(key));
                                    }
                                } else {
                                    System.out.println(PRINT_RETURN + o);
                                }
                            }
                        }
                    }
                } catch (JXPathException e) {
                    System.out.println(e.getMessage());
                } catch (SyntaxErrorException e) {
                    System.out.println(e.getMessage());
                } catch (EvaluationErrorException e) {
                    System.out.println(e.getMessage());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    private static String generateIndentation(int spaces) {
        String spaceString = EMPTY_STRING;
        for (int i = 0; i < spaces; i++) {
            spaceString = spaceString + SINGLE_SPACE;
        }
        return spaceString;
    }
}
