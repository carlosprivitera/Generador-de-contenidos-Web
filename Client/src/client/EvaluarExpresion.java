package client;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JOptionPane;

public class EvaluarExpresion {
    private ScriptEngineManager manager = new ScriptEngineManager();
    private ScriptEngine engine = manager.getEngineByName("js");
    private String resultado = null;
    public EvaluarExpresion() {
        super();
    }
    public String getResultado(String expresion, float x, float y) {
        engine.put("x", x);
        engine.put("y", y);
        try {
          resultado = engine.eval(expresion).toString();
          resultado = String.format("%.2f", Float.valueOf(resultado)) ;  
        }catch(ScriptException e) {
            String error = e.getMessage();
            JOptionPane.showMessageDialog(null, "Error en expresión: " + expresion + " " + error);
            resultado = null;
        }catch(Exception e){
            String error = e.getMessage();
            JOptionPane.showMessageDialog(null, "Error genérico al evaluar expresión: " + error);
            resultado = null;                
        }
        return resultado;
    }
}
