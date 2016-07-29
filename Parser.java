/*
    Laboratorio No. 3 - Recursive Descent Parsing
    CC4 - Compiladores

    Clase que representa el parser
*/

import java.util.LinkedList;
import java.util.Stack;

public class Parser {

    // Puntero next que apunta al siguiente token
    private int next;
    // Stacks para evaluar online
    private Stack<Double> operandos;
    private Stack<Token> operadores;
    // LinkedList de tokens
    private LinkedList<Token> tokens;

    // Funcion que manda a llamar main para parsear la expresion
    public boolean parse(LinkedList<Token> tokens) {
        this.tokens = tokens;
        this.next = 0;
        this.operandos = new Stack<Double>();
        this.operadores = new Stack<Token>();
        while(S()) {System.out.println(this.operandos.peek());}
        if(this.next != this.tokens.size()) {
            return false;
        }
        return true;
    }

    // Verifica que el id sea igual que el id del token al que apunta next
    // Si si avanza el puntero es decir lo consume.
    private boolean term(int id) {
        if(this.next < this.tokens.size() && this.tokens.get(this.next).equals(id)) {
            this.next++;
            return true;
        }
        return false;
    }

    // Funcion que verifica la precedencia de un operador
    private int pre(Token op) {
        /* TODO: Su codigo aqui */
    }

    private void popOp() {
        Token op = this.operadores.pop();
        if(op.equals(Token.UNARY)) {
            /* TODO: Su codigo aqui */
        } else {
            /* TODO: Su codigo aqui */
        }
    }

    private void pushOp(Token op) {
        /* TODO: Su codigo aqui */
    }

    private boolean S() {
        return E() && term(Token.SEMI);
    }

    private boolean E() {
        return false;
    }

    /* TODO: sus otras funciones aqui */
}
