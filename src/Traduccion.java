import java.util.HashMap;
public class Traduccion extends GramaticaCoralBaseListener {

    //Tabla de simbolos para saber tipo de variables
    HashMap<String, String> table = new HashMap<>();

    //Nombre variable que se esta asignando actualmente
    String currentVariable = new String();

    //Saber si se esta haciendo una asignacion del size de un arreglo
    Boolean sizeAssign = new Boolean(false);

    @Override
    public void enterInit(GramaticaCoralParser.InitContext ctx) {
        /** Agregar los imports para las funciones predeterminadas*/
        System.out.println("import math");
        System.out.println("import random");
    }

    @Override
    public void enterDeclaration(GramaticaCoralParser.DeclarationContext ctx) {

        //Declarar nombre de la variable
        System.out.print(ctx.IDENTIFIER().getText() + "=");

        //Almacenar en la tabla segun tipo de dato del identificador
        table.put(ctx.IDENTIFIER().getText(), ctx.TYPE().getText());

        if(ctx.ARRAY() != null){
            /** Declarar un array float o integer */
            System.out.print("[");
            if(ctx.size().getText().compareTo("?") != 0){
                //Si la longitud del arreglo NO es signo de interrogacion
                if (ctx.TYPE().getText().compareTo("integer") == 0){
                    System.out.print("0]*");
                    System.out.println(ctx.size().getText());
                } else {
                    System.out.print("0.0]*");
                    System.out.println(ctx.size().getText());
                }
            }else{
                System.out.println("]");
            }

        }else{
            /** Declarar variable entera con 0 o variable float con 0.0 */
            //Decidir si hacerla igual a 0 o 0.0
            if (ctx.TYPE().getText().compareTo("integer") == 0) {
                System.out.println("0");
            } else {
                System.out.println("0.0");
            }
        }
    }

    @Override
    public void enterInput(GramaticaCoralParser.InputContext ctx) {
        //Almacenar la variable que se esta asignando actualmente
        currentVariable = ctx.variable().IDENTIFIER().getText();
        /** Declarar variable con input*/
        //Imprimir solo el identificador de la variable
        System.out.print(ctx.variable().IDENTIFIER().getText());
    }

    @Override
    public void exitInput(GramaticaCoralParser.InputContext ctx){
        //Imprimir el input y cerrar parentesis del casteo
        System.out.println("input())");
    }

    @Override
    public void enterSet(GramaticaCoralParser.SetContext ctx) {
        //Almacenar la variable que se esta asignando actualmente
        currentVariable = ctx.variable().IDENTIFIER().getText();

        //Verificar si es una asignación de un size
        if(ctx.variable().RSIZE() != null){
            sizeAssign = true;
        }

        /** Imprimir identificador de la variable*/
        System.out.print(ctx.variable().IDENTIFIER().getText());

    }

    @Override
    public void exitSet(GramaticaCoralParser.SetContext ctx) {
        /** Imprimir un salto de linea*/
        //Cerrar el parentesis del cast que se hace en la asignacion
        System.out.println(")");
    }

    @Override
    public void enterOutput(GramaticaCoralParser.OutputContext ctx) {
        /**Imprimir un print( */
        System.out.print("print(");
    }

    @Override
    public void exitOutput(GramaticaCoralParser.OutputContext ctx) {
        /** Cerrar el parentesis del print */
        System.out.println(", end='')");
    }

    @Override
    public void enterArithexpr(GramaticaCoralParser.ArithexprContext ctx) {
        /** Verificar si es un number o un variable, que son los casos base */
        if (ctx.number() != null) {
            System.out.print(ctx.number().getText());
        } else if (ctx.variable() != null) {
            System.out.print(ctx.variable().getText());
        }
    }

    @Override
    public void enterOutvalue(GramaticaCoralParser.OutvalueContext ctx) {
        if (ctx.STRING() != null) {
            System.out.print(ctx.STRING().getText());
        }
    }

    @Override
    public void enterComment(GramaticaCoralParser.CommentContext ctx) {
        //Comentario sin las barras laterales
        String comentario = ctx.COMMENT().getText().substring(2);
        //Comentario ya tiene salto de linea, por eso sin ln
        System.out.print("#"+comentario);
    }
    @Override
    public void enterSign(GramaticaCoralParser.SignContext ctx) {
        System.out.print(ctx.SUMOP().getText());
    }

    @Override
    public void enterPizq(GramaticaCoralParser.PizqContext ctx) {
        System.out.print(ctx.PIZQ().getText());
    }

    @Override
    public void enterPder(GramaticaCoralParser.PderContext ctx) {
        System.out.print(ctx.PDER().getText());
    }

    @Override
    public void enterSumop(GramaticaCoralParser.SumopContext ctx) {
        System.out.print(ctx.SUMOP().getText());
    }

    @Override
    public void enterMulop(GramaticaCoralParser.MulopContext ctx) {
        System.out.print(ctx.MULOP().getText());
    }

    @Override
    public void enterCizq(GramaticaCoralParser.CizqContext ctx){
        System.out.print(ctx.CIZQ().getText());
    }

    @Override
    public void enterCder(GramaticaCoralParser.CderContext ctx){
        System.out.print(ctx.CDER().getText());
    }

    @Override
    public void enterAssign(GramaticaCoralParser.AssignContext ctx){
        // Imprimir un signo igual
        System.out.print(ctx.ASSIGN().getText());

        //Obtener el tipo de la variable a asignar
        String variableType = table.get(currentVariable);

        //Verificar si se esta realizando una asignacion a un size
        if (sizeAssign){
            //Realizar el cast del resultado al tipo de la variable donde se asigna
            if (variableType.compareTo("integer") == 0) {
                System.out.print("[0]*int(");
            } else if (variableType.compareTo("float") == 0) {
                System.out.print("[0.0]*int(");
            }
            sizeAssign = false;
        } else {
            //Realizar el cast del resultado al tipo de la variable donde se asigna
            if (variableType.compareTo("integer") == 0) {
                System.out.print("int");
            } else if (variableType.compareTo("float") == 0) {
                System.out.print("float");
            }
            System.out.print("(");
        }

    }

}

