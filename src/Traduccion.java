import java.util.HashMap;
public class Traduccion extends GramaticaCoralBaseListener {

    //Tabla de simbolos para saber tipo de variables
    HashMap<String, String> table = new HashMap<>();

    @Override
    public void enterInit(GramaticaCoralParser.InitContext ctx) {
        /** Agregar los imports para las funciones predeterminadas*/
        System.out.println("import math");
        System.out.println("import random");
    }

    @Override
    public void enterDeclaration(GramaticaCoralParser.DeclarationContext ctx) {
        /** Declarar variable entera con 0 o variable float con 0.0 */
        //Declarar variable
        System.out.print(ctx.IDENTIFIER().getText() + "=");

        //Almacenar en la tabla como un integer
        table.put(ctx.IDENTIFIER().getText(), ctx.TYPE().getText());

        //Decidir si hacerla igual a 0 o 0.0
        if (ctx.TYPE().getText().compareTo("integer") == 0) {
            System.out.println("0");
        } else {
            System.out.println("0.0");
        }
    }

    @Override
    public void enterInput(GramaticaCoralParser.InputContext ctx) {
        /** Declarar variable con input*/
        System.out.println(ctx.variable().getText() + "=input()");
    }

    @Override
    public void enterSet(GramaticaCoralParser.SetContext ctx) {
        /** Imprimir unicamente la variable y un signo igual*/
        System.out.print(ctx.variable().getText());
        System.out.print(ctx.ASSIGN().getText());
        //Realizar el cast del resultado al tipo de la variable donde se asigna
        String variableType = table.get(ctx.variable().getText());
        if (variableType.compareTo("integer") == 0) {
            System.out.print("int");
        } else if (variableType.compareTo("float") == 0) {
            System.out.print("float");
        }
        System.out.print("(");
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

}

